package adapter;

public class MaquinaCieloAdapter implements MaquinaCartao {
    
    private MaquinaCielo maquina;
    
    public MaquinaCieloAdapter(MaquinaCielo maquina){
        this.maquina = maquina;
    }
    
    @Override
    public void compra(){
        maquina.processar(5.00);
    }   
}
