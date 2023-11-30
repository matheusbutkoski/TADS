package adapters;

import modelo.MaquinaCartao;
import modelo.MaquinaCielo;

public class AdapterMaquinaCielo implements MaquinaCartao {
    
    private MaquinaCielo maquina;
    
    public AdapterMaquinaCielo(MaquinaCielo maquina){
        this.maquina = maquina;
    }
    
    @Override
    public void compra(){
        maquina.processar(3.00);
    }   
}
