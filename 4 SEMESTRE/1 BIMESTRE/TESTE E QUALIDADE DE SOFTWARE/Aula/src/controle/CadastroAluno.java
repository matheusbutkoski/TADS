package controle;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import modelo.Aluno;
import persistencia.DaoAluno;
import util.Input;

/**
 *
 * @author ANDRE.LUCHESI
 */
public class CadastroAluno {
    protected static DaoAluno daoAluno = new DaoAluno();
    
    public static List<Aluno> getAlunos() {
        return  daoAluno.findAll().stream().map(e -> (Aluno) e).collect(Collectors.toList());
    }
    public static Aluno cadastrar() {
        Aluno al = new Aluno();
        setarInformacoes(al);
        daoAluno.saveOrUpdate(al);
        return al;
    }
    public static void editar(Aluno al) {
        if (al != null) {
            setarInformacoes(al);
            daoAluno.saveOrUpdate(al);
        }
    }
    public static void setarInformacoes(Aluno al) {
        if (al == null) {
            System.out.println("Falha ao setar informações da Aluno!");
            return;
        }
        System.out.print("\nNome: ");
        al.setNome(Input.nextLine());
        System.out.print("RA: ");
        al.setRa(Input.next());
    }
    public static void ordenarLista(List list) {
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
        List<Aluno> alunos = getAlunos();
        if (alunos == null || alunos.isEmpty()) {
            System.out.println("A Lista está Vazia!");
        } else {
            ordenarLista(alunos);
            System.out.println("\n#########---------- Cadastro de Alunos ----------#########");
            int n = 1;
            for (Aluno p : alunos) {
                System.out.print("\n" + (n++) + ". " + p);
//                p.exibirInformacoes();
            }
            System.out.println("\n\n#########---------- ############### -----------#########");
        }
    }
    public static void remover(Aluno al) {
        if (daoAluno.delete(al)) {
            System.out.println("O cadastro: " + al.getNome() + " - " + al.getRa() + " foi removido com sucesso!");
        } else {
            System.err.println("Falha ao remover aluno!");
        }
    }
    public static Aluno pesquisar(String ra) {
        for (Aluno p : getAlunos()) {
            if (ra.compareTo(p.getRa()) == 0) {
                return p;
            }
        }
        System.out.println("Não foi encontrado aluno com o RA: "+ra);
        return null;
    }
}
