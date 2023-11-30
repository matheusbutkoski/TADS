package PadraoAdapter.adapters;

import PadraoAdapter.modelo.Leilao;
import PadraoAdapter.modelo.LeilaoOnline;

public class AdapterLeilaoOnline implements Leilao {

    private LeilaoOnline leilao;

    public AdapterLeilaoOnline(LeilaoOnline leilao) {
        this.leilao = leilao;
    }
    @Override
    public void criar() {
        leilao.processar();
        
    }
    
}
