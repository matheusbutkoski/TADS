
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;
import model.AlunoCurso;

public class DaoAluno extends DAO{
    
    private DaoAlunoCurso daoAlunoCurso = new DaoAlunoCurso();
    private DaoCurso daoCurso;

    public DaoAluno() {
        daoCurso = new DaoCurso(this);
    }

    public DaoAluno(DaoCurso daoCurso) {
        this.daoCurso = daoCurso;
    }
    
    
    
    public void setarDadosViaResultSet(Aluno al, ResultSet rs) {
        try {
            al.setId(rs.getInt("idaluno"));
            al.setNome(rs.getString("nome"));
            al.setRa(rs.getString("ra"));
        } catch (SQLException e) {
            System.err.println("Falha ao setar dados do aluno!\n" + e.getMessage());
        }
    }

    public ArrayList<Aluno> carregarAlunos() {
        ArrayList<Aluno> alunos = new ArrayList<>();
        try {
            String sql = "SELECT aluno.id as idaluno, aluno.nome, ra" +
                        " FROM aluno ;"; 
                      
            ResultSet rs = consultaSQL(sql);
            while (rs.next()) {
                Aluno al = new Aluno();
                setarDadosViaResultSet(al, rs);

                alunos.add(al);
            }
        } catch (SQLException ex) {
            System.err.println("Falha ao carregar alunos!\n" + ex.getMessage());
        }
        return alunos;
    }
    
    public ArrayList<AlunoCurso> carregarAlunosDoCurso(int idCurso) {
        ArrayList<AlunoCurso> cursos = new ArrayList<>();
        try {
            String sql = "SELECT idaluno, nome, ra, idcurso, al_curso.id as idaluno_curso\n" +
                        " FROM aluno " +
                        " inner join aluno_curso as al_curso on aluno.id = idaluno \n" +
                        " where idcurso = "+ idCurso;
            ResultSet rs = consultaSQL(sql);
            while (rs.next()) {
                AlunoCurso alunoCurso = new AlunoCurso();
                setarDadosViaResultSet(alunoCurso.getAluno(), rs);
                daoAlunoCurso.setarDadosViaResultSet(alunoCurso, rs);

                cursos.add(alunoCurso);
            }
        } catch (SQLException ex) {
            System.err.println("Falha ao carregar cursos do aluno!\n" + ex.getMessage());
        }
        return cursos;
    }

    public Aluno carregarAlunoPorId(int idAluno) {
        Aluno al = null;
        try {
            String sql = "select * from aluno where id = " + idAluno;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                al = new Aluno();
                setarDadosViaResultSet(al, rs);
                al.setCursos(daoCurso.carregarCursosDoAluno(idAluno));
            }
        } catch (SQLException ex) {
            System.out.println("Falha ao carregar aluno!\n" + ex.getMessage());
        }
        return al;
    }

    
    public boolean salvar(Aluno aluno){
        try {
            String sql = "insert into aluno (id, nome, ra) values (?,?,?)";
            
            PreparedStatement ps = criarPreparedStatement(sql);
            aluno.setId(gerarProximoId("aluno"));
            
            ps.setInt(1, aluno.getId());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getRa());
            
            ps.executeUpdate();
            
            //salavar relação aluno curso
            for (AlunoCurso curso : aluno.getCursos()) {
                if(curso.getId()== null ){
                    daoAlunoCurso.salvar(curso);
                }
            }
            
            ps.close();
            return true;
            
        } catch (SQLException ex) {
            try {
                getConexao().rollback();
            } catch (SQLException ex1) {
                System.err.println("Falhar ao realizar RollBack");
            }
            System.err.println("Falha ao salvar Aluno\n" + ex.getMessage());
            return false;
        }
    }
    
    public boolean atualizar(Aluno aluno) {
        try {
            String sql = "UPDATE aluno\n"
                    + "SET nome=?, ra=? \n"
                    + " WHERE id= " + aluno.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getRa());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Falha ao editar aluno!\n" + e.getMessage());
            return false;
        }
    }

    public boolean remover(Aluno aluno) {
        try {
            
            String sql = "DELETE FROM aluno_curso WHERE idaluno = " + aluno.getId()+";\n"
                    + "DELETE FROM aluno\n"
                    + " WHERE id =" + aluno.getId()+";\n";

            executeSql(sql);
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao remover Aluno!\n" + e.getMessage());
            return false;
        }
    }
}
