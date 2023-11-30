import java.util.ArrayList;
import controle.CadastroAluno;
import controle.CadastroCurso;
import controle.CadastroDisciplina;
import modelo.Aluno;
import modelo.AlunoCurso;
import modelo.AlunoDisciplina;
import modelo.Curso;
import modelo.Disciplina;
import modelo.DisciplinaCurso;
import persistencia.DAOAluno;
import persistencia.DAOAlunoCurso;
import persistencia.DAOAlunoDisciplina;
import persistencia.DAOCurso;
import persistencia.DAODisciplina;
import persistencia.DAODisciplinaCurso;
import persistencia.DataBaseConnection;
import util.Input;

public class main {
    private static DAOAluno daoAluno = new DAOAluno();
    private static DAOCurso daoCurso = new DAOCurso();
    private static DAODisciplina daoDisciplina = new DAODisciplina();
    private static DAOAlunoCurso daoAlunoCurso = new DAOAlunoCurso();
    private static DAOAlunoDisciplina daoAlunoDisciplina = new DAOAlunoDisciplina();
    private static DAODisciplinaCurso daoDisciplinaCurso = new DAODisciplinaCurso();

    
public static void main(String[] args) {
    int op = 0;
    do{ 
     
    DataBaseConnection.getConnection();
        System.out.println("=== MENU ===");
        System.out.println("1 - CRUD Alunos ");
        System.out.println("2 - CRUD Cursos ");
        System.out.println("3 - CRUD Disciplina ");
        System.out.println("4 - Realizar Operações");
        System.out.println("0 - Sair");

        
        op = Input.nextInt();
    switch(op){
        case 1:
        crudAlunos();
        break;

        case 2:
        crudCursos();
        break;

        case 3:
        crudDisciplinas();
        break;

        case 4:
        realizarOperacoes();
        break;

        case 0:

        break;

        default:
        if(op != 0){ 
            System.out.println("\nOpção inválida!");
        }
    }
      }while (op != 0);
}

    public static void crudAlunos (){
        int op2 = 0;
        System.out.println("=== CRUD DE ALUNOS ===");
        System.out.println("1 - Cadastrar ");
        System.out.println("2 - Editar ");
        System.out.println("3 - Remover ");
        System.out.println("4 - Listar ");
        System.out.println("0 - Sair");
        op2 = Input.nextInt();
        String raPesquisa;
        
        switch(op2){
            case 1:
            daoAluno.inserir(CadastroAluno.cadastrar()); 
            break;

            case 2:
            System.out.println("Informe o RA");
            raPesquisa = Input.next();
            daoAluno.atualizar(CadastroAluno.editar(daoAluno.buscarPorRa(raPesquisa)));
            break;

            case 3:
            System.out.println("Informe o RA");
            raPesquisa = Input.next();
            daoAluno.remover(raPesquisa);
            break;

            case 4:
            System.out.println("Informe o RA");
            raPesquisa = Input.next();
            Aluno al = daoAluno.buscarPorRa(raPesquisa);
            if(al != null){
                al.exibir();
            } else{
                 System.out.println("Falha ao carregar Aluno!\n");
            }       
            
            break;
            case 0:

            break;
            
            default:
                if(op2 != 0){ 
                    System.out.println("\nOpção inválida!");
                }

    }
    }

    public static void crudCursos (){
        int op2 = 0;
        System.out.println("=== CRUD DE CURSOS ===");
        System.out.println("1 - Cadastrar ");
        System.out.println("2 - Editar ");
        System.out.println("3 - Remover ");
        System.out.println("4 - Listar ");
        System.out.println("0 - Sair");
        op2 = Input.nextInt();
        String raPesquisa;
        
        switch(op2){
            case 1:
            daoCurso.inserir(CadastroCurso.cadastrar()); 
            break;

            case 2:
            System.out.println("Informe o Nome do Curso");
            raPesquisa = Input.next();
            daoCurso.atualizar(CadastroCurso.editar(daoCurso.buscarPorNome(raPesquisa)));
            break;

            case 3:
            System.out.println("Informe o Nome do Curso");
            raPesquisa = Input.next();
            daoCurso.remover(raPesquisa);
            break;

            case 4:
            System.out.println("Informe o Nome do Curso");
            raPesquisa = Input.next();
            Curso cs = daoCurso.buscarPorNome(raPesquisa);        
            cs.exibir();
             
            
            break;
            case 0:

            break;
            
            default:
                if(op2 != 0){ 
                    System.out.println("\nOpção inválida!");
                }

    }
    }

