
package biblioteca;

public class Aluno extends Pessoa {
        private String matricula;
        private String curso;
    
    Aluno(){
        
        
    }
    
    public Aluno(String n, String c, String t, String e, String m, String cs){
        super(n, c, t, e);
        this.curso = cs;
        this.matricula = m;
        super.tipo = "Aluno";
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
