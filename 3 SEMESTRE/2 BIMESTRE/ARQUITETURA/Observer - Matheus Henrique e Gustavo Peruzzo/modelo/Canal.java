package modelo;

import java.util.ArrayList;

public class Canal extends Subject {
   String nome;
   private ArrayList<Conteudo> conteudos = new ArrayList<Conteudo>();
   


public ArrayList<Conteudo> getConteudos() {
     return conteudos;
   }
  
   public void addConteudos(String nome) {
    Conteudo c = new Conteudo();
    c.setNome(nome);
    conteudos.add(c);
     notifyObservers();
   }
}
