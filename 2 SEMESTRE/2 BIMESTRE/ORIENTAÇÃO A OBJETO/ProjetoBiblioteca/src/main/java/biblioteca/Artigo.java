
package biblioteca;


public class Artigo extends Obra {
    
    private String revista;
    private String qualisCapes;
    private String ASSN;
    
    public Artigo(){
        
    }
    
    public Artigo(int c, String t, String au, int a, String ci, String r, String qc, String as){
        super(c,t,au,a,ci);
        this.setRevista(r);
        this.setQualisCapes(qc);
        this.setASSN(as);
        
    }

    public String getRevista() {
        return revista;
    }

    private void setRevista(String revista) {
        this.revista = revista;
    }

    public String getQualisCapes() {
        return qualisCapes;
    }

    private void setQualisCapes(String qualisCapes) {
        this.qualisCapes = qualisCapes;
    }

    public String getASSN() {
        return ASSN;
    }

    private void setASSN(String ASSN) {
        this.ASSN = ASSN;
    }
    

    @Override
    public int duracaoEmprestimo(String tipo){
        if(tipo.equals("Aluno")){
            return 10;
        }else if(tipo.equals("Docente")){
            return 20;
        }
        return 0;
    }

    @Override
    
    
    public String toString2() {
        return "Artigo - " + super.toString2();
    }

    @Override
    public String toString() {
        return "Artigo - " + "Revista: " + revista + ", QualisCapes:" + qualisCapes + ", ASSN: " + ASSN + super.toString();
    }
    
    
}
