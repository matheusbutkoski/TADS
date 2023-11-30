package modelo;

import java.util.ArrayList;

public class Pessoa implements Observer {

    public Pessoa(String nome) {
        this.nome = nome;
    }

    String nome;

    public void update(Subject s) {
         
        ArrayList<Conteudo> canal = ((Canal) s).getConteudos();
        System.out.println("Conteudo Novo Adicionado no canal: " + canal.get(0).getNome());
      }
}
