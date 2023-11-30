package modelo;

import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String descrição;
    private Curso curso;
    private ArrayList<AlunoDisciplina> alunos;

    public Disciplina(int id, String descrição, Curso curso) {
        this.id = id;
        this.descrição = descrição;
        this.curso = curso;
    }

    public Disciplina(){
        this.curso = new Curso();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<AlunoDisciplina> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<AlunoDisciplina> alunos) {
        this.alunos = alunos;
    }

    public void exibir() {
        System.out.print(descrição + "\n");
        
    }
}