    public static void crudDisciplinas (){
        int op2 = 0;
        System.out.println("=== CRUD DE Disciplinas ===");
        System.out.println("1 - Cadastrar ");
        System.out.println("2 - Editar ");
        System.out.println("3 - Remover ");
        System.out.println("4 - Listar ");
        System.out.println("0 - Sair");
        op2 = Input.nextInt();
        int raPesquisa;
        
        switch(op2){
            case 1:
            daoDisciplina.inserir(CadastroDisciplina.cadastrar()); 
            break;

            case 2:
            System.out.println("Informe o ID");
            raPesquisa = Input.nextInt();
            daoDisciplina.atualizar(CadastroDisciplina.editar(daoDisciplina.buscarPorID(raPesquisa)));
            break;

            case 3:
            System.out.println("Informe o ID");
            raPesquisa = Input.nextInt();
            daoDisciplina.remover(raPesquisa);
            break;

            case 4:
            System.out.println("Informe o ID");
            raPesquisa = Input.nextInt();
            Disciplina al = daoDisciplina.buscarPorID(raPesquisa);
            if(al != null){
                al.exibir();
            } else{
                 System.out.println("Falha ao carregar Disciplina!\n");
            }       
            
            break;
            case 0:

            break;
            
            default:
                if(op2 != 0){ 
                    System.out.println("\nOpção inválida!");
                }

    }
    }

    public static void realizarOperacoes(){
        int op3 = 0;
        System.out.println("=== OPERAÇÕES ===");
        System.out.println("1 - Matricular aluno em curso");
        System.out.println("2 - Matricular aluno em disciplina");
        System.out.println("3 - Listar cursos de um aluno");       
        System.out.println("4 - Listar disciplinas de um aluno");
        System.out.println("5 - Matricular disciplina em um curso");
        System.out.println("6 - Listar disciplinas de um curso");
        op3 = Input.nextInt();
        switch(op3){
            case 1:
            try{
            AlunoCurso al = new AlunoCurso();

            System.out.println("Informe o RA do Aluno");
            String raPesquisa = Input.next();
            al.setAluno(daoAluno.buscarPorRa(raPesquisa));

            System.out.println("Informe o Curso que deseja cadastrar o Aluno");
            String cursoPesquisa = Input.next();
            al.setCurso(daoCurso.buscarPorNome(cursoPesquisa));

            daoAlunoCurso.inserir(al);
            
             }catch (NullPointerException n){
                System.out.println("Um aluno ou curso nao está cadastrado");
                break;           
             }
            
            break;

            case 2:
            try{
                AlunoDisciplina al = new AlunoDisciplina();

                System.out.println("Informe o RA do Aluno");
                String raPesquisa = Input.next();
                al.setAluno(daoAluno.buscarPorRa(raPesquisa));

                System.out.println("Informe o ID da disciplina que deseja cadastrar o Aluno");
                int disciplinaPesquisa = Input.nextInt();
                al.setDisciplina(daoDisciplina.buscarPorID(disciplinaPesquisa));
                
                daoAlunoDisciplina.inserir(al);
                System.out.println("Ok");
            }catch(NullPointerException n){
                System.out.println("Um aluno ou disciplina nao está cadastrado");
            }
            break;

            case 3:
            ArrayList<Curso> cursos = new ArrayList<>();
            try{              

            System.out.println("Informe o RA do Aluno");
            String raPesquisa = Input.next();
            
            cursos = daoAlunoCurso.carregarCursosDoAluno(raPesquisa);
            System.out.println("-----------");
            for(int i=0;i<cursos.size();i++){
                System.out.println(cursos.get(i).getNome());
            }
           
             }catch (NullPointerException n){
                System.out.println("Um aluno ou curso nao está cadastrado");
                break;           
             }
             System.out.println("-----------");
            break;

            case 4:
            ArrayList<Disciplina> disciplina = new ArrayList<>();
            try{              

            System.out.println("Informe o RA do Aluno");
            String raPesquisa = Input.next();
            
            disciplina = daoAlunoDisciplina.carregarDisciplinasDoAluno(raPesquisa);
            System.out.println("-----------");
            for(int i=0;i<disciplina.size();i++){
                System.out.println(disciplina.get(i).getDescrição());
            }
           
             }catch (NullPointerException n){
                System.out.println("Um aluno ou curso nao está cadastrado");
                break;           
             }
             System.out.println("-----------");
            break;

            case 5:
            try{
            DisciplinaCurso dc = new DisciplinaCurso();

            System.out.println("Informe o id da Disciplina");
            int idPesquisa = Input.nextInt();
            dc.setDisciplina(daoDisciplina.buscarPorID(idPesquisa));

            System.out.println("Informe o Curso que deseja cadastrar o Disciplina");
            String cursoPesquisa = Input.next();
            dc.setCurso(daoCurso.buscarPorNome(cursoPesquisa));

            daoDisciplinaCurso.inserir(dc);
            
             }catch (NullPointerException n){
                System.out.println("Uma disciplina ou curso nao está cadastrado");
                break;           
             }
            
            break;

            case 6:
            ArrayList<Disciplina> disciplinas = new ArrayList<>();
            try{              

            System.out.println("Informe o nome do Curso");
            String nomePesquisa = Input.next();
            
            disciplinas = daoDisciplinaCurso.carregarCursosDaDisciplina(nomePesquisa);
            System.out.println("-----------");
            for(int i=0;i<disciplinas.size();i++){
                
                System.out.println(disciplinas.get(i).getDescrição());
            }
            
             }catch (NullPointerException n){
                System.out.println("Um Disciplina ou curso nao está cadastrado");
                break;           
             }
             System.out.println("-----------");
            break;
        }
    }
}