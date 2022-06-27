package aulapoo;

import java.util.Date;


public class Pessoa {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private Endereco endereco;

    public Pessoa() {
        endereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", endereco=" + endereco + '}';
    }
    
    
    
}
