package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.AlunoCurso;
import model.Curso;

/**
 *
 * @author Andre
 */
public class DaoCurso extends DAO {

    private DaoAlunoCurso daoAlunoCurso = new DaoAlunoCurso();
    private DaoAluno daoAluno;

    public DaoCurso() {
        this.daoAluno = new DaoAluno(this);
    }

    public DaoCurso(DaoAluno daoAluno) {
        this.daoAluno = daoAluno;
    }

    public void setarDadosViaResultSet(Curso cur, ResultSet rs) {
        try {
            cur.setId(rs.getInt("idcurso"));
            cur.setNome(rs.getString("nome"));
            cur.setCargaHoraria(rs.getInt("carga_horaria"));
        } catch (SQLException e) {
            System.err.println("Falha ao setar dados do curso!\n" + e.getMessage());
        }
    }

    public ArrayList<Curso> carregarCursos() {
        ArrayList<Curso> cursos = new ArrayList<>();
        try {
            String sql = "SELECT id as idcurso, nome, carga_horaria "
                    + " FROM public.curso;";
            ResultSet rs = consultaSQL(sql);
            while (rs.next()) {
                Curso end = new Curso();
                setarDadosViaResultSet(end, rs);

                cursos.add(end);
            }
        } catch (SQLException ex) {
            System.err.println("Falha ao carregar cursos!\n" + ex.getMessage());
        }
        return cursos;
    }

    public ArrayList<AlunoCurso> carregarCursosDoAluno(int idAluno) {
        ArrayList<AlunoCurso> cursos = new ArrayList<>();
        try {
            String sql = "SELECT idcurso, nome, carga_horaria, idaluno, al_curso.id as idaluno_curso\n"
                    + " FROM curso "
                    + " inner join aluno_curso as al_curso on curso.id = idcurso \n"
                    + " where idaluno = " + idAluno;
            ResultSet rs = consultaSQL(sql);
            while (rs.next()) {
                AlunoCurso alunoCurso = new AlunoCurso();
                setarDadosViaResultSet(alunoCurso.getCurso(), rs);
                daoAlunoCurso.setarDadosViaResultSet(alunoCurso, rs);

                cursos.add(alunoCurso);
            }
        } catch (SQLException ex) {
            System.err.println("Falha ao carregar cursos do aluno!\n" + ex.getMessage());
        }
        return cursos;
    }

    public Curso carregarCursoPorId(int idCurso) {
        Curso al = null;
        try {
            String sql = "select * from aluno where id = " + idCurso;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                al = new Curso();
                setarDadosViaResultSet(al, rs);
                al.setAlunos(daoAluno.carregarAlunosDoCurso(idCurso));
            }
        } catch (SQLException ex) {
            System.out.println("Falha ao carregar aluno!\n" + ex.getMessage());
        }
        return al;
    }

    public boolean salvar(Curso curso) {
        try {
            String sql = "insert into curso (id, nome, carga_horaria) values (?,?,?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            curso.setId(gerarProximoId("curso"));

            ps.setInt(1, curso.getId());
            ps.setString(2, curso.getNome());
            ps.setInt(3, curso.getCargaHoraria());

            ps.executeUpdate();

            ps.close();
            return true;

        } catch (SQLException ex) {
            try {
                getConexao().rollback();
            } catch (SQLException ex1) {
                System.err.println("Falhar ao realizar RollBack");
            }
            System.err.println("Falha ao salvar Curso\n" + ex.getMessage());
            return false;
        }
    }

    public boolean atualizar(Curso curso) {
        try {
            String sql = "UPDATE aluno\n"
                    + "SET nome=?, carga_horaria=? \n"
                    + " WHERE id= " + curso.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, curso.getNome());
            ps.setInt(2, curso.getCargaHoraria());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Falha ao editar curso!\n" + e.getMessage());
            return false;
        }
    }

    public boolean remover(Curso curso) {
        try {

            String sql = "DELETE FROM curso\n"
                    + " WHERE id =" + curso.getId() + ";\n";

            executeSql(sql);
            return true;
        } catch (SQLException e) {
            System.err.println("Falha ao remover Curso!\n" + e.getMessage());
            return false;
        }
    }

}
