package PadraoAdapter.adapters;

import PadraoAdapter.modelo.Lance;
import PadraoAdapter.modelo.LancePresencial;
import PadraoAdapter.modelo.Leilao;

public class AdapterLancePresencial implements Lance {
    
private LancePresencial lance;

public AdapterLancePresencial(LancePresencial lance, Leilao leilao){
    this.lance = lance;
    lance.setLeilao(leilao);
}

@Override
public void fazer() {
    lance.processar(5.000, lance.getLeilao());
    
}
}