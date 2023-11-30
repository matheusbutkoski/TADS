package modelo;

import java.rmi.StubNotFoundException;

import util.DateUtils;
import util.NumberUtils;

public abstract class Imovel {

    protected Integer id;
    protected String matriculaImovel;
    protected Pessoa proprietario;
    protected Endereco endereco;
    protected String tipo;
    protected double largura;
    protected double comprimento;
    protected double valor;

    // Método Abrstrato
    public abstract double calcularArea();

    public Imovel() {
        this.proprietario = new Pessoa();
        this.endereco = new Endereco();
    }

    public Imovel(String matriculaImovel, Pessoa proprietario, Endereco endereco, double largura, double comprimento,
            double valor) {
        this.matriculaImovel = matriculaImovel;
        this.proprietario = proprietario;
        this.endereco = endereco;
        this.largura = largura;
        this.comprimento = comprimento;
        this.valor = valor;
    }

    public String getMatriculaImovel() {
        return matriculaImovel;
    }

    public void setMatriculaImovel(String matriculaImovel) {
        this.matriculaImovel = matriculaImovel;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void exibirInformacoes() {
        System.out.println("Matricula imovel: " + matriculaImovel + " - Proprietário: " + proprietario.getNome()
                + "\tvalor: " + NumberUtils.formatarValorMonetario(valor));
    }

    public void exibirProprietario() {
        System.out.println(proprietario.getNome() + " CPF: " + proprietario.getCpf() + " Data de Nascimento: "
                + DateUtils.formatarDataBR(proprietario.getDataNasc()));
    }
}
