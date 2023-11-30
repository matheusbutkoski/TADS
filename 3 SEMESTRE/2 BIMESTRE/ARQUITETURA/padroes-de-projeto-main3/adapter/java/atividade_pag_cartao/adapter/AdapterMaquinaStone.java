
public class AdapterMaquinaStone implements MaquinaCartao {
    
    private MaquinaStone maquina;
    
    public MaquinaStoneAdapter(MaquinaStone maquina){
        this.maquina = maquina;
    }
    
    @Override
    public void compra(){
        maquina.registrar(5.00);
    }
}
