
package biblioteca;

public abstract class Pessoa {
    
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String email;
    protected String tipo;
    
    public Pessoa(){
        
        
    }
    
    public Pessoa(String n, String c, String t, String e){
        this.nome = n;
        this.cpf = c;
        this.telefone = t;
        this.email = e;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email + ", tipo=" + tipo + '}';
    }
    
    
}
