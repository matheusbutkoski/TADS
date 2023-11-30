import PadraoAdapter.adapters.AdapterLanceOnline;
import PadraoAdapter.adapters.AdapterLancePresencial;
import PadraoAdapter.adapters.AdapterLeilaoOnline;
import PadraoAdapter.controle.ControlaLeiloes;
import PadraoAdapter.controle.ControleLances;
import PadraoAdapter.modelo.LanceOnline;
import PadraoAdapter.modelo.LancePresencial;
import PadraoAdapter.modelo.LeilaoOnline;

public class Cliente {

    public static void main(String[] args) {
    AdapterLeilaoOnline leilaoOnline = new AdapterLeilaoOnline(new LeilaoOnline());

    ControlaLeiloes controlaLeilao = new ControlaLeiloes();
    
    controlaLeilao.novoLeilao(leilaoOnline);

    AdapterLancePresencial lancePresencial = new AdapterLancePresencial(new LancePresencial(), leilaoOnline);

    AdapterLanceOnline lanceOnline = new AdapterLanceOnline(new LanceOnline(), leilaoOnline);

    ControleLances controlaLances = new ControleLances();

   


    controlaLances.darLance(lanceOnline);
    controlaLances.darLance(lancePresencial);

    }
    
}
