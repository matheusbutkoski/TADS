package modelo;

public class DisciplinaCurso {
    private int id;
    private Curso curso;
    private Disciplina disciplina;

    public DisciplinaCurso(){
        this.curso = new Curso();
        this.disciplina = new Disciplina();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    

}
