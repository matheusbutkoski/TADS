package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Pessoa;
import modelo.Vendedor;
import util.DateUtils;

public class DaoVendedor extends DAO {
    DateUtils data = new DateUtils();
    private DaoEndereco daoEndereco;

    public DaoVendedor() {
        daoEndereco = new DaoEndereco();
    }

    public ArrayList<Pessoa> carregarPessoas() {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM pessoa left join endereco as ed on pessoa.id_endereco = ed.id_endereco";
            ResultSet rs = consultaSQL(sql);
            while (rs.next()) {
                Pessoa p = new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));
               

                if (rs.getObject("id_endereco", Integer.class) != null) {
                    p.getEndereco().setId(rs.getInt("id_endereco"));
                    p.getEndereco().setCidade(rs.getString("cidade"));
                    p.getEndereco().setRua(rs.getString("rua"));
                    p.getEndereco().setNumero(rs.getInt("numero"));
                }
                listaPessoas.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Falha ao carregar pessoas!\n" + e.getMessage());
        }
        return listaPessoas;
    }

    public Pessoa carregarPorId(int idPessoa) {
        Pessoa cl = null;
        try {
            String sql = "SELECT * FROM pessoa \n"
                    + "left join endereco as ed on pessoa.id_endereco = ed.id_endereco"
                    + " where pessoa.id = " + idPessoa;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                cl = new Pessoa();
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
            System.out.println("Falha ao carregar pessoa!\n"
                    + e.getMessage());
        }
        return cl;
    }

    public boolean salvar(Vendedor vendedor) {
        try {
                     
            String sql = "INSERT INTO vendedor(\n"
                    + " id, nome, cpf, percentual_comissao, salario, id_endereco, dataNasc)\n"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            vendedor.setId(gerarProximoId("vendedor"));
            ps.setInt(1, vendedor.getId());
            ps.setString(2, vendedor.getNome());        
            ps.setString(3, vendedor.getCpf());     
            ps.setDouble(4, vendedor.getPercentualComissao());    
            ps.setDouble(5, vendedor.getSalario()); 
            ps.setString(4, data.formatarDataBD(vendedor.getDataNasc()));  
            
            daoEndereco.salvar(vendedor.getEndereco());
           ps.setInt(6, vendedor.getEndereco().getId());

            ps.executeUpdate();

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
                    + "SET nome=?, cpf=?, id_endereco=?, percentual_comissao=?, salario=?, dataNasc=?  \n"
                    + " WHERE id= " + vendedor.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, vendedor.getNome());
            ps.setString(2, vendedor.getCpf());
            ps.setDouble(4, vendedor.getPercentualComissao());
            ps.setDouble(5, vendedor.getSalario()); 
            ps.setString(6, data.formatarDataBD(vendedor.getDataNasc()));
            
            //  ps.setString(4, (pessoa.getDataNasc()));    
          
            
            if (vendedor.getEndereco() != null) {
                if (vendedor.getEndereco().getId() != null) {
                    daoEndereco.salvar(vendedor.getEndereco());
                } else {
                    daoEndereco.atualizar(vendedor.getEndereco());
                }
                ps.setInt(3, vendedor.getEndereco().getId());
            } else {
                ps.setObject(3, null);
            }

            ps.executeUpdate();
            System.out.println("Vendedor editado!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar vendedor!\n" + e.getMessage());
            return false;
        }
    }

    public Vendedor carregarPorCPF(String cpfVendedor) {
        Vendedor cl = null;
        try {
            String sql = "SELECT * FROM vendedor \n"
                    + "left join endereco as ed on vendedor.id_endereco = ed.id_endereco"
                    + " where Vendedor.cpf = " + cpfVendedor;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                cl = new Vendedor();
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
            System.out.println("Falha ao carregar Vendedor!\n"
                    + e.getMessage());
        }
        return cl;
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
