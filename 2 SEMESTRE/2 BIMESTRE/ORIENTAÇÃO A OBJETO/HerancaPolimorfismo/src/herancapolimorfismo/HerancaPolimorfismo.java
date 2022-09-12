
package herancapolimorfismo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class HerancaPolimorfismo {
private static Scanner leitor = new Scanner(System.in);
 
    public static void main(String[] args) {
       ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
       CadastroFuncionario cadastro = new CadastroFuncionario();
       EditarFuncionario editar = new EditarFuncionario();
       String busca;
       int op;
        do {
            System.out.println("1 - Cadastrar Funcionario");
            System.out.println("2 - Editar Funcionario");
            System.out.println("3 - Remover Funcionario");
            System.out.println("4 - Exibir Funcionarios");
            System.out.println("5 - Exibir Folha de Pagamento");           
            System.out.println("0 - Sair");
            op = leitor.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Informe qual tipo de Funcionario deseja cadastrar");
                    System.out.println("1 - Estagiario");
                    System.out.println("2 - Horista");
                    System.out.println("3 - Mensalista");
                    System.out.println("4 - Comissionado");
                    int tipo = leitor.nextInt();
                    listaFuncionario.add(cadastro.cadastrarFuncionario(tipo));
                    
                    break;
                    
                case 2:
                    System.out.println("Informe o CPF do Funcionario que deseja editar");
                    busca = leitor.next();
                    for (int i = 0; i < listaFuncionario.size(); i++) {
                        if (listaFuncionario.get(i).getCpf().equals(busca)) {
                            editar.editarFuncionario(listaFuncionario.get(i));
                            
                            break;
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Informe o CPF do Funcionario que deseja remover");
                    busca = leitor.next();
                    for (int i = 0; i < listaFuncionario.size(); i++) {
                        if (listaFuncionario.get(i).getCpf().equals(busca)) {
                            listaFuncionario.remove(listaFuncionario.get(i));                            
                            break;
                        }
                    }
                    break;
                    
                case 4:
                    listarFuncionarios(listaFuncionario);
                    break;
                    
                case 5:
                    folhaPagamento(listaFuncionario);
                   break; 
            }
                
        }while(op != 0);
      
    }
    public static void listarFuncionarios(ArrayList<Funcionario> l){
         System.out.println("Deseja ordem 1 - Crescente ou 2 - Decrescente");
       int esc = leitor.nextInt();
       
       if(esc == 1){
           Collections.sort(l);
       }
       if(esc == 2){
           Collections.reverse(l);
       }
        System.out.println("Lista:");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).toString());
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        
    }
    
    public static void folhaPagamento(ArrayList<Funcionario> l){
        System.out.println("Informe o cpf do funcionario que deseja consultar a folha de pagamento");
        float x = 0;
                    String busca = leitor.next();
                    for (int i = 0; i < l.size(); i++) {
                        if (l.get(i).getCpf().equals(busca)) {
                            if(l.get(i) instanceof Comissionado){
                                System.out.println("Informe o valor total de vendas para prosseguir");
                                x = leitor.nextFloat();
                            } else if(l.get(i) instanceof Horista){
                                System.out.println("Informe o total de horas trabalhadas no mes para prosseguir");
                                x = leitor.nextFloat();
                            }                          
                                System.out.println("Valor do Salario com desconto do INSS: "+ l.get(i).calcularSalario(x));
                                System.out.println("Valor do FGTS a ser depositado: "+ l.get(i).calcularFGTS(x));
                        }
                    }
        
    }
}
