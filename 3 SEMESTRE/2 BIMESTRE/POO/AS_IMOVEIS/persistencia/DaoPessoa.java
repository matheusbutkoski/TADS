package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Pessoa;
import util.DateUtils;

public class DaoPessoa extends DAO {
    DateUtils data = new DateUtils();
    private DaoEndereco daoEndereco;

    public DaoPessoa() {
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

    public Pessoa carregarPorCPF(String cpfPessoa) {
        Pessoa cl = null;
        try {
            String sql = "SELECT * FROM pessoa \n"
                    + "left join endereco as ed on pessoa.id_endereco = ed.id_endereco"
                    + " where pessoa.cpf = " + cpfPessoa;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                cl = new Pessoa();
                cl.setId(rs.getInt("id"));
                cl.setNome(rs.getString("nome"));
                cl.setCpf(rs.getString("cpf"));
                cl.setDataNasc(data.parseLocalDate(rs.getString("dataNasc")));
            

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

    public boolean salvar(Pessoa pessoa) {
        try {

            String sql = "INSERT INTO pessoa(\n"
                    + " id, nome, cpf, dataNasc, id_endereco)\n"
                    + " VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            pessoa.setId(gerarProximoId("pessoa"));
            ps.setInt(1, pessoa.getId());
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getCpf());
            ps.setString(4, data.formatarDataBD(pessoa.getDataNasc()));

            //if (pessoa.getEndereco() != null) {
              //  if (pessoa.getEndereco().getId() == null || pessoa.getEndereco().getId() == 0) {
                        daoEndereco.salvar(pessoa.getEndereco());
              //
                        ps.setInt(5, pessoa.getEndereco().getId());
           // } else {
             //   ps.setObject(4, null);
          //  }

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
                    + "SET nome=?, cpf=?, id_endereco=?, dataNasc=? \n"
                    + " WHERE id= " + pessoa.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
            ps.setString(4, data.formatarDataBD(pessoa.getDataNasc()));
          
            
            if (pessoa.getEndereco() != null) {
                if (pessoa.getEndereco().getId() != null) {
                    daoEndereco.salvar(pessoa.getEndereco());
                } else {
                    daoEndereco.atualizar(pessoa.getEndereco());
                }
                ps.setInt(3, pessoa.getEndereco().getId());
            } else {
                ps.setObject(3, null);
            }

            ps.executeUpdate();
            System.out.println("Pessoa editada!!");
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
                    + "; ";// + daoEndereco.comandoSqlRemover(pessoa.getEndereco());

            executeSql(sql);
            daoEndereco.remover(pessoa.getEndereco());
            System.out.println("Pessoa removido!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao remover pessoa!\n" + e.getMessage());
            return false;
        }
    }


}