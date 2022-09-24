package controle;


public class Casa extends ImovelUrbano{

    @Override
    protected double calcularIPTU() {
        return valor * 0.05;
    }
    
}
