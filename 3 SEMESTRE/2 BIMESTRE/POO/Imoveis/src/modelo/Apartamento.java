package modelo;


public class Apartamento extends ImovelUrbano{

    public Apartamento() {
    }

    public Apartamento(String matriculaImovel, Pessoa proprietario, Endereco endereco, double largura, double comprimento, double valor) {
        super(matriculaImovel, proprietario, endereco, largura, comprimento, valor);
    }
    
    @Override
    protected double calcularIPTU() {
        return valor * 0.06;
    }

    
}
