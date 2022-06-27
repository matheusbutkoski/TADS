package loja;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    
 private static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
         ArrayList<Usuario> listaU = new ArrayList<>();
         ArrayList<Funcionario> listaF = new ArrayList<>();
        int op;
        do{
        System.out.println("1 - Cadastrar Vendedor");
        System.out.println("2 - Cadastrar Cliente");
        System.out.println("3 - Cadastrar Gerente");
        System.out.println("4 - Listar Clientes");
        System.out.println("5 - Listar Vendedores");
        System.out.println("6 - Listar Gerentes");
        System.out.println("0 - Sair");
        op = leitor.nextInt();
        
        switch(op){
            case 1 -> {
                Vendedor vendedor = cadastrarVendedor();
                listaF.add(vendedor);
                 }
            case 2 -> {
                Cliente cliente = cadastrarCliente();
                listaU.add(cliente);
                 }
            case 3 -> {
                Gerente gerente = cadastrarGerente();
                listaF.add(gerente);
                 }
            case 4 -> {
                System.out.println("------------------------");
                listarCliente(listaU);
                 }
            case 5 -> {
                System.out.println("------------------------");
                listarVendedor(listaF);
                 }
            case 6 -> {
                System.out.println("------------------------");
                listarGerente(listaF);
                 }                          
        }
        
        } while (op != 0);
    }
    
    public static Vendedor cadastrarVendedor(){
        System.out.println("Informe o nome");
        String n = leitor.next();
        System.out.println("Informe o login");
        String l = leitor.next();
        System.out.println("Informe a senha");
        String s = leitor.next();
        System.out.println("Informe o email");
        String e = leitor.next();
        System.out.println("Informe o cpf");
        String cpf = leitor.next();
        System.out.println("Informe o ctps");
        String ct = leitor.next();
        System.out.println("Informe a data de admissao");
         System.out.println("Use a ordem ano, mes, dia");
        LocalDate dataAd = LocalDate.of(leitor.nextInt(), leitor.nextInt(), leitor.nextInt());
        System.out.println("Informe o Salario");
        double sal = leitor.nextDouble();
        System.out.println("Informe a cidade");
        String cid = leitor.next();
        System.out.println("Informe o numero");
        int num = leitor.nextInt();
        System.out.println("Informe a rua");
        String rua = leitor.next();
        
        Endereco end = new Endereco(cid, rua, num);
        
        Vendedor vendedor = new Vendedor(n, l, s, e, cpf, ct, dataAd, sal, end);
        return vendedor;
        }
    
    public static Cliente cadastrarCliente(){
        System.out.println("Informe o nome");
        String n = leitor.next();
        System.out.println("Informe o login");
        String l = leitor.next();
        System.out.println("Informe a senha");
        String s = leitor.next();
        System.out.println("Informe o email");
        String e = leitor.next();
        System.out.println("Informe o cpf");
        String cpf = leitor.next();
        System.out.println("Informe o limite de credito");
        double lmt = leitor.nextDouble();
        System.out.println("Informe a cidade");
        String cid = leitor.next();
        System.out.println("Informe o numero");
        int num = leitor.nextInt();
        System.out.println("Informe a rua");
        String rua = leitor.next();
        
        Endereco end = new Endereco(cid, rua, num);
        Cliente cliente = new Cliente(n, l, s, e, cpf, lmt, end);
        return cliente;
        }
    
    public static Gerente cadastrarGerente(){
        System.out.println("Informe o nome");
        String n = leitor.next();
        System.out.println("Informe o login");
        String l = leitor.next();
        System.out.println("Informe a senha");
        String s = leitor.next();
        System.out.println("Informe o email");
        String e = leitor.next();
        System.out.println("Informe o cpf");
        String cpf = leitor.next();
        System.out.println("Informe o ctps");
        String ct = leitor.next();
        System.out.println("Informe a data de admissao");
        System.out.println("Use a ordem ano, mes, dia");
        LocalDate dataAd = LocalDate.of(leitor.nextInt(), leitor.nextInt(), leitor.nextInt());
        System.out.println("Informe o departamento");
        String dep = leitor.next();
        System.out.println("Informe o Salario");
        double sal = leitor.nextDouble();
        System.out.println("Informe o bonus");
        double bon = leitor.nextDouble();
        System.out.println("Informe a cidade");
        String cid = leitor.next();
        System.out.println("Informe o numero");
        int num = leitor.nextInt();
        System.out.println("Informe a rua");
        String rua = leitor.next();
        
        Endereco end = new Endereco(cid, rua, num);
        
       Gerente gerente = new Gerente(n, l, s, e, cpf, ct, dataAd, dep, sal, bon, end);
        return gerente;
        }
    
       public static void listarGerente(ArrayList<Funcionario> l){
           System.out.println("Gerentes:");
           for(int i = 0; i < l.size(); i++) {
               if(l.get(i).getTipoUsuario().equals("Gerente")){
        System.out.println("Nome: "+l.get(i).getNome());
        System.out.println("Login: "+l.get(i).getLogin());
        System.out.println("Senha: "+l.get(i).getSenha());
        System.out.println("Email: "+l.get(i).getEmail());
        System.out.println("Cpf: "+l.get(i).getCpf());
        System.out.println("CTPS: "+l.get(i).getCtps());
        System.out.println("Data Admissao: "+l.get(i).getDataAdmissao());
        System.out.println("Departamento: "+l.get(i).getDepartamento());
        l.get(i).calcularSalario();
        System.out.println("Cidade: " +l.get(i).getEndereco().getCidade());
        System.out.println("Numero: " +l.get(i).getEndereco().getNumero());
        System.out.println("Rua: " +l.get(i).getEndereco().getRua());
        System.out.println("------------------------");
       }
           }
}
       
       public static void listarCliente(ArrayList<Usuario> l){
           System.out.println("Clientes:");
           for(int i = 0; i < l.size(); i++) {
               if(l.get(i).getTipoUsuario().equals("Cliente")){
        System.out.println("Nome: "+l.get(i).getNome());
        System.out.println("Login: "+l.get(i).getLogin());
        System.out.println("Senha: "+l.get(i).getSenha());
        System.out.println("Email: "+l.get(i).getEmail());
        System.out.println("Cpf: "+l.get(i).getCpf());
        System.out.println("Limite: "+l.get(i).getLimite());
        System.out.println("Cidade: " +l.get(i).getEndereco().getCidade());
        System.out.println("Numero: " +l.get(i).getEndereco().getNumero());
        System.out.println("Rua: " +l.get(i).getEndereco().getRua());
        System.out.println("------------------------");
       }
           }
}
       
       public static void listarVendedor(ArrayList<Funcionario> l){
           System.out.println("Vendedores:");
           for(int i = 0; i < l.size(); i++) {
               if(l.get(i).getTipoUsuario().equals("Vendedor")){
       System.out.println("Nome: "+l.get(i).getNome());
        System.out.println("Login: "+l.get(i).getLogin());
        System.out.println("Senha: "+l.get(i).getSenha());
        System.out.println("Email: "+l.get(i).getEmail());
        System.out.println("Cpf: "+l.get(i).getCpf());
        System.out.println("CTPS: "+l.get(i).getCtps());
        System.out.println("Data Admissao: "+l.get(i).getDataAdmissao());
        l.get(i).calcularSalario();
        System.out.println("Cidade: " +l.get(i).getEndereco().getCidade());
        System.out.println("Numero: " +l.get(i).getEndereco().getNumero());
        System.out.println("Rua: " +l.get(i).getEndereco().getRua());
        System.out.println("------------------------");
       }
           }
}
}
