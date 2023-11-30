package modelo;

public class AlunoCurso {
    private int id;
    private Aluno aluno;
    private Curso curso;

    public AlunoCurso(){
        this.aluno = new Aluno();
        this.curso = new Curso();
    }
    public AlunoCurso(int id, Aluno aluno, Curso curso) {
        this.id = id;
        this.aluno = aluno;
        this.curso = curso;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
