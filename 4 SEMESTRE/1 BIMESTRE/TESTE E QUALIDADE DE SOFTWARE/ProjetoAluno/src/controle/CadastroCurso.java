package controle;

import java.util.ArrayList;
import java.util.Collections;
import model.Curso;
import persistencia.DaoCurso;
import util.Input;

/**
 *
 * @author Andre
 */
public class CadastroCurso {

    protected static DaoCurso daoCurso = new DaoCurso();

    public static ArrayList<Curso> getCursos() {
        return daoCurso.carregarCursos();
    }

    public static Curso cadastrar() {
        Curso cur = new Curso();
        setarInformacoes(cur);
        daoCurso.salvar(cur);
        return cur;
    }

    public static void editar(Curso cur) {
        if (cur != null) {
            setarInformacoes(cur);
            daoCurso.atualizar(cur);
        }
    }

    public static void setarInformacoes(Curso cur) {
        if (cur == null) {
            System.out.println("Falha ao setar informações da Curso!");
            return;
        }

        System.out.print("\nNome: ");
        cur.setNome(Input.nextLine());

        System.out.print("Carga Horária: ");
        cur.setCargaHoraria(Input.nextInt());

    }

    public static void ordenarLista(ArrayList list) {
        System.out.println("1 - Ascendente: ");
        System.out.println("2 - Descendente: ");
        int op = Input.nextInt();

        if (op == 1) {
            Collections.sort(list);
        } else {
            Collections.sort(list, Collections.reverseOrder());
        }
    }

    public static void listar() {
        ArrayList<Curso> cursos = getCursos();
        if (cursos == null || cursos.isEmpty()) {
            System.out.println("A Lista está Vazia!");
        } else {
            ordenarLista(cursos);
            System.out.println("\n#########---------- Cadastro de Cursos ----------#########");
            int n = 1;
            for (Curso p : cursos) {
                System.out.print("\n" + (n++) + ". ");
                p.exibirInformacoes();
            }
            System.out.println("\n\n#########---------- ############### -----------#########");
        }
    }

    public static void remover(Curso cur) {
        if (daoCurso.remover(cur)) {
            System.out.println("O curso: " + cur.getNome() + " foi removido com sucesso!");
        } else {
            System.err.println("Falha ao remover curso!");
        }
    }

    public static Curso pesquisar(int idCurso) {
        for (Curso p : getCursos()) {
            if (idCurso == p.getId()) {
                return p;
            }
        }
        System.out.println("Não foi encontrado o Curso com o id: " + idCurso);
        return null;
    }

}
