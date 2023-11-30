package modelo;

import template_method.Imovel;

public class ImovelUrbano extends Imovel{

    public ImovelUrbano(double valor) {
        super(valor);
    }
    
    public double calcularImposto(){
        return valor * 0.01;
    }
}
