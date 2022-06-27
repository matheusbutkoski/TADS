package loja;

public class Usuario {
    protected String tipoUsuario;
    protected String nome;
    protected String login;
    protected String senha;
    protected String email;
    protected String cpf;
    protected Endereco endereco;
    protected double limite;

public Usuario(){
    
}  
    
    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getLimite() {
        return limite;
    }
    
     public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getCpf() {
        return cpf;
    }

  

    
}
