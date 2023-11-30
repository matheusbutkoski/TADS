package model;

import java.util.ArrayList;

public class Curso implements Comparable<Curso>{
    private Integer id;
    private String nome;
    private int cargaHoraria;
    
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<AlunoCurso> alunos;

    public Curso() {
        disciplinas= new ArrayList<>();
        alunos= new ArrayList<>();
    }

    public Curso(Integer id, String nome, int cargaHoraria, ArrayList<Disciplina> disciplinas, ArrayList<AlunoCurso> alunos) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.disciplinas = disciplinas;
        this.alunos = alunos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<AlunoCurso> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<AlunoCurso> alunos) {
        this.alunos = alunos;
    }
    
    @Override
    public int compareTo(Curso cur) {
        return nome.toUpperCase().compareTo(cur.getNome().toUpperCase());
    }
    
    public void exibirInformacoes(){
        System.out.print(nome + " Carga Horária: "+ cargaHoraria);
    }
}
