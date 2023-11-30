

import modelo.Circulo;
import modelo.Retangulo;

public class Cliente {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        circulo.x = 5;
        circulo.y = 15;
        circulo.radius = 15;
        circulo.cor = "vermelho";
       
        Circulo outroCirculo = (Circulo) circulo.clone();

        System.out.println(circulo.toString());
        System.out.println(outroCirculo.toString());

        Retangulo retangulo = new Retangulo();
        retangulo.largura = 15;
        retangulo.altura = 30;
        retangulo.cor = "azul";
        
        Retangulo outroRetangulo = (Retangulo) retangulo.clone();

        System.out.println(retangulo.toString());
        System.out.println(outroRetangulo.toString());
        
    }
 }