import modelo.Canal;
import modelo.Pessoa;

public class Cliente {
    public static void  main(String [] args) {
      
      Canal c = new Canal();
      c.addObserver(new Pessoa("A"));
      c.addObserver(new Pessoa("B"));
      c.addObserver(new Pessoa("C"));
      c.addObserver(new Pessoa("D"));
      c.addConteudos("video novo");
  
    }
    
  }
  