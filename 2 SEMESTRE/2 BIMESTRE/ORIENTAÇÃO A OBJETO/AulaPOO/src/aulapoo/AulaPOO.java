package aulapoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AulaPOO {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        int op;
        do {
            System.out.println("Escolha uma opcao");
            System.out.println("1 - Cadastrar Usuario");
            System.out.println("2 - Editar Usuario");
            System.out.println("3 - Listar todos os Usuarios");
            System.out.println("0 - Sair");
            op = teclado.nextInt();
            switch (op) {
                case 1 -> {
                    Pessoa pessoa = cadastrar();
                    listaPessoas.add(pessoa);
                    break;
                }
                case 2 -> {

                    editar(listaPessoas);

                    break;
                }

                case 3 -> {
                    listar(listaPessoas);
                    break;
                }
            }
        } while (op != 0);
    }

    public static Pessoa cadastrar() {

        Pessoa p1 = new Pessoa();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        p1.setNome(teclado.nextLine());
        System.out.println("Informe o cpf:  ");
        p1.setCpf(teclado.next());
        System.out.println("Informe a data de nascimento:  ");
        Date d = new Date(teclado.next());
        p1.setDataNascimento(d);

        System.out.println("Informe a cidade");
        p1.getEndereco().setCidade(teclado.useDelimiter("\\n").next());
        System.out.println("Informe a rua");
        p1.getEndereco().setRua(teclado.useDelimiter("\\n").next());
        System.out.println("Informe o Numero");
        p1.getEndereco().setNumero(teclado.nextInt());

        System.out.println("" + p1.toString());

        return p1;
    }

    public static void editar(ArrayList<Pessoa> e1) {
        int opE;
        Scanner teclado = new Scanner(System.in);

        if (e1.get(0) == null) {
            System.out.println("Nenhum aluno cadastrado");
        }

        System.out.println("Informe o cpf do usuario que deseja editar");
        String busca = teclado.next();
        for (int i = 0; i < e1.size(); i++) {

            if (e1.get(i).getCpf().equals(busca)) {

                System.out.println("Informe o que deseja editar");
                System.out.println("1 - Dados");
                System.out.println("2 - Endereço");
                opE = teclado.nextInt();

                if (opE == 1) {
                    System.out.println("Informe o novo Nome: ");
                    e1.get(i).setNome(teclado.next());
                    System.out.println("Informe o novo cpf:  ");
                    e1.get(i).setCpf(teclado.next());
                    System.out.println("Informe a nova data de nascimento:  ");
                    Date d = new Date(teclado.next());
                    e1.get(i).setDataNascimento(d);
                }

                if (opE == 2) {
                    System.out.println("Informe a cidade");
                    e1.get(i).getEndereco().setCidade(teclado.useDelimiter("\\n").next());
                    System.out.println("Informe a rua");
                    e1.get(i).getEndereco().setRua(teclado.useDelimiter("\\n").next());
                    System.out.println("Informe o Numero");
                    e1.get(i).getEndereco().setNumero(teclado.nextInt());
                }
            }
        }
    }

    public static void listar(ArrayList<Pessoa> l) {
        for (int i = 0; i < l.size(); i++) {
            Pessoa pessoa = l.get(i);
            System.out.println(pessoa.toString());
        }

    }

}
