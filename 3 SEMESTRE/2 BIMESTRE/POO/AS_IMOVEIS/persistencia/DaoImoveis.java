package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Imovel;
import modelo.ImovelRural;
import modelo.ImovelUrbano;
import util.DateUtils;

public class DaoImoveis extends DAO {
    DateUtils data = new DateUtils();
    private DaoEndereco daoEndereco;
    private DaoPessoa daoPessoa;

    public DaoImoveis() {
        daoEndereco = new DaoEndereco();
        daoPessoa = new DaoPessoa();
    }

   /*  public ArrayList<Imovel> carregarimovels() {
        ArrayList<Imovel> listaimovels = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM imovel left join endereco as ed on imovel.id_endereco = ed.id_endereco";
            ResultSet rs = consultaSQL(sql);
            while (rs.next()) {
                Imovel i = new Imovel();
                i.setId(rs.getInt("id"));
                i.setNome(rs.getString("nome"));
                i.setCpf(rs.getString("cpf"));
               

                if (rs.getObject("id_endereco", Integer.class) != null) {
                    p.getEndereco().setId(rs.getInt("id_endereco"));
                    p.getEndereco().setCidade(rs.getString("cidade"));
                    p.getEndereco().setRua(rs.getString("rua"));
                    p.getEndereco().setNumero(rs.getInt("numero"));
                }
                listaimovels.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Falha ao carregar imovels!\n" + e.getMessage());
        }
        return listaimovels;
    }

    public Imovel carregarPorId(int idimovel) {
        Imovel cl = null;
        try {
            String sql = "SELECT * FROM imovel \n"
                    + "left join endereco as ed on imovel.id_endereco = ed.id_endereco"
                    + " where imovel.id = " + idimovel;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                cl = new imovel();
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
            System.out.println("Falha ao carregar imovel!\n"
                    + e.getMessage());
        }
        return cl;
    }
*/
    public Imovel carregarPorMatricula(String matImovel) {
        Imovel cl = null;
        try {
            String sql = "SELECT * FROM imovel \n"
                    + "join endereco as ed on imovel.id_endereco = ed.id_endereco"
                    + " join pessoa as p on imovel.id_proprietario = p.id"
                    + " where imovel.matriculaImovel = " + matImovel;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                
                String t = rs.getString("tipo");

                if ( t.equals("Imovel Urbano")) {
                    
                    cl = new ImovelUrbano();

                } else if(t.equals("Imovel Rural")){    

                    cl = new ImovelRural();

                }

                cl.setId(rs.getInt("id"));
                cl.setMatriculaImovel(rs.getString("matriculaImovel"));
                cl.setTipo(rs.getString("tipo"));
                cl.setLargura(rs.getDouble("largura"));
                cl.setComprimento(rs.getDouble("comprimento"));
                cl.setValor(rs.getDouble("valor"));
                
            
                if (rs.getObject("id_proprietario", Integer.class) != null) {
                   cl.getProprietario().setId(rs.getInt("id"));
                   cl.getProprietario().setNome(rs.getString("nome"));
                   cl.getProprietario().setCpf(rs.getString("cpf"));
                   cl.getProprietario().setDataNasc(data.parseLocalDate(rs.getString("dataNasc")));
                }


                if (rs.getObject("id_endereco", Integer.class) != null) {
                    cl.getEndereco().setId(rs.getInt("id_endereco"));
                    cl.getEndereco().setCidade(rs.getString("cidade"));
                    cl.getEndereco().setRua(rs.getString("rua"));
                    cl.getEndereco().setNumero(rs.getInt("numero"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar imovel!\n"
                    + e.getMessage());
        }
        return cl;
    }

    public boolean salvar(Imovel imovel) {
        try {

            String sql = "INSERT INTO imovel(\n"
                    + " id, matriculaImovel, id_proprietario, id_endereco, tipo, largura, comprimento, valor, cadPro)\n"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            imovel.setId(gerarProximoId("imovel"));
            ps.setInt(1, imovel.getId());
            ps.setString(2, imovel.getMatriculaImovel());
            ps.setString(5, imovel.getTipo());
            ps.setDouble(6, imovel.getLargura());
            ps.setDouble(7, imovel.getComprimento());
            ps.setDouble(8, imovel.getValor());

                        
                        daoPessoa.salvar(imovel.getProprietario());
                        ps.setInt(3, imovel.getProprietario().getId());
                        
                        daoEndereco.salvar(imovel.getEndereco());          
                        ps.setInt(4, imovel.getEndereco().getId());
         
                        if (imovel instanceof ImovelRural) {
                            ImovelRural imovelRural = (ImovelRural) imovel;
                            ps.setString(9, imovelRural.getCadPro());
                        }else{
                            ps.setString(9, "Imovel não Rural");
                        }

            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            try {
                getConexao().rollback();
            } catch (SQLException ex1) {
                System.out.println("Falhar ao realizar RollBack");
            }
            System.out.println("Falha ao salvar imovel\n" + ex.getMessage());
            return false;
        }
    }

    public boolean atualizar(Imovel imovel) {
        try {
            String sql = "UPDATE imovel\n"
                    + "SET matriculaImovel=?, id_proprietario=?, id_endereco=?, largura=?, comprimento=?, valor=? \n"
                    + " WHERE id= " + imovel.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, imovel.getMatriculaImovel());
            ps.setDouble(4, imovel.getLargura());
            ps.setDouble(5, imovel.getComprimento());
            ps.setDouble(6, imovel.getValor());

          
            
            if (imovel.getEndereco() != null) {
                if (imovel.getEndereco().getId() == null) {
                    daoEndereco.salvar(imovel.getEndereco());
                } else {
                    daoEndereco.atualizar(imovel.getEndereco());
                }
                ps.setInt(3, imovel.getEndereco().getId());
            } else {
                ps.setObject(3, null);
            }

            if (imovel.getProprietario() != null) {
                if (imovel.getProprietario().getId() == null) {
                    daoPessoa.salvar(imovel.getProprietario());
                } else {
                    daoPessoa.atualizar(imovel.getProprietario());
                }

                ps.setInt(2, imovel.getProprietario().getId());
            } else {
                ps.setObject(2, null);
            }

            ps.executeUpdate();
            System.out.println("Imovel editado!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar imovel!\n" + e.getMessage());
            return false;
        }
    }

    public boolean remover(Imovel imovel) {
        try {
            String sql = "DELETE FROM imovel\n"
                    + " WHERE id =" + imovel.getId()
                    + "; ";// + daoEndereco.comandoSqlRemover(imovel.getEndereco());

            executeSql(sql);
            daoEndereco.remover(imovel.getEndereco());
            System.out.println("Imovel removido!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao remover imovel!\n" + e.getMessage());
            return false;
        }
    }


}