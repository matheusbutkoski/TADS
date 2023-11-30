package modelo;

public abstract class ImovelRural extends Imovel{
    
    protected  String cadPro;
    
    public abstract double calcularICMS();
    
    @Override
    public double calcularArea(){
        return largura * comprimento;
    }

    public String getCadPro() {
        return cadPro;
    }

    public void setCadPro(String cadPro) {
        this.cadPro = cadPro;
    }
    
    
}
