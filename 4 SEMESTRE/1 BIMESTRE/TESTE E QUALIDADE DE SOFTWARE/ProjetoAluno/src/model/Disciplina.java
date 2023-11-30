package model;

import java.util.ArrayList;

public class Disciplina {
    
    private Integer id;
    private String descricao;
    private Curso curso;
    
    private ArrayList<AlunoDisciplina> alunos;

    public Disciplina() {
        this.curso = new Curso();
        this.alunos = new ArrayList<>();
    }

    public Disciplina(Integer id, String descricao, Curso curso) {
        this.id = id;
        this.descricao = descricao;
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    
    
    
}
