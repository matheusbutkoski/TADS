
package aulapoo;

public class Endereco {
    
    private String cidade;
    private String rua;
    private int numero;
    
   public Endereco(){
       
   }
   
   public Endereco(String cidade, String rua, int numero){
       this.cidade = cidade;
       this.rua = rua;
       this.numero = numero;
   }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   
   
    
}
