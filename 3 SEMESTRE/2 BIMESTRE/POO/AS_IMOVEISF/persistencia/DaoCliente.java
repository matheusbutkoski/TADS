package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Cliente;
import modelo.Pessoa;
import util.DateUtils;

public class DaoCliente extends DAO {
    DateUtils data = new DateUtils();
    private DaoEndereco daoEndereco;

    public DaoCliente() {
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

    public boolean salvar(Cliente cliente) {
        try {

            String sql = "INSERT INTO cliente(\n"
                    + " id, nome, cpf, id_endereco, dataNasc)\n"
                    + " VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            cliente.setId(gerarProximoId("cliente"));
            ps.setInt(1, cliente.getId());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getCpf());
            ps.setString(5, data.formatarDataBD(cliente.getDataNasc()));

            daoEndereco.salvar(cliente.getEndereco());
            ps.setInt(4, cliente.getEndereco().getId());

            ps.executeUpdate();

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
                    + "SET nome=?, cpf=?, id_endereco=?, dataNasc=? \n"
                    + " WHERE id= " + cliente.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(4, data.formatarDataBD(cliente.getDataNasc()));

            if (cliente.getEndereco() != null) {
                if (cliente.getEndereco().getId() != null) {
                    daoEndereco.salvar(cliente.getEndereco());
                } else {
                    daoEndereco.atualizar(cliente.getEndereco());
                }
                ps.setInt(3, cliente.getEndereco().getId());
            } else {
                ps.setObject(3, null);
            }

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
                cl.setDataNasc(DateUtils.parseLocalDate(rs.getString("dataNasc")));

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
                    + "; ";

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
