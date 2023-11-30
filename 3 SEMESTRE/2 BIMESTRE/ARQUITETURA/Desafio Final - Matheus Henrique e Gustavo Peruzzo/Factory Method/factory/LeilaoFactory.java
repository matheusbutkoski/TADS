package factory;

import modelo.Leilao;

public abstract class LeilaoFactory {

    protected abstract Leilao criarLeilao();

    public Leilao ordemLeilao(int id){
         Leilao leilao = criarLeilao(); 
         leilao.criar(id);
         return leilao;

    }
}
