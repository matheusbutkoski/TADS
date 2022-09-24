package modelo;

public abstract class Imovel {
    
    protected String matriculaImovel;
    protected Pessoa proprietario;
    protected Endereco endereco;
    protected double largura;
    protected double comprimento;
    protected double valor;
    
    //Método Abrstrato
    public abstract double calcularArea();

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
    
    
}
