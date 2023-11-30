package adapters;

import modelo.MaquinaCartao;
import modelo.MaquinaNovoCartao;

public class AdapterMaquinaCartaoNovo implements MaquinaCartao {
    
    private MaquinaNovoCartao maquina;
    
    public AdapterMaquinaCartaoNovo(MaquinaNovoCartao maquina){
        this.maquina = maquina;
    }
    
    @Override
    public void compra(){
        maquina.registrar(5.00);
    }   
}
