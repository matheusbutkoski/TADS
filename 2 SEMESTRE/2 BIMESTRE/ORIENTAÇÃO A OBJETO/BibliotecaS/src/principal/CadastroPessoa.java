package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoa {

    private Scanner input = new Scanner(System.in);

    public CadastroPessoa() {
    }

    public Pessoa cadastrarPessoa(int tipoPessoa) {
        Pessoa p = null;
        if (tipoPessoa == 1) {
            p = new Aluno();
        } else {
            p = new Docente();
        }
        System.out.println("Nome:");
        p.setNome(input.useDelimiter("\n").next());
        System.out.println("CPF:");
        p.setCpf(input.useDelimiter("\n").next());
        System.out.println("Telefone:");
        p.setTelefone(input.next());
        System.out.println("email:");
        p.setEmail(input.next());

        if (p instanceof Aluno) {
            Aluno a = (Aluno) p;
            System.out.println("Matricula:");
            a.setMatricula(input.next());
            System.out.println("Curso:");
            a.setCurso(input.useDelimiter("\n").next());
            return a;
        } else if (p instanceof Docente) {
            Docente d = (Docente) p;
            System.out.println("código:");
            d.setCodigo(input.nextInt());
            System.out.println("Formação:");
            d.setFormacao(input.useDelimiter("\n").next());
            System.out.println("Titulação:");
            d.setTitulacao(input.useDelimiter("\n").next());
            return d;
        }
        return p;
    }

    public void exibirPessoas(ArrayList<Pessoa> listaPessoas, int tipoPessoa) {
        System.out.println("");
        for (int i = 0; i < listaPessoas.size(); i++) {
            Pessoa pessoa = listaPessoas.get(i);
            switch (tipoPessoa) {
                case 1:
                    if (pessoa instanceof Aluno) {
                        System.out.println(pessoa.toString());
                    }
                    break;
                case 2:
                    if (pessoa instanceof Docente) {
                        System.out.println(pessoa.toString());
                    }
                    break;
                default:
                    System.out.println(pessoa.toString());
            }
        }
    }
}
