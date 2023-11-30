package factory;

import modelo.Lance;
import modelo.Leilao;

public abstract class LanceFactory {

    protected abstract Lance criarLance();

    public Lance ordemLances(double valor, Leilao leilao){
        Lance lance = criarLance();
        lance.criar(valor, leilao);
        return lance;
    }

}
