package principal;

import java.time.LocalDate;

public class Pessoa implements Comparable<Pessoa> {

    protected String nome;
    protected String cpf;
    protected LocalDate dataNasc;
    protected Endereco endereco;

    public Pessoa(String nome, String cpf, LocalDate dataNasc, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }

    public Pessoa() {
        this.endereco = new Endereco();
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + ", endereco=" + endereco + '}';
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return nome.compareTo(outraPessoa.getNome());
    }

}