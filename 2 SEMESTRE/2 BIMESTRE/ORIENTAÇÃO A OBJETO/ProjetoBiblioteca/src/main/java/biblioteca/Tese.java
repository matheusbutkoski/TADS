
package biblioteca;

public class Tese extends Obra {
    private String instituicao;
    private String orientador;
    
    public Tese(){

    }
    
    
    public Tese(int c, String t, String au, int a, String ci, String i, String o){
        super(c,t,au,a,ci);
        this.instituicao = i;
        this.orientador = o;
        
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }
    
    
    @Override
    public int duracaoEmprestimo(String tipo){
        if(tipo.equals("Aluno")){
            return 15;
        }else if(tipo.equals("Docente")){
            return 30;
        }
        return 0;
    }

    @Override
    public String toString2() {
        return "Tese - " + super.toString2();
    }

    @Override
    public String toString() {
        return "Tese - " + "Instituicao: " + instituicao + ", Orientador: " + orientador + super.toString();
    }
    
    
    
}
