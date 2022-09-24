package modelo;


public class Apartamento extends ImovelUrbano{

    @Override
    protected double calcularIPTU() {
        return valor * 0.06;
    }
    
}
