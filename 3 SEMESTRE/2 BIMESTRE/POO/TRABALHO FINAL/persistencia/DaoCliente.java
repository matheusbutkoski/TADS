package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Cliente;
import util.DateUtils;

public class DaoCliente extends DAO {
    DateUtils data = new DateUtils();
    private DaoEndereco daoEndereco;

    public DaoCliente() {
        daoEndereco = new DaoEndereco();
    }

    public boolean salvar(Cliente cliente) {
        try {
                     
            String sql = "INSERT INTO cliente(\n"
                    + " id, nome, cpf, id_endereco)\n"
                    + " VALUES (?, ?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            cliente.setId(gerarProximoId("cliente"));
            ps.setInt(1, cliente.getId());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getCpf());                 
            
           daoEndereco.salvar(cliente.getEndereco());
           ps.setInt(4, cliente.getEndereco().getId());           

            ps.executeUpdate();
            System.out.println("Cliente cadastrado!!");
            return true;
        } catch (SQLException ex) {
            try {
                getConexao().rollback();
            } catch (SQLException ex1) {
                System.out.println("Falhar ao realizar RollBack");
            }
            System.out.println("Falha ao salvar Cliente\n" + ex.getMessage());
            return false;
        }
    }

    public boolean atualizar(Cliente cliente) {
        try {
            String sql = "UPDATE cliente\n"
                    + "SET nome=?, cpf=?, id_endereco=?\n"
                    + " WHERE id = " + cliente.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());                    
            
            
             daoEndereco.atualizar(cliente.getEndereco());
                ps.setInt(3, cliente.getEndereco().getId());
            

            ps.executeUpdate();
            System.out.println("Cliente editado!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar cliente!\n" + e.getMessage());
            return false;
        }
    }

     public Cliente carregarPorCPF(String cpfCliente) {
        Cliente cl = null;
        try {
            String sql = "SELECT * FROM cliente \n"
                    + "left join endereco as ed on cliente.id_endereco = ed.id_endereco"
                    + " where cliente.cpf = " + cpfCliente;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                cl = new Cliente();
                cl.setId(rs.getInt("id"));
                cl.setNome(rs.getString("nome"));
                cl.setCpf(rs.getString("cpf"));
            

                if (rs.getObject("id_endereco", Integer.class) != null) {
                    cl.getEndereco().setId(rs.getInt("id_endereco"));
                    cl.getEndereco().setCidade(rs.getString("cidade"));
                    cl.getEndereco().setRua(rs.getString("rua"));
                    cl.getEndereco().setNumero(rs.getInt("numero"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar cliente!\n"
                    + e.getMessage());
        }
        return cl;
    }

    public boolean remover(Cliente cliente) {
        try {
            String sql = "DELETE FROM cliente\n"
                    + " WHERE id =" + cliente.getId()
                    + "; ";// + daoEndereco.comandoSqlRemover(cliente.getEndereco());

            executeSql(sql);
            daoEndereco.remover(cliente.getEndereco());
            System.out.println("Cliente removido!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao remover cliente!\n" + e.getMessage());
            return false;
        }
    }
}
