package factory;

import modelo.Lance;
import modelo.Online;

public class OnlineFactory extends LanceFactory {

    @Override
    protected Lance criarLance() {
        return new Online();
    }
    
}
