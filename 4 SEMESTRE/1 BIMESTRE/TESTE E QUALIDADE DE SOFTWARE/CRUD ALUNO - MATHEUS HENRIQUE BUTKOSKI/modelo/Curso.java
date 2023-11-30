package modelo;

import java.util.ArrayList;

public class Curso {
    private int id;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Disciplina> listaDisciplina;
    private ArrayList<AlunoCurso> alunos; 
    
    public Curso(int id, String nome, int cargaHoraria, ArrayList<Disciplina> listaDisciplina) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.listaDisciplina = listaDisciplina;
    }

    public Curso(){
        this.listaDisciplina = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public ArrayList<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }
    public void setListaDisciplina(ArrayList<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }

    public ArrayList<AlunoCurso> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<AlunoCurso> alunos) {
        this.alunos = alunos;
    }

    public void exibir() {
        System.out.print(nome + " - " + cargaHoraria + "\n");
        
    }

}
