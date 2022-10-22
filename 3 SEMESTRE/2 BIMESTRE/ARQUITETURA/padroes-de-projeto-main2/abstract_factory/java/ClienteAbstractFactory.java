package abstract_factory.java;

import abstract_factory.java.Factory.FabricaFactory;
import abstract_factory.java.Factory.FabricaModernaFactory;
import abstract_factory.java.Factory.FabricaVitorianoFactory;
import abstract_factory.java.Factory.FabricaArtDecoFactory;
import abstract_factory.java.Modelo.Cadeira;
import abstract_factory.java.Modelo.MesaDeCentro;
import abstract_factory.java.Modelo.Sofa;

public class ClienteAbstractFactory {

    public static void main(String[] args) {
     
        
        System.out.println("### Fabricando móveis  ###");        
        
        //Matheus Henrique Butkoski Silva
        //FabricaFactory factory = new FabricaModernaFactory();
        FabricaFactory factory = new FabricaArtDecoFactory();
        //FabricaFactory factory = new FabricaVitorianoFactory();

        Cadeira cadeira = factory.fabricaCadeira();
        cadeira.sentar();
        System.out.println(cadeira.toString());
        
        System.out.println(" ");        
        
        MesaDeCentro mesaDeCentro = factory.fabricaMesaDeCentro();
        mesaDeCentro.colocarDecoracao();
        System.out.println(mesaDeCentro.toString());

        System.out.println(" ");  

        Sofa sofa = factory.fabricaSofa();
        sofa.deitar();
        System.out.println(sofa.toString());

        
        
    }
    
}
