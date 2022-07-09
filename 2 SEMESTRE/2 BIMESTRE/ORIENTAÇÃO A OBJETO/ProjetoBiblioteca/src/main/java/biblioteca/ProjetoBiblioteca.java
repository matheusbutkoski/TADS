package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoBiblioteca {

    private static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int esc;
        ArrayList<Pessoa> listaP = new ArrayList<>();
        ArrayList<Obra> listaO = new ArrayList<>();
        ArrayList<Emprestimo> listaE = new ArrayList<>();
        int op;
        do {
            System.out.println("1 - Cadastrar ou Editar Pessoa");
            System.out.println("2 - Cadastrar ou Editar Obra");
            System.out.println("3 - Pesquisar Aluno");
            System.out.println("4 - Pesquisar Docente");
            System.out.println("5 - Pesquisar Obra");
            System.out.println("6 - Realizar Emprestimo");
            System.out.println("7 - Realizar Devolucao");
            System.out.println("8 - Gerar Relatorio");
            System.out.println("0 - Sair");
            op = leitor.nextInt();

            switch (op) {
                case 1 -> {

                    System.out.println("Deseja Cadastrar(1) ou Editar(2) uma Pessoa");
                    esc = leitor.nextInt();
                    if (esc == 1) {
                        System.out.println("Deseja Cadastrar Aluno(1) ou Docente(2)");
                        int esc2 = leitor.nextInt();
                        if (esc2 == 1) {
                            Aluno aluno = cadastrarAluno();
                            listaP.add(aluno);
                        } else {
                            Docente docente = cadastrarDocente();
                            listaP.add(docente);
                        }
                    }
                    if (esc == 2) {
                        System.out.println("Deseja Editar Aluno(1) ou Docente(2)");
                        esc = leitor.nextInt();
                        if (esc == 1) {
                            editarAluno(listaP);
                        } else {
                            editarDocente(listaP);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Deseja Cadastrar(1) ou Editar(2) uma Obra");
                    esc = leitor.nextInt();

                    if (esc == 1) {
                        System.out.println("Informe a Obra que deseja cadastrar");
                        System.out.println("1 - Livro");
                        System.out.println("2 - Artigo");
                        System.out.println("3 - Tese");
                        int esc1 = leitor.nextInt();

                        if (esc1 == 1) {
                            Livro livro = cadastrarLivro();
                            listaO.add(livro);
                        } else if (esc1 == 2) {
                            Artigo artigo = cadastrarArtigo();
                            listaO.add(artigo);
                        } else if (esc1 == 3) {
                            Tese tese = cadastrarTese();
                            listaO.add(tese);
                        }
                    }

                    if (esc == 2) {
                        System.out.println("Informe a Obra que deseja editar");
                        System.out.println("1 - Livro");
                        System.out.println("2 - Artigo");
                        System.out.println("3 - Tese");
                        int esc1 = leitor.nextInt();

                        if (esc1 == 1) {
                            editarLivro(listaO);
                        } else if (esc1 == 2) {
                            editarArtigo(listaO);
                        } else if (esc1 == 3) {
                            editarTese(listaO);
                        }

                    }
                }
                case 3 -> {
                    System.out.println("Informe o cpf do Aluno que deseja buscar");
                    String cp = leitor.next();
                    int cont = 0;
                    System.out.println("-------------------------");
                    for (int i = 0; i < listaP.size(); i++) {
                        if (listaP.get(i).getCpf().equals(cp) && listaP.get(i).getTipo().equals("Aluno")) {
                            cont = 1;
                            System.out.println(listaP.get(i).toString());
                            System.out.println("-------------------------");
                        }
                    }
                    if (cont == 0) {
                        System.out.println("Aluno nao Encontrado");
                    }
                }
                case 4 -> {
                    System.out.println("Informe o cpf do Docente que deseja buscar");
                    String cp = leitor.next();
                    int cont = 0;
                    System.out.println("-------------------------");
                    for (int i = 0; i < listaP.size(); i++) {
                        if (listaP.get(i).getCpf().equals(cp) && listaP.get(i).getTipo().equals("Docente")) {
                            cont = 1;
                            System.out.println(listaP.get(i).toString());
                            System.out.println("-------------------------");
                        }
                    }
                    if (cont == 0) {
                        System.out.println("Docente nao Encontrado");
                    }
                }

                case 5 -> {
                    System.out.println("Informe o Codigo da Obra que deseja buscar");
                    int cd = leitor.nextInt();
                    int cont = 0;
                    System.out.println("-------------------------");
                    for (int i = 0; i < listaO.size(); i++) {
                        if (listaO.get(i).getCodigo() == cd) {
                            cont = 1;
                            System.out.println(listaO.get(i).toString());
                            System.out.println("-------------------------");
                        }
                    }
                    if (cont == 0) {
                        System.out.println("Obra nao Encontrado");
                    }
                }
                case 6 -> {
                    Emprestimo emprestimo = realizarEmprestimo(listaO, listaP);
                    listaE.add(emprestimo);
                }
                case 7 -> {
                    realizarDevolucao(listaE);
                }

                case 8 -> {
                    System.out.println("Informe qual tipo de Relatório deseja gerar");
                    System.out.println("1 - Listar todos os alunos");
                    System.out.println("2 - Listar todos os Docentes");
                    System.out.println("3 - Listar todos as Obras");
                    System.out.println("4 - Listar todos os Emprestimos");

                    int esc2 = leitor.nextInt();

                    if (esc2 == 1) {
                        System.out.println("-------------------------");
                        for (int i = 0; i < listaP.size(); i++) {
                            if (listaP.get(i).getTipo().equals("Aluno")) {
                                System.out.println(listaP.get(i).toString());
                                System.out.println("-------------------------");
                            }
                        }

                    }

                    if (esc2 == 2) {
                        System.out.println("-------------------------");
                        for (int i = 0; i < listaP.size(); i++) {
                            if (listaP.get(i).getTipo().equals("Docente")) {
                                System.out.println(listaP.get(i).toString());
                                System.out.println("-------------------------");
                            }
                        }

                    }

                    if (esc2 == 3) {
                        System.out.println("-------------------------");
                        for (int i = 0; i < listaO.size(); i++) {
                            System.out.println(listaO.get(i).toString());
                            System.out.println("-------------------------");
                        }
                    }

                    if (esc2 == 4) {
                        System.out.println("-------------------------");
                        for (int i = 0; i < listaE.size(); i++) {
                            System.out.println(listaE.get(i).getPessoa().toString2());
                            System.out.println(listaE.get(i).getObra().toString2());
                            System.out.println(listaE.get(i).toString());
                            System.out.println("-------------------------");

                        }
                    }

                }
            }

        } while (op != 0);
    }

    public static Aluno cadastrarAluno() {
        System.out.println("Informe o nome do Aluno");
        String n = leitor.next();
        System.out.println("Informe o CPF");
        String c = leitor.next();
        System.out.println("Informe o Telefone");
        String t = leitor.next();
        System.out.println("Informe o Email");
        String e = leitor.next();
        System.out.println("Informe a Matricula");
        String m = leitor.next();
        System.out.println("Informe o Curso");
        String cs = leitor.next();

        Aluno aluno = new Aluno(n, c, t, e, m, cs);
        return aluno;
    }

    public static Docente cadastrarDocente() {
        System.out.println("Informe o nome do Docente");
        String n = leitor.next();
        System.out.println("Informe o CPF");
        String c = leitor.next();
        System.out.println("Informe o Telefone");
        String t = leitor.next();
        System.out.println("Informe o Email");
        String e = leitor.next();
        System.out.println("Informe o Codigo");
        int cd = leitor.nextInt();
        System.out.println("Informe a Formacao");
        String f = leitor.next();
        System.out.println("Informe a Titulacao");
        String tit = leitor.next();

        Docente docente = new Docente(n, c, t, e, cd, f, tit);
        return docente;
    }

    public static void editarAluno(ArrayList<Pessoa> l) {
        System.out.println("Informe o CPF do Aluno que deseja editar");
        String busca = leitor.next();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).cpf.equals(busca) && l.get(i).getTipo().equals("Aluno")) {
                System.out.println("Informe o nome do Aluno");
                String n = leitor.next();
                System.out.println("Informe o CPF");
                String c = leitor.next();
                System.out.println("Informe o Telefone");
                String t = leitor.next();
                System.out.println("Informe o Email");
                String e = leitor.next();
                System.out.println("Informe a Matricula");
                String m = leitor.next();
                System.out.println("Informe o Curso");
                String cs = leitor.next();

                l.set(i, new Aluno(n, c, t, e, m, cs));
            }
        }

    }

    public static void editarDocente(ArrayList<Pessoa> l) {
        System.out.println("Informe o CPF do Docente que deseja editar");
        String busca = leitor.next();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).cpf.equals(busca) && l.get(i).getTipo().equals("Docente")) {
                System.out.println("Informe o nome do Docente");
                String n = leitor.next();
                System.out.println("Informe o CPF");
                String c = leitor.next();
                System.out.println("Informe o Telefone");
                String t = leitor.next();
                System.out.println("Informe o Email");
                String e = leitor.next();
                System.out.println("Informe o Codigo");
                int cd = leitor.nextInt();
                System.out.println("Informe a Formacao");
                String f = leitor.next();
                System.out.println("Informe a Titulacao");
                String tit = leitor.next();

                l.set(i, new Docente(n, c, t, e, cd, f, tit));
            }
        }
    }

    public static Livro cadastrarLivro() {
        System.out.println("Informe o Codigo");
        int c = leitor.nextInt();
        System.out.println("Informe o Titulo");
        String t = leitor.next();
        System.out.println("Informe o Autor");
        String a = leitor.next();
        System.out.println("Informe o Ano");
        int ano = leitor.nextInt();
        System.out.println("Informe a Cidade");
        String ci = leitor.next();
        System.out.println("Informe a Editora");
        String cs = leitor.next();
        System.out.println("Informe a Edicao");
        String e = leitor.next();
        System.out.println("Informe o ISBN");
        int is = leitor.nextInt();

        Livro livro = new Livro(c, t, a, ano, ci, cs, e, is);
        return livro;
    }

    public static Tese cadastrarTese() {
        System.out.println("Informe o Codigo");
        int c = leitor.nextInt();
        System.out.println("Informe o Titulo");
        String t = leitor.next();
        System.out.println("Informe o Autor");
        String a = leitor.next();
        System.out.println("Informe o Ano");
        int ano = leitor.nextInt();
        System.out.println("Informe a Cidade");
        String ci = leitor.next();
        System.out.println("Informe a Instituicao");
        String i = leitor.next();
        System.out.println("Informe o Orientador");
        String o = leitor.next();

        Tese tese = new Tese(c, t, a, ano, ci, i, o);
        return tese;
    }

    public static Artigo cadastrarArtigo() {
        System.out.println("Informe o Codigo");
        int c = leitor.nextInt();
        System.out.println("Informe o Titulo");
        String t = leitor.next();
        System.out.println("Informe o Autor");
        String a = leitor.next();
        System.out.println("Informe o Ano");
        int ano = leitor.nextInt();
        System.out.println("Informe a Cidade");
        String ci = leitor.next();
        System.out.println("Informe a Revista");
        String r = leitor.next();
        System.out.println("Informe o Qualis Capes");
        String qc = leitor.next();
        System.out.println("Informe o ISSN");
        String is = leitor.next();

        Artigo artigo = new Artigo(c, t, a, ano, ci, r, qc, is);
        return artigo;
    }

    public static Emprestimo realizarEmprestimo(ArrayList<Obra> lo, ArrayList<Pessoa> lp) {
        int cd, cont = 0, aux=0;
        String cpf;
        Emprestimo e = new Emprestimo();
        do {
            System.out.println("Informe o codigo da Obra que deseja emprestar");
            cd = leitor.nextInt();
            for (int i = 0; i < lo.size(); i++) {
                if (lo.get(i).getCodigo() == cd) {
                    if (lo.get(i).getDisponibilidade() == false) {
                        System.out.println("Obra indisponivel...");
                        break;
                    } else {
                        lo.get(i).setDisponibilidade(false);
                        e.setObra(lo.get(i));
                        aux = i;
                        cont = 1;
                        
                    }
                }
            }
            if (cont != 1) {
                System.out.println("Obra nao registrada");
                cont = 1;
                break;
            }

            System.out.println("Informe seu cpf");
            cpf = leitor.next();
            for (int i = 0; i < lp.size(); i++) {
                if (lp.get(i).getCpf().equals(cpf)) {
                    e.setPessoa(lp.get(i));

                }

            }

            e.setDataEmprestimo(LocalDate.now());
            int x = lo.get(aux).duracaoEmprestimo(e.getPessoa().getTipo());
            e.setDataPrevistaDev(e.getDataEmprestimo().plusDays(x));
            System.out.println("Emprestimo Realizado: ");
            System.out.println("Prazo de devolucao:" + e.getDataPrevistaDev());
        } while (cont != 1);
        return e;
    }

    public static void realizarDevolucao(ArrayList<Emprestimo> l) {
        String busca;
        int cont = 0;
        System.out.println("Informe seu cpf");
        busca = leitor.next();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getPessoa().getCpf().equals(busca)) {
                if (l.get(i).getSituacao().equals("Pendente")) {
                    cont++;
                }
            }
        }
        if (cont == 0) {
            System.out.println("Voce nao possui emprestimos pendentes");
        } else {
            int cd;
            System.out.println("Emprestimo pendente encontrado:");
            System.out.println("Informe o codigo do livro que deseja devolver");
            cd = leitor.nextInt();

            for (int i = 0; i < l.size(); i++) {
                if (l.get(i).getPessoa().getCpf().equals(busca)) {
                    if (l.get(i).getSituacao().equals("Pendente")) {
                        if (l.get(i).getObra().getCodigo() == cd) {

                            System.out.println("Informe a data de devolucao AAAA -> MM -> DD");
                            l.get(i).setDataDevolucao(LocalDate.of(leitor.nextInt(), leitor.nextInt(), leitor.nextInt()));
                            l.get(i).setMultaPaga(l.get(i).calcularMulta(l.get(i).getDataPrevistaDev(), l.get(i).getDataDevolucao()));
                            if (l.get(i).getMultaPaga() > 0) {
                                System.out.println("Voce possui uma multa devolucao no valor de: R$: " + l.get(i).getMultaPaga());
                            }
                            l.get(i).setSituacao("Devolvido");
                            l.get(i).getObra().setDisponibilidade(true);

                        }

                    }
                }
            }
        }

    }

    public static void editarLivro(ArrayList<Obra> l) {
        System.out.println("Informe o codigo do Livro que deseja editar");
        int busca = leitor.nextInt();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getCodigo() == busca) {
                System.out.println("Informe o Codigo");
                int c = leitor.nextInt();
                System.out.println("Informe o Titulo");
                String t = leitor.next();
                System.out.println("Informe o Autor");
                String a = leitor.next();
                System.out.println("Informe o Ano");
                int ano = leitor.nextInt();
                System.out.println("Informe a Cidade");
                String ci = leitor.next();
                System.out.println("Informe a Editora");
                String cs = leitor.next();
                System.out.println("Informe a Edicao");
                String e = leitor.next();
                System.out.println("Informe o ISBN");
                int is = leitor.nextInt();

                l.set(i, new Livro(c, t, a, ano, ci, cs, e, is));
            }
        }
    }

    public static void editarArtigo(ArrayList<Obra> l) {
        System.out.println("Informe o codigo do Artigo que deseja editar");
        int busca = leitor.nextInt();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getCodigo() == busca) {
                System.out.println("Informe o Codigo");
                int c = leitor.nextInt();
                System.out.println("Informe o Titulo");
                String t = leitor.next();
                System.out.println("Informe o Autor");
                String a = leitor.next();
                System.out.println("Informe o Ano");
                int ano = leitor.nextInt();
                System.out.println("Informe a Cidade");
                String ci = leitor.next();
                System.out.println("Informe a Revista");
                String r = leitor.next();
                System.out.println("Informe o Qualis Capes");
                String qc = leitor.next();
                System.out.println("Informe o ISSN");
                String is = leitor.next();

                l.set(i, new Artigo(c, t, a, ano, ci, r, qc, is));
            }
        }
    }

    public static void editarTese(ArrayList<Obra> l) {
        System.out.println("Informe o codigo da Tese que deseja editar");
        int busca = leitor.nextInt();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getCodigo() == busca) {
                System.out.println("Informe o Codigo");
                int c = leitor.nextInt();
                System.out.println("Informe o Titulo");
                String t = leitor.next();
                System.out.println("Informe o Autor");
                String a = leitor.next();
                System.out.println("Informe o Ano");
                int ano = leitor.nextInt();
                System.out.println("Informe a Cidade");
                String ci = leitor.next();
                System.out.println("Informe a Instituicao");
                String in = leitor.next();
                System.out.println("Informe o Orientador");
                String o = leitor.next();

                l.set(i, new Tese(c, t, a, ano, ci, in, o));
            }
        }
    }

}
