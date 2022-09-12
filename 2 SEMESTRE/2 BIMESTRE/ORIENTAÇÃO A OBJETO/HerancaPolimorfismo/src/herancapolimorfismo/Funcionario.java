package herancapolimorfismo;

import java.time.LocalDate;

public abstract class Funcionario implements Comparable<Funcionario>{
    
    protected String nome;
    protected String cpf;
    protected LocalDate dataNasc;
    protected LocalDate dataAdmissao;
    protected Endereco endereco;
    protected String cargo;
    
    public Funcionario(){
        
        
    }
    
    public Funcionario(String n, String c, LocalDate d, Endereco e, String cg, LocalDate da){
        this.nome = n;
        this.cpf = c;
        this.endereco = e;
        this.dataNasc = d;
        this.cargo = cg;
        this.dataAdmissao = da;
 
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

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public int compareTo(Funcionario f){
         return this.nome.compareToIgnoreCase(f.getNome());
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Data Nascimento: " + dataNasc + ", Data Admissao: " + dataAdmissao + ", Cargo: " + cargo + endereco.toString() ;
    }

    
    public float calcularSalario(float qtd){
        return 0;
    }
    
    public float calcularFGTS(float qtd){
        return 0;   
    }
}


