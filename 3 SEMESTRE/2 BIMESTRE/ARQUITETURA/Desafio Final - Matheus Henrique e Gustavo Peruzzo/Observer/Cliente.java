import modelo.Leilao;
import modelo.Leiloeiro;

public class Cliente {
    public static void  main(String [] args) {
      
      Leilao l = new Leilao();
      l.addObserver(new Leiloeiro("A"));  
         
      l.addLances(1000, "Joao Pedro");
      l.addLances(1250, "Carlos");
  
    }
    
  }
  