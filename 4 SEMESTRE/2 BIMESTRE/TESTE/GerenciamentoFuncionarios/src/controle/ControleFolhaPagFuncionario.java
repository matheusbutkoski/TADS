package controle;

import java.util.List;
import java.util.stream.Collectors;
import modelo.FolhaPagFuncionario;
import persistencia.DaoFolhaPagFuncionario;
import util.Input;
import util.validacoes.ValidacaoUtil;

/**
 *
 * @author Andre
 */
public class ControleFolhaPagFuncionario {
     private DaoFolhaPagFuncionario dao;
     private ControleFuncionario controleFuncionario;
     private ControleConfiguracaoFolhaPag controleConfiguracaoFolhaPag;
    private ValidacaoUtil validator = new ValidacaoUtil(FolhaPagFuncionario.class);

    public ControleFolhaPagFuncionario() {
        dao = new DaoFolhaPagFuncionario();
        controleFuncionario = new ControleFuncionario();
        controleConfiguracaoFolhaPag = new  ControleConfiguracaoFolhaPag();
    }

    public void cadastrar() {

        FolhaPagFuncionario folhaPag = new FolhaPagFuncionario();
        setarDados(folhaPag);
        try {
            if (validator.validarEntidade(folhaPag)) {
                dao.saveOrUpdate(folhaPag);
            }
        } catch (Exception e) {
            validator.msgErroCadastro(e, "salvar");
        }

    }

    public void editar() {
        FolhaPagFuncionario folhaPag = pesquisar();
        setarDados(folhaPag);
        try {
            if (validator.validarEntidade(folhaPag)) {
                dao.saveOrUpdate(folhaPag);
            }
        } catch (Exception e) {
            validator.msgErroCadastro(e, "editar");
        }

    }
           

    public void setarDados(FolhaPagFuncionario folha) {
        System.out.println("informe o ano de referência da folha de pagamento: ");
        folha.setAnoReferencia(Input.nextInt());
        System.out.println("informe o mês de referência da folha de pagamento: ");
        folha.setMesReferencia(Input.nextInt());
        System.out.println("configuração da folha de pagamento: ");
        folha.setConfiguracaoFolhaPag(controleConfiguracaoFolhaPag.pesquisar());
        System.out.println("informe a data de pagamento: ");
        folha.setDataPagamento(Input.nextLocalDate());
        System.out.println("funcionário: ");
        folha.setFuncionario(controleFuncionario.pesquisar());
        System.out.println("informe a quantidade de horas trabalhadas pelo funcionário no mês: ");
        folha.setHorasTrabalhadas(Input.nextInt());
        System.out.println("informe a quantidade de faltas sem justificativa do funcionário no mês: ");
        folha.setFaltasSemJustificativa(Input.nextInt());
    }

    /**
     * Função que realiza o cálculo de folha de pagamento para um determinado funcionário.
     * A folha de pagamento consiste nos seguintes cálculos:
     * Valor de horas extras:
     * Valor total de Proventos:
     * Valor vale-transporte:
     * Valor vale-alimentação:
     * Valor de desconto do vale-transporte:
     * Valor de desconto do vale-alimentação:
     * Valor de desconto INSS:
     * Valor de desconto IR:
     * Valor total de Descontos
     * Valor do sálario Líquido:
     * Valor do FGTS:
     * @param folha o parâmetro folha deverá conter as informações de configuração da folha de pagamento, ano e mês de referência,
     *              data prevista para pagamento, o funciánario, a quantidade de horas trabalhadas no mês e a quantidade de faltas sem justificativa.
     * @see
     * <a href="https://blog.genialinvestimentos.com.br/salario-liquido-e-bruto/"> como calcular salário líquido</a>
     * <a href="https://calculadora-salario-liquido.fisconet.com.br/">calculadora-salario-liquido</a>
     */
    public void calcularFolhadePagamento(FolhaPagFuncionario folha){
        //Implementar o método para calcular folha de pagamento.
    }
    
    public FolhaPagFuncionario pesquisar(){
        System.out.println("informe o código da Folha de Pagamento do funcionário que deseja pesquisar: ");
        int codigo = Input.nextInt();
        return carregarPorId(codigo);
    }
    
    public FolhaPagFuncionario carregarPorId(int id) {
        return (FolhaPagFuncionario) dao.findById(id);
    }
    
    public List<FolhaPagFuncionario> carregarTodos() {
        return dao.findAll().stream().map(e -> (FolhaPagFuncionario) e).collect(Collectors.toList());
    }

    public void remover() {
        FolhaPagFuncionario folhaPag = pesquisar();
        if(folhaPag == null){
            ValidacaoUtil.msgAviso("Cadastro não encontrado", "A Folha de Pagamento do funcionário não foi encontrada na base de dados!");
        }
        dao.delete(folhaPag);
    }
}
