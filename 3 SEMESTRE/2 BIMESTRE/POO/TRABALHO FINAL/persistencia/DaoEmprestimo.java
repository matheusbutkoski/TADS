package persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

import modelo.Emprestimo;
import util.DateUtils;

public class DaoEmprestimo extends DAO {
    DateUtils data = new DateUtils();
    DaoEndereco daoEndereco = new DaoEndereco();

    public boolean salvar(Emprestimo emprestimo) {
        try {

            String sql = "INSERT INTO emprestimo(\n"
                    + " id, id_livro, id_vendedor, id_cliente, data_emprestimo, data_termino, prazoDias, stats)\n"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            emprestimo.setId(gerarProximoId("emprestimo"));
            ps.setInt(1, emprestimo.getId());
            ps.setInt(2, emprestimo.getLivro().getId());
            ps.setInt(3, emprestimo.getVendedor().getId());
            ps.setInt(4, emprestimo.getCliente().getId());          
            ps.setString(5, data.formatarDataBD(emprestimo.getDataEmprestimo()));
            ps.setString(6  , data.formatarDataBD(emprestimo.getDataDevolucao()));
            ps.setInt(7, emprestimo.getPrazoDias());   
            ps.setString(8, emprestimo.getStatus());
           

            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            try {
                getConexao().rollback();
            } catch (SQLException ex1) {
                System.out.println("Falhar ao realizar RollBack");
            }
            System.out.println("Falha ao salvar emprestimo\n" + ex.getMessage());
            return false;
        }
    }

