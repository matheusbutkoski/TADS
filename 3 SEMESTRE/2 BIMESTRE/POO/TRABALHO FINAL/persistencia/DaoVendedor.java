package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Vendedor;

public class DaoVendedor extends DAO {
   
    private DaoEndereco daoEndereco;

    public DaoVendedor() {
        daoEndereco = new DaoEndereco();
    } 

    public boolean salvar(Vendedor vendedor) {
        try {
                     
            String sql = "INSERT INTO vendedor(\n"
                    + " id, nome, cpf, salario, id_endereco)\n"
                    + " VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            vendedor.setId(gerarProximoId("vendedor"));
            ps.setInt(1, vendedor.getId());
            ps.setString(2, vendedor.getNome());        
            ps.setString(3, vendedor.getCpf());     
              
            ps.setDouble(4, vendedor.getSalario()); 
             
            
            daoEndereco.salvar(vendedor.getEndereco());
           ps.setInt(5, vendedor.getEndereco().getId());

            ps.executeUpdate();
            System.out.println("vendedor Cadastrado!!");
            return true;
        } catch (SQLException ex) {
            try {
                getConexao().rollback();
            } catch (SQLException ex1) {
                System.out.println("Falhar ao realizar RollBack");
            }
            System.out.println("Falha ao salvar Vendedor\n" + ex.getMessage());
            return false;
        }
    }

    public boolean atualizar(Vendedor vendedor) {
        try {
            String sql = "UPDATE vendedor\n"
                    + "SET nome=?, cpf=?, id_endereco=?, salario=?\n"
                    + " WHERE id= " + vendedor.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, vendedor.getNome());
            ps.setString(2, vendedor.getCpf());
           
            ps.setDouble(4, vendedor.getSalario()); 
                
            
                daoEndereco.atualizar(vendedor.getEndereco());
                ps.setInt(3, vendedor.getEndereco().getId());
           

            ps.executeUpdate();
            System.out.println("Vendedor editado!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar vendedor!\n" + e.getMessage());
            return false;
        }
    }

    public Vendedor carregarPorCPF(String cpfVendedor) {
        Vendedor ve = null;
        try {
            String sql = "SELECT * FROM vendedor \n"
                    + "left join endereco as ed on vendedor.id_endereco = ed.id_endereco"
                    + " where vendedor.cpf = " + cpfVendedor;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                ve = new Vendedor();
                ve.setId(rs.getInt("id"));
                ve.setNome(rs.getString("nome"));
                ve.setCpf(rs.getString("cpf"));
                ve.setSalario(rs.getDouble("salario"));
            

                if (rs.getObject("id_endereco", Integer.class) != null) {
                    ve.getEndereco().setId(rs.getInt("id_endereco"));
                    ve.getEndereco().setCidade(rs.getString("cidade"));
                    ve.getEndereco().setRua(rs.getString("rua"));
                    ve.getEndereco().setNumero(rs.getInt("numero"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar Vendedor!\n"
                    + e.getMessage());
        }
        return ve;
    }

    public boolean remover(Vendedor vendedor) {
        try {
            String sql = "DELETE FROM vendedor\n"
                    + " WHERE id =" + vendedor.getId()
                    + "; ";// + daoEndereco.comandoSqlRemover(vendedor.getEndereco());

            executeSql(sql);
            daoEndereco.remover(vendedor.getEndereco());
            System.out.println("Vendedor removido!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao remover vendedor!\n" + e.getMessage());
            return false;
        }
    }
}
