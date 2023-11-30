package model;


public class AlunoDisciplina {
    private Integer id;
    private Aluno aluno;
    private Disciplina disciplina;

    public AlunoDisciplina() {
        aluno = new Aluno();
        disciplina = new Disciplina();
    }

    public AlunoDisciplina(Integer id, Aluno aluno, Disciplina disciplina) {
        this.id = id;
        this.aluno = aluno;
        this.disciplina = disciplina;
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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
     
    
}
