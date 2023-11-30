package adapter;

public class Cliente {

    public static void main(String[] args) {
        
        MaquinaCieloAdapter MaquinaCielo = new MaquinaCieloAdapter(new MaquinaCielo());
        
        MaquinaStoneAdapter MaquinaStone = new MaquinaStoneAdapter(new MaquinaStone());
        
        ControleMaquinas ControlaMaquina = new ControleMaquinas();
        
        ControlaMaquina.iniciar(MaquinaCielo);
        ControlaMaquina.iniciar(MaquinaStone);
    }
    
}
