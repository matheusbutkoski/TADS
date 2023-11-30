package model;

import java.util.ArrayList;

/**
 *
 * @author andre.luchesi
 */
public class Aluno implements Comparable<Aluno> {
    private Integer id;
    private String ra;
    private String nome;
    
    private ArrayList<AlunoCurso> cursos;
    private ArrayList<AlunoDisciplina> disciplinas;

    public Aluno() {
        cursos = new ArrayList<>();
        disciplinas = new ArrayList<>();
    }

    public Aluno(Integer id, String ra, String nome) {
        this.id = id;
        this.ra = ra;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public int compareTo(Aluno al) {
        return nome.toUpperCase().compareTo(al.getNome().toUpperCase());
    }
    
    public void exibirInformacoes(){
        System.out.print(nome + " RA: "+ ra);
    }
    
}
