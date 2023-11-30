package modelo;

import java.util.ArrayList;

public class Leiloeiro implements Observer {

    public Leiloeiro(String nome) {
        this.nome = nome;
    }

    String nome;

    public void update(Subject s) {
         
        ArrayList<Lance> leilao = ((Leilao) s).getLances();

           
            System.out.println("Lance Novo no leilao!");
            System.out.println("Lances Registrados:");
            
            for(int i =0;i< leilao.size();i++){
                System.out.println("R$ " + leilao.get(i).getValor() + " - " + leilao.get(i).getNome());
            }
            System.out.println("-------------------");
        
      }
}