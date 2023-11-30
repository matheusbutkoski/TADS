package model;


public class AlunoCurso {
    private Integer id;
    private Aluno aluno;
    private Curso curso;

    public AlunoCurso() {
        this.aluno = new Aluno();
        this.curso = new Curso();
    }

    public AlunoCurso(Integer id, Aluno aluno, Curso curso) {
        this.id = id;
        this.aluno = aluno;
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
