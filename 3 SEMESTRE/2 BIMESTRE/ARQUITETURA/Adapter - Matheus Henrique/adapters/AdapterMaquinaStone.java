package adapters;

import modelo.MaquinaCartao;
import modelo.MaquinaStone;

public class AdapterMaquinaStone implements MaquinaCartao {
    
    private MaquinaStone maquina;
    
    public AdapterMaquinaStone(MaquinaStone maquina){
        this.maquina = maquina;
    }
    
    @Override
    public void compra(){
        maquina.registrar(7.00);
    }
}
