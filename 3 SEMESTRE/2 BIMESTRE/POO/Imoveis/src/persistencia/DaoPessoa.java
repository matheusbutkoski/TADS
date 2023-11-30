package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Pessoa;

/**
 *
 * @author ANDRE.LUCHESI
 */
public class DaoPessoa extends DAO {

   // private DaoEndereco daoEndereco;

    public DaoPessoa() {
        //daoEndereco = new DaoEndereco();
    }

    public ArrayList<Pessoa> carregarPessoas() {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM pessoa left join endereco as ed on id_endereco = ed.id";
            ResultSet rs = consultaSQL(sql);
            while (rs.next()) {
                Pessoa p = new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));
                p.setTelefone(rs.getString("telefone"));

                if (rs.getObject("id_endereco", Integer.class) != null) {
                    p.getEndereco().setId(rs.getInt("id_endereco"));
                    p.getEndereco().setCidade(rs.getString("cidade"));
                    p.getEndereco().setRua(rs.getString("rua"));
                    p.getEndereco().setNumero(rs.getString("numero"));
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
                    + "left join endereco as ed on id_endereco = ed.id"
                    + " where pessoa.id = " + idPessoa;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                cl = new Pessoa();
                cl.setId(rs.getInt("id"));
                cl.setNome(rs.getString("nome"));
                cl.setCpf(rs.getString("cpf"));
                cl.setTelefone(rs.getString("telefone"));

                if (rs.getObject("id_endereco", Integer.class) != null) {
                    cl.getEndereco().setId(rs.getInt("id_endereco"));
                    cl.getEndereco().setCidade(rs.getString("cidade"));
                    cl.getEndereco().setRua(rs.getString("rua"));
                    cl.getEndereco().setNumero(rs.getString("numero"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar pessoa!\n"
                    + e.getMessage());
        }
        return cl;
    }

    public boolean salvar(Pessoa pessoa) {
        try {
            String sql = "INSERT INTO pessoa(\n"
                    + " id, nome, cpf, telefone, id_endereco)\n"
                    + " VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            pessoa.setId(gerarProximoId("pessoa"));
            ps.setInt(1, pessoa.getId());
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getCpf());
           // ps.setString(4, pessoa.getDataNasc());

            if (pessoa.getEndereco() != null) {
                if (pessoa.getEndereco().getId() == null || pessoa.getEndereco().getId() == 0) {
                 daoEndereco.salvar(pessoa.getEndereco());
                }
                ps.setInt(5, pessoa.getEndereco().getId());
            } else {
                ps.setObject(5, null);
            }
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            try {
                getConexao().rollback();
            } catch (SQLException ex1) {
                System.out.println("Falhar ao realizar RollBack");
            }
            System.out.println("Falha ao salvar Pessoa\n" + ex.getMessage());
            return false;
        }
    }

    public boolean atualizar(Pessoa pessoa) {
        try {
            String sql = "UPDATE pessoa\n"
                    + "SET nome=?, cpf=?, telefone=?, id_endereco=? \n"
                    + " WHERE id= " + pessoa.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
            ps.setString(3, pessoa.getTelefone());
            
            if (pessoa.getEndereco() != null) {
                if (pessoa.getEndereco().getId() != null) {
                    daoEndereco.salvar(pessoa.getEndereco());
                } else {
                    daoEndereco.atualizar(pessoa.getEndereco());
                }
                ps.setInt(4, pessoa.getEndereco().getId());
            } else {
                ps.setObject(4, null);
            }

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar pessoa!\n" + e.getMessage());
            return false;
        }
    }

    public boolean remover(Pessoa pessoa) {
        try {
            String sql = "DELETE FROM pessoa\n"
                    + " WHERE id =" + pessoa.getId()
                    + "; " + daoEndereco.comandoSqlRemover(pessoa.getEndereco());

            executeSql(sql);
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao remover pessoa!\n" + e.getMessage());
            return false;
        }
    }
}