    public Emprestimo carregarPorID(int idEmprestimo) {
        Emprestimo emprestimo = new Emprestimo();
        try {
            String sql = "SELECT * FROM emprestimo \n"
                    + "join vendedor on  emprestimo.id_vendedor = vendedor.id "
                    + "join cliente on emprestimo.id_cliente = cliente.id "
                    + "join livro on emprestimo.id_livro = livro.id "
                    + " where emprestimo.id = " + idEmprestimo;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                emprestimo.setId(rs.getInt("id"));
                emprestimo.setDataEmprestimo(DateUtils.parseLocalDate(rs.getString("data_emprestimo")));
                emprestimo.setDataDevolucao(DateUtils.parseLocalDate(rs.getString("data_termino")));
                emprestimo.setPrazoDias(rs.getInt("prazoDias"));
                emprestimo.setStatus(rs.getString("stats"));

                if (rs.getObject("id_vendedor", Integer.class) != null) {
                    emprestimo.getVendedor().setId(rs.getInt("vendedor.id"));
                    emprestimo.getVendedor().setNome(rs.getString("vendedor.nome"));
                    emprestimo.getVendedor().setCpf(rs.getString("vendedor.cpf"));
                    emprestimo.getVendedor().setSalario(rs.getDouble("vendedor.salario"));

                    emprestimo.getCliente().setEndereco(daoEndereco.carregarEnderecoPorId(rs.getInt("vendedor.id_endereco"))); 
                }

                if (rs.getObject("id_cliente", Integer.class) != null) {
                    emprestimo.getCliente().setId(rs.getInt("cliente.id"));
                    emprestimo.getCliente().setNome(rs.getString("cliente.nome"));
                    emprestimo.getCliente().setCpf(rs.getString("cliente.cpf"));

                    emprestimo.getCliente().setEndereco(daoEndereco.carregarEnderecoPorId(rs.getInt("cliente.id_endereco"))); 
                    
                }

                if (rs.getObject("id_livro", Integer.class) != null){
                    emprestimo.getLivro().setId(rs.getInt("livro.id"));
                    emprestimo.getLivro().setTitulo(rs.getString("livro.titulo"));
                    emprestimo.getLivro().setAutor(rs.getString("livro.autor"));
                    emprestimo.getLivro().setEditora(rs.getString("livro.editora"));
                    emprestimo.getLivro().setNumPag(rs.getInt("livro.numPag"));

                    
                }
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar emprestimo!\n"
                    + e.getMessage());
        }
        return emprestimo;
    }

    public boolean atualizar(Emprestimo emprestimo) {
        try {
            String sql = "UPDATE emprestimo\n"
                    + "SET id_livro=?, id_vendedor=?, id_cliente=?, data_emprestimo=?, data_termino=?, prazoDias=?, stats=? \n"
                    + " WHERE id= " + emprestimo.getId();

            PreparedStatement ps = criarPreparedStatement(sql);

            ps.setInt(1, emprestimo.getLivro().getId());
            ps.setInt(2, emprestimo.getVendedor().getId());
            ps.setInt(3, emprestimo.getCliente().getId());          
            ps.setString(4, data.formatarDataBD(emprestimo.getDataEmprestimo()));
            ps.setString(5, data.formatarDataBD(emprestimo.getDataDevolucao()));
            ps.setInt(6, emprestimo.getPrazoDias());
            ps.setString(7, emprestimo.getStatus());   

            ps.executeUpdate();
            System.out.println("Emprestimo editado!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar emprestimo!\n" + e.getMessage());
            return false;
        }
    }

    public boolean remover(Emprestimo emprestimo) {
        try {
            String sql = "DELETE FROM emprestimo\n"
                    + " WHERE id =" + emprestimo.getId()
                    + "; ";
            executeSql(sql);
            System.out.println("Emprestimo removido!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao remover emprestimo!\n" + e.getMessage());
            return false;
        }
    }

    public ArrayList<Emprestimo> carregarListaEmprestimos(){
        ArrayList<Emprestimo> listaEmprestimos = new ArrayList<>();

        try {
            String sql = "SELECT * FROM emprestimo \n"
                    + "join vendedor on  emprestimo.id_vendedor = vendedor.id "
                    + "join cliente on emprestimo.id_cliente = cliente.id "
                    + "join livro on emprestimo.id_livro = livro.id "
                    + "join endereco on cliente.id_endereco = endereco.id_endereco";                    
            ResultSet rs = consultaSQL(sql);
            while (rs.next()) {
                Emprestimo emprestimo = new Emprestimo();

                emprestimo.setId(rs.getInt("id"));
                emprestimo.setDataEmprestimo(DateUtils.parseLocalDate(rs.getString("data_emprestimo")));
                emprestimo.setDataDevolucao(DateUtils.parseLocalDate(rs.getString("data_termino")));
                emprestimo.setPrazoDias(rs.getInt("prazoDias"));
                emprestimo.setStatus(rs.getString("stats"));

                if (rs.getObject("id_vendedor", Integer.class) != null) {
                    emprestimo.getVendedor().setId(rs.getInt("vendedor.id"));
                    emprestimo.getVendedor().setNome(rs.getString("vendedor.nome"));
                    emprestimo.getVendedor().setCpf(rs.getString("vendedor.cpf"));
                    emprestimo.getVendedor().setSalario(rs.getDouble("vendedor.salario"));

                    emprestimo.getCliente().setEndereco(daoEndereco.carregarEnderecoPorId(rs.getInt("vendedor.id_endereco"))); 
                }

                if (rs.getObject("id_cliente", Integer.class) != null) {
                    emprestimo.getCliente().setId(rs.getInt("cliente.id"));
                    emprestimo.getCliente().setNome(rs.getString("cliente.nome"));
                    emprestimo.getCliente().setCpf(rs.getString("cliente.cpf"));

                    emprestimo.getCliente().setEndereco(daoEndereco.carregarEnderecoPorId(rs.getInt("cliente.id_endereco")));                  
        
                    
                }

                if (rs.getObject("id_livro", Integer.class) != null){
                    emprestimo.getLivro().setId(rs.getInt("livro.id"));
                    emprestimo.getLivro().setTitulo(rs.getString("livro.titulo"));
                    emprestimo.getLivro().setAutor(rs.getString("livro.autor"));
                    emprestimo.getLivro().setEditora(rs.getString("livro.editora"));
                    emprestimo.getLivro().setNumPag(rs.getInt("livro.numPag"));

                    
                }
                listaEmprestimos.add(emprestimo);
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar emprestimo!\n"
                    + e.getMessage());
        }
        return listaEmprestimos;
    }
}
