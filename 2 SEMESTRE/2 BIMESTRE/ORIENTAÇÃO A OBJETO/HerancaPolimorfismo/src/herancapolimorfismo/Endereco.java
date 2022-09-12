
package herancapolimorfismo;

public class Endereco {
    
        protected int numero;
        protected String cidade;
        protected String rua;
        
        public Endereco(){
       
        }

        public Endereco(int n, String ci, String r){
            this.cidade = ci;
            this.numero = n;
            this.rua = r;
                    
        }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }


        @Override
    public String toString() {
        return ", Endereco: " + cidade + " - " + rua +", " + numero;
    }
        
        
}
