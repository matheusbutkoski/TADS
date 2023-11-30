package modelo;

import java.util.ArrayList;

public class Leilao extends Subject{
    private ArrayList<Lance> lances = new ArrayList<Lance>();

    
public ArrayList<Lance> getLances() {
    return lances;
  }
 
  public void addLances(double valor, String nome) {
   Lance c = new Lance();
   c.setValor(valor);
   c.setNome(nome);
   lances.add(c);
    notifyObservers();
  }
}
