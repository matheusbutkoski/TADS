import builder.CasaBuilder;
import modelo.Casa;

public class Cliente{

    public static void main(String [] args) {
     
        Casa casa = new CasaBuilder().setQuartos(2)
                                      .setJanelas(3)
                                      .setJardim(true)
                                      .setM2(80)
                                      .setEspacoGaragem(1)
                                      .setBanheiros(2)
                                      .build();
        System.out.println("Casa 1: " + casa.toString());
        
        Casa sobrado = new CasaBuilder().setQuartos(3)
                                      .setJanelas(4)
                                      .setJardim(true)
                                      .setM2(120)
                                      .setEspacoGaragem(2)
                                      .setBanheiros(3)
                                      .build();

        System.out.println("Casa 2: " + sobrado.toString());         
        
        Casa kitnet = new CasaBuilder().setQuartos(1)
                                      .setJanelas(2)
                                      .setJardim(false)
                                      .setM2(40)
                                      .setEspacoGaragem(0)
                                      .setBanheiros(1)
                                      .build();

        System.out.println("Casa 3: " + kitnet.toString());           

     }


}