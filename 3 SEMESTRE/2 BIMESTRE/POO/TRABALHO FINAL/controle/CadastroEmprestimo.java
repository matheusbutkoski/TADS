package controle;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Emprestimo;
import persistencia.DaoCliente;
import persistencia.DaoEmprestimo;
import persistencia.DaoLivro;
import persistencia.DaoVendedor;
import util.DateUtils;
import util.Input;

public class CadastroEmprestimo {
    private static DaoCliente daoCliente = new DaoCliente();
    private static DaoVendedor daoVendedor = new DaoVendedor();
    private static DaoLivro daoLivro = new DaoLivro();
    private static DaoEmprestimo daoEmprestimo = new DaoEmprestimo();
    
    public static Emprestimo cadastrar() {
        Emprestimo e = new Emprestimo();
        setarInformacoes(e);
        return e;
    }

    public static Emprestimo editar(Emprestimo e){
        setarInformacoes(e);
        return e;
    }
     
    public static void setarInformacoes(Emprestimo e) {
    try{
        System.out.print("Informe o ID do livro: ");
        int idLivro = Input.nextInt();
        
        ArrayList<Emprestimo> listaEmprestimos = daoEmprestimo.carregarListaEmprestimos();
        if(e.getId() == null){
        for(int i=0;i<listaEmprestimos.size();i++){
          if(listaEmprestimos.get(i).getLivro().getId() == idLivro){
            throw new LivroException();
          }
          e.setLivro(daoLivro.carregarPorID(idLivro));
        }
    }else{
        e.setLivro(daoLivro.carregarPorID(idLivro));
    }        
        
        if (e.getLivro() == null) {
            throw new EmprestimoException();
        }
        
        System.out.print("Informe o CPF do vendedor: ");
        String cpfVen = Input.next();
        e.setVendedor(daoVendedor.carregarPorCPF(cpfVen));

        if (e.getVendedor() == null) {
            throw new EmprestimoException();
        }
       
        System.out.print("Informe o CPF do cliente: ");
        String cpfCli = Input.next();
        e.setCliente(daoCliente.carregarPorCPF(cpfCli));

        if (e.getCliente() == null) {
            throw new EmprestimoException();
        }

    if(e.getDataEmprestimo() == null && e.getDataDevolucao() == null){
       e.setDataEmprestimo(LocalDate.now());
       e.setDataDevolucao(DateUtils.parseLocalDate("2000-01-01"));
    }else{
        System.out.println("Informe a Data de Emprestimo (ANO-MES-DIA)");
        e.setDataEmprestimo(Input.nextLocalDate());
    }
       
       System.out.println("Informe o prazo (dias)");
       e.setPrazoDias(Input.nextInt());


        System.out.println("Emprestimo Cadastrado com Sucesso!");
        e.exibirInformacoes();

    }catch(EmprestimoException ex){
        System.out.println(ex.getMessage());

    }catch(LivroException exLivro){
        System.out.println(exLivro.getMessage());
        
    }
    }
}
