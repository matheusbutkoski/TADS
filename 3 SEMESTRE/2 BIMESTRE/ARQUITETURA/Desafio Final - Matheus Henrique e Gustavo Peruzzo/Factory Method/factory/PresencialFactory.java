package factory;

import modelo.Lance;
import modelo.Presencial;

public class PresencialFactory extends LanceFactory {

    @Override
    protected Lance criarLance() {
        return new Presencial();
    }
    
}
