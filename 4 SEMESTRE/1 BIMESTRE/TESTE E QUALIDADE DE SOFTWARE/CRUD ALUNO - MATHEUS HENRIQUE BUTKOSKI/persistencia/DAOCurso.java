package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Curso;

public class DAOCurso extends DAO {
    public boolean inserir(Curso curso){
        try{
        String sql = "INSERT INTO curso (nome, carga_horaria) VALUES (?, ?)";
        PreparedStatement ps = criarPreparedStatement(sql);
        ps.setInt(2, curso.getCargaHoraria());
        ps.setString(1, curso.getNome());


        ps.executeUpdate();

        System.out.println("curso cadastrado!!");
            return true;
        }catch (SQLException ex) {
            try {
                getConexao().rollback();
            } catch (SQLException ex1) {
                System.out.println("Falhar ao realizar RollBack");
            }
            System.out.println("Falha ao salvar curso\n" + ex.getMessage());
            return false;
        }
    }

    
    public boolean atualizar(Curso curso){
        try {
        String sql = "UPDATE curso SET carga_horaria=?, nome=? WHERE id="+ curso.getId();
        PreparedStatement ps = criarPreparedStatement(sql);
        ps.setInt(2, curso.getCargaHoraria());
        ps.setString(1, curso.getNome());
        
        ps.executeUpdate();
        System.out.println("Curso editado!!");
        return true;
    } catch (SQLException e) {
        System.out.println("Falha ao editar curso!\n" + e.getMessage());
        return false;
    }
    }

 
    public void remover(String nome){
        try {
        String sql = "DELETE FROM curso WHERE nome=?";
        PreparedStatement ps = criarPreparedStatement(sql);
        ps.setString(1, nome);
        ps.executeUpdate();
        System.out.println("curso Removido!!");
    } catch (SQLException e) {
        System.out.println("Falha ao remover curso!\n"
                + e.getMessage());
    }
    
    }

    public Curso buscarPorNome(String pesquisa){
        Curso cl = null;
        try {
            String sql = "SELECT * FROM curso WHERE nome like"+"'"+pesquisa+"'";         
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                cl = new Curso();
                cl.setId(rs.getInt("id"));
                cl.setNome(rs.getString("nome"));
                cl.setCargaHoraria(rs.getInt("carga_horaria"));      
    
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar curso!\n"
                    + e.getMessage());
                   
        }

        return cl;
}
}
