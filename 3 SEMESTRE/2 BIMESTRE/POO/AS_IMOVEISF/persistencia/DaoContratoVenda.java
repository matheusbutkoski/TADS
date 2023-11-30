package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.ContratoVenda;
import modelo.Imovel;
import modelo.ImovelRural;
import modelo.ImovelUrbano;
import util.DateUtils;

public class DaoContratoVenda extends DAO {

    DateUtils data = new DateUtils();
    private DaoVendedor daoVendedor;
    private DaoCliente daoCliente;
    private DaoImoveis daoImoveis;

    public DaoContratoVenda() {
        daoVendedor = new DaoVendedor();
        daoCliente = new DaoCliente();
        daoImoveis = new DaoImoveis();
    }

    public boolean salvar(ContratoVenda contrato) {
        try {

            String sql = "INSERT INTO contrato_venda(\n"
                    + " id, id_funcionario, id_cliente, id_imovel, valor, forma_pagamento, quantidade_parcelas)\n"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(sql);
            contrato.setId(gerarProximoId("contrato_venda"));
            ps.setInt(1, contrato.getId());
            ps.setInt(2, contrato.getFuncionario().getId());
            ps.setInt(3, contrato.getCliente().getId());
            ps.setInt(4, contrato.getImovel().getId());
            ps.setDouble(5, contrato.getValor());
            ps.setString(6, contrato.getFormaPagamento());
            ps.setInt(7, contrato.getQtdParcelas());

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

    public ContratoVenda carregarPorId(int idContrato) {
        ContratoVenda contrato = null;
        try {
            String sql = "SELECT * FROM contrato_venda \n"
                    + "join vendedor on contrato_venda.id_funcionario = vendedor.id "
                    + "join cliente on contrato_venda.id_cliente = cliente.id "
                    + "join imovel on contrato_venda.id_imovel = imovel.id "
                    + " where contrato_venda.id = " + idContrato;
            ResultSet rs = consultaSQL(sql);
            if (rs.next()) {
                contrato = new ContratoVenda();
                contrato.setId(rs.getInt("id"));
                contrato.setValor(rs.getDouble("valor"));
                contrato.setFormaPagamento(rs.getString("forma_pagamento"));
                contrato.setQtdParcelas(rs.getInt("quantidade_parcelas"));

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

    public boolean atualizar(ContratoVenda contrato) {
        try {
            String sql = "UPDATE contrato_venda\n"
                    + "SET id_funcionario=?, id_cliente=?, id_imovel=?, valor=?, forma_pagamento=?, quantidade_parcelas=? \n"
                    + " WHERE id= " + contrato.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setInt(1, contrato.getFuncionario().getId());
            ps.setInt(2, contrato.getCliente().getId());
            ps.setInt(3, contrato.getImovel().getId());

            ps.setDouble(4, contrato.getValor());
            ps.setString(5, contrato.getFormaPagamento());
            ps.setInt(6, contrato.getQtdParcelas());

            ps.executeUpdate();
            System.out.println("Contrato editada!!");
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar Contrato!\n" + e.getMessage());
            return false;
        }
    }

    public boolean remover(ContratoVenda contrato) {
        try {
            String sql = "DELETE FROM contrato_venda\n"
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

    public ArrayList<ContratoVenda> carregarListaContrato() {
        ArrayList<ContratoVenda> listaContratoVenda = new ArrayList<>();

        try {
            String sql = "SELECT * FROM contrato_venda \n"
                    + "join vendedor on contrato_venda.id_funcionario = vendedor.id "
                    + "join cliente on contrato_venda.id_cliente = cliente.id "
                    + "join imovel on contrato_venda.id_imovel = imovel.id ";
            ResultSet rs = consultaSQL(sql);

            while (rs.next()) {
                ContratoVenda contrato = new ContratoVenda();
                contrato.setId(rs.getInt("id"));
                contrato.setValor(rs.getDouble("valor"));
                contrato.setFormaPagamento(rs.getString("forma_pagamento"));
                contrato.setQtdParcelas(rs.getInt("quantidade_parcelas"));

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
                listaContratoVenda.add(contrato);
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar contrato!\n"
                    + e.getMessage());
        }
        return listaContratoVenda;
    }
}
