package modelo;

public abstract class ImovelRural extends Imovel {
    
    protected String cadPro;
    //ambiente rural
    public abstract double calcularICMS();
    
    @Override 
    public double calcularArea(){
        return largura * comprimento;
        
    }
    
}
