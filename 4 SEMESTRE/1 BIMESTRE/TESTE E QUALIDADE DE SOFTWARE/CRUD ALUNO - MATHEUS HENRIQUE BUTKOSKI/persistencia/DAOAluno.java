package persistencia;

import java.sql.*;

import modelo.Aluno;
import modelo.AlunoCurso;

public class DAOAluno extends DAO {
private DAOAlunoCurso daoAlunoCurso = new DAOAlunoCurso();

    public DAOAluno() {
       
    }

    public boolean inserir(Aluno aluno){
        try{
        String sql = "INSERT INTO aluno (ra, nome) VALUES (?, ?)";
        PreparedStatement ps = criarPreparedStatement(sql);
        ps.setString(1, aluno.getRa());
        ps.setString(2, aluno.getNome());


        ps.executeUpdate();

        for(AlunoCurso curso: aluno.getCursos()){
            if(curso.getId() == 0){
                daoAlunoCurso.inserir(curso);
            }
        }

        System.out.println("Aluno cadastrado!!");
            return true;
        }catch (SQLException ex) {
            try {
                getConexao().rollback();
            } catch (SQLException ex1) {
                System.out.println("Falhar ao realizar RollBack");
            }
            System.out.println("Falha ao salvar Aluno\n" + ex.getMessage());
            return false;
        }
    }

    
    public boolean atualizar(Aluno aluno){
        try {
        String sql = "UPDATE aluno SET ra=?, nome=? WHERE id="+ aluno.getId();
        PreparedStatement ps = criarPreparedStatement(sql);
        ps.setString(1, aluno.getRa());
        ps.setString(2, aluno.getNome());
        
        ps.executeUpdate();
        System.out.println("Aluno editado!!");
        return true;
    } catch (SQLException e) {
        System.out.println("Falha ao editar Aluno!\n" + e.getMessage());
        return false;
    }
    }

 
    public void remover(String ra){
        try {
        String sql = "DELETE FROM aluno WHERE ra=?";
        PreparedStatement ps = criarPreparedStatement(sql);
        ps.setString(1, ra);
        ps.executeUpdate();
        System.out.println("Aluno Removido!!");
    } catch (SQLException e) {
        System.out.println("Falha ao remover Aluno!\n"
                + e.getMessage());
    }
    
    }

    public Aluno buscarPorRa(String ra){
        Aluno cl = null;
        try {
            String sql = "SELECT * FROM aluno where ra = " + ra;           
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                cl = new Aluno();
                cl.setId(rs.getInt("id"));
                cl.setNome(rs.getString("nome"));
                cl.setRa(rs.getString("ra"));      
    
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar Aluno!\n"
                    + e.getMessage());
                   
        }

        return cl;
}


}