package factory;

import modelo.Leilao;
import modelo.LeilaoOnline;

public class LeilaoOnlineFactory extends LeilaoFactory{

    @Override
    protected Leilao criarLeilao() {
        return new LeilaoOnline();
    }
    
}
