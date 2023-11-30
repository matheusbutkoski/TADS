package modelo;

import java.util.Scanner;
import controle.CadastroPessoa;
import controle.CadastroImovel;
import controle.EditarImovel;
import java.util.ArrayList;
import java.util.Collections;


public class Imoveis {
private static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        CadastroPessoa cadastroPes = new CadastroPessoa();
        CadastroImovel cadastroImov = new CadastroImovel();
        EditarImovel editar = new EditarImovel();
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        ArrayList<Imovel> listaImoveis = new ArrayList<>();
        
        int op;
        System.out.println("1 - Cadastrar Imovel");
        System.out.println("2 - Editar Imovel");
        System.out.println("3 - Listar Imoveis");
        System.out.println("4 - Alugar Imovel");
        System.out.println("5 - Vender Imovel");       
        op = leitor.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Qual tipo de imovel deseja Cadastrar");
                System.out.println("1 - Casa");
                System.out.println("2 - Apartamento");
                System.out.println("3 - Sitio");
                System.out.println("4 - Chacara");
                int tipo = leitor.nextInt();
                listaImoveis.add(cadastroImov.cadastrarImovel(tipo));
                break;
                
            case 2:
                System.out.println("Informe a matricula do imovel que deseja Editar");
                String busca = leitor.next();
                for (int i = 0; i < listaImoveis.size(); i++) {
                    if(listaImoveis.get(i).getMatriculaImovel().equals(busca)){
                        editar.editarImovel(listaImoveis.get(i));
                    }                   
                }
                break;
                
            case 3:
                
                break;
               
                
                
            
        }
       
    }
    
    
    public static void listarFuncionarios(ArrayList<Imovel> l){
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
}
