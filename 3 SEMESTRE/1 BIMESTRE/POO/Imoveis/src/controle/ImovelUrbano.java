package controle;

public abstract class ImovelUrbano extends Imovel{

    protected abstract double calcularIPTU();
    
    @Override
    public double calcularArea() {
        return largura * comprimento;
    }
}
