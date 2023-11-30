package modelo;

import template_method.Imovel;

public class ImovelRural extends Imovel{

    protected int hectares;

    public ImovelRural(double valor, int hectares) {
        super(valor);
        this.hectares = hectares;
    }


    public double calcularImposto(){
        double imposto = 0;
        if(hectares <= 30){
            imposto = valor * 0.01;
        }

        if(hectares > 30 && hectares < 50){
            imposto = valor * 0.015;
        }

        if(hectares >= 50){
             imposto = valor * 0.02;
        }
        return imposto;
    }

    
}
