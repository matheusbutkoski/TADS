package revisaocadastro;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Pessoa implements Comparable<Pessoa>{
    protected String nome;
    protected String cpf;
    protected LocalDate dataNascimento;
    protected Endereco endereco;
    protected long idade;

    
    public Pessoa(String n, String c, LocalDate d, Endereco e, long i){
        this.nome = n;
        this.cpf = c;
        this.dataNascimento = d;
        this.endereco = e;
        this.idade = i;
    }
    
    public Pessoa(){
        
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public long getIdade() {
        return idade;
    }

    public void setIdade(long idade) {
        this.idade = idade;
        
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
    @Override
    public int compareTo(Pessoa p){
         return this.nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public String toString() {
        return "Nome:" + nome + ", CPF: " + cpf + ", Idade: " + (ChronoUnit.YEARS.between(dataNascimento,LocalDate.now())) + ", Cidade: " + endereco.cidade + ", Numero: " + endereco.numero + ", Rua: " + endereco.rua;
    }
    
    
}
