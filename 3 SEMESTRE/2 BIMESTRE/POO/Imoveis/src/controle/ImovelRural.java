package controle;

public abstract class ImovelRural extends Imovel{
    
    protected  String cadPro;
    
    public abstract double calcularICMS();
    
    @Override
    public double calcularArea(){
        return largura * comprimento;
    }
}
