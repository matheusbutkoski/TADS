package factory;

import modelo.Leilao;
import modelo.LeilaoPresencial;

public class LeilaoPresencialFactory extends LeilaoFactory {
    @Override
    protected Leilao criarLeilao() {
        return new LeilaoPresencial();
    }
}
