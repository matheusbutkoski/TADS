package PadraoAdapter.adapters;

import PadraoAdapter.modelo.Lance;
import PadraoAdapter.modelo.LanceOnline;
import PadraoAdapter.modelo.Leilao;

public class AdapterLanceOnline implements Lance {
    
private LanceOnline lance;

public AdapterLanceOnline(LanceOnline lance, Leilao leilao){
    this.lance = lance;
    lance.setLeilao(leilao);
}

@Override
public void fazer() {
    lance.processar(2.000, lance.getLeilao());
    
}

}
