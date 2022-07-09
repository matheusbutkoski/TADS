package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        CadastroPessoa cadPessoa = new CadastroPessoa();

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\nDigite 1 para cadastrar Aluno"
                    + "\nDigite 2 para cadastra Docente"
                    + "\nDigite 3 para exibir Alunos"
                    + "\nDigite 4 para exibir Docentes"
                    + "\nDigite 0 para sair!");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    Aluno al = (Aluno) cadPessoa.cadastrarPessoa(1);
                    listaPessoas.add(al);
                    break;
                case 2:
                    Docente doc = (Docente) cadPessoa.cadastrarPessoa(2);
                    listaPessoas.add(doc);
                    break;
                case 3:
                    cadPessoa.exibirPessoas(listaPessoas, 1);
                    break;
                case 4:
                    cadPessoa.exibirPessoas(listaPessoas, 2);
                    break;
            }
        }

    }

}
