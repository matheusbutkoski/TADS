package modelo;

import java.util.ArrayList;

public class Aluno {
    private int id;
    private String ra;
    private String nome;
    private ArrayList<AlunoCurso> cursos;
    private ArrayList<AlunoDisciplina> disciplinas;

    public Aluno(){
        this.cursos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public Aluno(int id, String ra, String nome) {
        this.id = id;
        this.ra = ra;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibir() {
        System.out.print(nome + " - " + ra + "\n");
        
    }

    public ArrayList<AlunoCurso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<AlunoCurso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<AlunoDisciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<AlunoDisciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }    
}