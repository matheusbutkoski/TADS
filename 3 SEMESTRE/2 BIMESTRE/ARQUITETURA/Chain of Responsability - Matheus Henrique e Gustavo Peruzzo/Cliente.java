import modelo.Corrente;
import modelo.Venda;

public class Cliente {
    public static void  main(String [] args) {
      
      Corrente corrente = new Corrente();
  
      corrente.processar(new Venda(100, 12));
      corrente.processar(new Venda(150, 17));
      corrente.processar(new Venda(200, 8));
      corrente.processar(new Venda(250, 25));

    }
    
  }