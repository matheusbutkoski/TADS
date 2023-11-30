package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.ContratoLocacao;
import modelo.Imovel;
import modelo.ImovelRural;
import modelo.ImovelUrbano;
import util.DateUtils;

public class DaoContratoLocacao extends DAO {

    DateUtils data = new DateUtils();

    private DaoVendedor daoVendedor;
    private DaoCliente daoCliente;
    private DaoImoveis daoImoveis;

    public DaoContratoLocacao() {
        daoVendedor = new DaoVendedor();
        daoCliente = new DaoCliente();
        daoImoveis = new DaoImoveis();
    }

    public boolean salvar(ContratoLocacao contrato) {
        try {

            String sql = "INSERT INTO contrato_locacao(\n"
                    + " id, id_funcionario, id_cliente, id_imovel, valor, data_inicio, data_termino, percentual_multa)\n"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            contrato.setId(gerarProximoId("contrato_locacao"));
            ps.setInt(1, contrato.getId());
            ps.setInt(2, contrato.getFuncionario().getId());
            ps.setInt(3, contrato.getCliente().getId());
            ps.setInt(4, contrato.getImovel().getId());
            ps.setDouble(5, contrato.getValor());
            ps.setString(6, data.formatarDataBD(contrato.getDataInicio()));
            ps.setString(7, data.formatarDataBD(contrato.getDataTermino()));
            ps.setDouble(8, contrato.getPercentualMulta());

            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            try {
                getConexao().rollback();
            } catch (SQLException ex1) {
                System.out.println("Falhar ao realizar RollBack");
            }
            System.out.println("Falha ao salvar Contrato\n" + ex.getMessage());
            return false;
        }
    }

