package builder.java.atividade_casa;

import builder.java.atividade_casa.builders.CasaBuilder;
import builder.java.atividade_casa.casas.Casa;
import builder.java.atividade_casa.diretor.Diretor;

public class Cliente {
    
    public static void main(String[] args) {
       
        Diretor diretor = new Diretor();
        
        CasaBuilder builder = new CasaBuilder();
        diretor.construirCasaPiscina(builder);

        Casa casa = builder.getResultado();
        System.out.println("Casa construída:\n" + casa.print());
 }
}

