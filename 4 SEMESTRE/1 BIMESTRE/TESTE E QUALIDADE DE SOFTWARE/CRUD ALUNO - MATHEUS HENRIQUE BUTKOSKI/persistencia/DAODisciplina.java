package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Disciplina;

public class DAODisciplina extends DAO {
    public boolean inserir(Disciplina disciplina){
        try{
        String sql = "INSERT INTO disciplina (descricao) VALUES (?)";
        PreparedStatement ps = criarPreparedStatement(sql);
        ps.setString(1, disciplina.getDescrição());


        ps.executeUpdate();

        System.out.println("Disciplina cadastrada!!");
            return true;
        }catch (SQLException ex) {
            try {
                getConexao().rollback();
            } catch (SQLException ex1) {
                System.out.println("Falhar ao realizar RollBack");
            }
            System.out.println("Falha ao salvar Disciplina\n" + ex.getMessage());
            return false;
        }
    }

    
    public boolean atualizar(Disciplina disciplina){
        try {
        String sql = "UPDATE disciplina SET cH=?, nome=? WHERE id="+ disciplina.getId();
        PreparedStatement ps = criarPreparedStatement(sql);
        ps.setString(1, disciplina.getDescrição());
        
        ps.executeUpdate();
        System.out.println("Disciplina editada!!");
        return true;
    } catch (SQLException e) {
        System.out.println("Falha ao editar Disciplina!\n" + e.getMessage());
        return false;
    }
    }

 
    public void remover(int id){
        try {
        String sql = "DELETE FROM disciplina WHERE id=?";
        PreparedStatement ps = criarPreparedStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("disciplina Removida!!");
    } catch (SQLException e) {
        System.out.println("Falha ao remover Disciplina!\n"
                + e.getMessage());
    }
    
    }

    public Disciplina buscarPorID(int id){
        Disciplina cl = null;
        try {
            String sql = "SELECT * FROM disciplina where id = " + id;           
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                cl = new Disciplina();
                cl.setId(rs.getInt("id"));
                cl.setDescrição(rs.getString("descricao"));
                    
    
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar Disciplina!\n"
                    + e.getMessage());
                   
        }

        return cl;
}
}