    public ContratoLocacao carregarPorId(int idContrato) {
        ContratoLocacao contrato = new ContratoLocacao();
        try {
            String sql = "SELECT * FROM contrato_locacao \n"
                    + "join vendedor on  contrato_locacao.id_funcionario = vendedor.id "
                    + "join cliente on contrato_locacao.id_cliente = cliente.id "
                    + "join imovel on contrato_locacao.id_imovel = imovel.id "
                    + " where contrato_locacao.id = " + idContrato;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                contrato.setId(rs.getInt("id"));
                contrato.setValor(rs.getDouble("valor"));
                contrato.setDataInicio(DateUtils.parseLocalDate(rs.getString("data_inicio")));
                contrato.setDataTermino(DateUtils.parseLocalDate(rs.getString("data_termino")));
                contrato.setPercentualMulta(rs.getDouble("percentual_multa"));

                if (rs.getObject("id_funcionario", Integer.class) != null) {
                    contrato.getFuncionario().setId(rs.getInt("vendedor.id"));
                    contrato.getFuncionario().setNome(rs.getString("vendedor.nome"));
                    contrato.getFuncionario().setCpf(rs.getString("vendedor.cpf"));
                    contrato.getFuncionario().setDataNasc(DateUtils.parseLocalDate(rs.getString("vendedor.dataNasc")));
                    contrato.getFuncionario().setPercentualComissao(rs.getDouble("vendedor.percentual_comissao"));
                    contrato.getFuncionario().setSalario(rs.getDouble("vendedor.salario"));
                }

                if (rs.getObject("id_cliente", Integer.class) != null) {
                    contrato.getCliente().setId(rs.getInt("cliente.id"));
                    contrato.getCliente().setNome(rs.getString("cliente.nome"));
                    contrato.getCliente().setCpf(rs.getString("cliente.cpf"));
                    contrato.getCliente().setDataNasc(DateUtils.parseLocalDate(rs.getString("cliente.dataNasc")));
                }

                Imovel imovel = null;

                if (rs.getObject("id_imovel", Integer.class) != null) {
                    if (rs.getString("tipo") == "Imovel Rural") {
                        imovel = new ImovelRural();
                    } else {
                        imovel = new ImovelUrbano();
                    }

                    imovel.setId(rs.getInt("id"));
                    imovel.setMatriculaImovel(rs.getString("matriculaImovel"));
                    imovel.setTipo(rs.getString("tipo"));
                    imovel.setLargura(rs.getDouble("largura"));
                    imovel.setComprimento(rs.getDouble("comprimento"));
                    imovel.setValor(rs.getDouble("valor"));

                    contrato.setImovel(imovel);
                }
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar contrato!\n"
                    + e.getMessage());
        }
        return contrato;
    }

    public boolean atualizar(ContratoLocacao contrato) {
        try {
            String sql = "UPDATE contrato_locacao\n"
                    + "SET id_funcionario=?, id_cliente=?, id_imovel=?, valor=?, data_inicio=?, data_termino=?, percentual_multa=? \n"
                    + " WHERE id= " + contrato.getId();

            PreparedStatement ps = criarPreparedStatement(sql);

            ps.setInt(1, contrato.getFuncionario().getId());
            ps.setInt(2, contrato.getCliente().getId());
            ps.setInt(3, contrato.getImovel().getId());
            ps.setDouble(4, contrato.getValor());
            ps.setString(5, data.formatarDataBD(contrato.getDataInicio()));
            ps.setString(6, data.formatarDataBD(contrato.getDataTermino()));
            ps.setDouble(7, contrato.getPercentualMulta());

            ps.executeUpdate();
            System.out.println("Contrato editado!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar Contrato!\n" + e.getMessage());
            return false;
        }
    }

    public boolean remover(ContratoLocacao contrato) {
        try {
            String sql = "DELETE FROM contrato_locacao\n"
                    + " WHERE id =" + contrato.getId()
                    + "; ";
            executeSql(sql);
            System.out.println("Contrato removido!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao remover Contrato!\n" + e.getMessage());
            return false;
        }
    }

    public ArrayList<ContratoLocacao> carregarListaContrato() {
        ArrayList<ContratoLocacao> listaContratoLocacao = new ArrayList<>();

        try {
            String sql = "SELECT * FROM contrato_locacao \n"
                    + "join vendedor on  contrato_locacao.id_funcionario = vendedor.id "
                    + "join cliente on contrato_locacao.id_cliente = cliente.id "
                    + "join imovel on contrato_locacao.id_imovel = imovel.id ";
            ResultSet rs = consultaSQL(sql);

            while (rs.next()) {
                ContratoLocacao contrato = new ContratoLocacao();

                contrato.setId(rs.getInt("id"));
                contrato.setValor(rs.getDouble("valor"));
                contrato.setDataInicio(DateUtils.parseLocalDate(rs.getString("data_inicio")));
                contrato.setDataTermino(DateUtils.parseLocalDate(rs.getString("data_termino")));
                contrato.setPercentualMulta(rs.getDouble("percentual_multa"));

                if (rs.getObject("id_funcionario", Integer.class) != null) {
                    contrato.getFuncionario().setId(rs.getInt("vendedor.id"));
                    contrato.getFuncionario().setNome(rs.getString("vendedor.nome"));
                    contrato.getFuncionario().setCpf(rs.getString("vendedor.cpf"));
                    contrato.getFuncionario().setDataNasc(DateUtils.parseLocalDate(rs.getString("vendedor.dataNasc")));
                    contrato.getFuncionario().setPercentualComissao(rs.getDouble("vendedor.percentual_comissao"));
                    contrato.getFuncionario().setSalario(rs.getDouble("vendedor.salario"));
                }

                if (rs.getObject("id_cliente", Integer.class) != null) {
                    contrato.getCliente().setId(rs.getInt("cliente.id"));
                    contrato.getCliente().setNome(rs.getString("cliente.nome"));
                    contrato.getCliente().setCpf(rs.getString("cliente.cpf"));
                    contrato.getCliente().setDataNasc(DateUtils.parseLocalDate(rs.getString("cliente.dataNasc")));
                }

                Imovel imovel = null;

                if (rs.getObject("id_imovel", Integer.class) != null) {
                    if (rs.getString("tipo") == "Imovel Rural") {
                        imovel = new ImovelRural();
                    } else {
                        imovel = new ImovelUrbano();
                    }

                    imovel.setId(rs.getInt("id"));
                    imovel.setMatriculaImovel(rs.getString("matriculaImovel"));
                    imovel.setTipo(rs.getString("tipo"));
                    imovel.setLargura(rs.getDouble("largura"));
                    imovel.setComprimento(rs.getDouble("comprimento"));
                    imovel.setValor(rs.getDouble("valor"));

                    contrato.setImovel(imovel);
                }
                listaContratoLocacao.add(contrato);
            }

        } catch (SQLException e) {
            System.out.println("Falha ao carregar Contratos!\n" + e.getMessage());
        }
        return listaContratoLocacao;
    }
}