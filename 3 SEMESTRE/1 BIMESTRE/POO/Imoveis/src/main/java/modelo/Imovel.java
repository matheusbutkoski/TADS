
package modelo;

public abstract class Imovel implements Comparable<Imovel> {
    
    protected String matriculaImovel;
    protected Pessoa proprietario;
    protected Endereco endereco;
    protected double largura;
    protected double comprimento;
    protected double valor;
    protected String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Imovel{" + "matriculaImovel=" + matriculaImovel + ", proprietario=" + proprietario + ", endereco=" + endereco + ", largura=" + largura + ", comprimento=" + comprimento + ", valor=" + valor + ", status=" + status + '}';
    }
 
    
    public abstract double calcularArea();
}
