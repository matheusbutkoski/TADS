package principal;


public class Aluno extends Pessoa{
    private String matricula;
    private String curso;

    public Aluno() {
    }

    public Aluno(String matricula, String curso, String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", curso=" + curso + " " + super.toString() + '}';
    }
    
    
    
}
