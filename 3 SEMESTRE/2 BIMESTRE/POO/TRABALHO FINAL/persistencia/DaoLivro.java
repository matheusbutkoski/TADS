package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Livro;
import util.DateUtils;

public class DaoLivro extends DAO {
    DateUtils data = new DateUtils();

    public DaoLivro() {
    }

    public boolean salvar(Livro livro) {
        try {
                     
            String sql = "INSERT INTO livro(\n" 
                    + " id, titulo, autor, editora, numPag)\n"
                    + " VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            livro.setId(gerarProximoId("livro"));
            ps.setInt(1, livro.getId());
            ps.setString(2, livro.getTitulo());
            ps.setString(3, livro.getAutor());
            ps.setString(4, livro.getEditora());
            ps.setInt(5, livro.getNumPag());
            ps.executeUpdate();
            System.out.println("Livro cadastrado!!");

            return true;
        } catch (SQLException ex) {
            try {
                getConexao().rollback();
            } catch (SQLException ex1) {
                System.out.println("Falhar ao realizar RollBack");
            }
            System.out.println("Falha ao salvar livro\n" + ex.getMessage());
            return false;
        }
    }

    public boolean atualizar(Livro livro) {
        try {
            String sql = "UPDATE livro\n"
                    + "SET titulo=?, autor=?, editora=?, numPag=? \n"
                    + " WHERE id= " + livro.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, livro.getTitulo());
            ps.setString(2, livro.getAutor());
            ps.setString(3, livro.getEditora());
            ps.setInt(4, livro.getNumPag());

            ps.executeUpdate();
            System.out.println("Livro editado!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar livro!\n" + e.getMessage());
            return false;
        }
    }

     public Livro carregarPorID(int idLivro) {
        Livro liv = null;
        try {
            String sql = "SELECT * FROM livro \n"
                    + " where livro.id = " + idLivro;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                liv = new Livro();
                liv.setId(rs.getInt("id"));
                liv.setTitulo(rs.getString("titulo"));
                liv.setAutor(rs.getString("autor"));
                liv.setEditora(rs.getString("editora"));
                liv.setNumPag(rs.getInt("numPag"));

            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar livro!\n"
                    + e.getMessage());
        }
        return liv;
    }

    public boolean remover(Livro livro) {
        try {
            String sql = "DELETE FROM livro\n"
                    + " WHERE id =" + livro.getId()
                    + "; ";

            executeSql(sql);
            System.out.println("Livro removido!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao remover livro!\n" + e.getMessage());
            return false;
        }
    }

    public ArrayList<Livro> carregarListaLivros(){
        ArrayList<Livro> listaLivros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM livro";
            ResultSet rs = consultaSQL(sql);
            while (rs.next()) {
                Livro liv = new Livro();
                liv.setId(rs.getInt("id"));
                liv.setTitulo(rs.getString("titulo"));
                liv.setAutor(rs.getString("autor"));
                liv.setEditora(rs.getString("editora"));
                liv.setNumPag(rs.getInt("numPag"));

                listaLivros.add(liv);
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar livro!\n"
                    + e.getMessage());
        }
        return listaLivros;

    }
}
