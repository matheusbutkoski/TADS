package modelo;

public class AlunoDisciplina {
    private int id;
    private Aluno aluno;
    private Disciplina disciplina;

    public AlunoDisciplina(int id, Aluno aluno, Disciplina disciplina) {
        this.id = id;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public AlunoDisciplina(){
        this.aluno = new Aluno();
        this.disciplina = new Disciplina();
        
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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
