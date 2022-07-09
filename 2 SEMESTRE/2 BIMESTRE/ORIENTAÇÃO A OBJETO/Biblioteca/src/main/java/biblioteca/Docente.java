
package biblioteca;

public class Docente extends Pessoa {
    private int codigo;
    private String formulacao;
    private String titulacao;
    
    Docente(){
        
    }
    
    public Docente(String n, String c, String t, String e, int cd, String f, String tit){
        super(n, c, t, e);
        setCodigo(cd);
        setFormulacao(f);
        setTitulacao(tit);
        super.tipo = "Docente";
    }

    public int getCodigo() {
        return codigo;
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFormulacao() {
        return formulacao;
    }

    private void setFormulacao(String formulacao) {
        this.formulacao = formulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    private void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Docente{" + "codigo=" + codigo + ", formulacao=" + formulacao + ", titulacao=" + titulacao + " " + super.toString() +'}';
    }
   
  
    
    
}
