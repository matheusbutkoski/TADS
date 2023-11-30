package modelo;

public abstract class ImovelUrbano extends Imovel{

    protected abstract double calcularIPTU();

    public ImovelUrbano() {
    }

    public ImovelUrbano(String matriculaImovel, Pessoa proprietario, Endereco endereco, double largura, double comprimento, double valor) {
        super(matriculaImovel, proprietario, endereco, largura, comprimento, valor);
    }
    
    @Override
    public double calcularArea() {
        return largura * comprimento;
    }
}
