package modelo;


public class Casa extends ImovelUrbano{

    @Override
    protected double calcularIPTU() {
        return valor * 0.05;
    }

    public Casa() {
    }

    public Casa(String matriculaImovel, Pessoa proprietario, Endereco endereco, double largura, double comprimento, double valor) {
        super(matriculaImovel, proprietario, endereco, largura, comprimento, valor);
    }
    
}
