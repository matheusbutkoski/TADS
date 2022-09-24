package controle;

public class Sitio extends ImovelRural{

    @Override
    public double calcularICMS() {  
        return valor * 0.04;
    }
    
}
