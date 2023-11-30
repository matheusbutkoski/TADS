import adapters.AdapterMaquinaCartaoNovo;
import adapters.AdapterMaquinaCielo;
import adapters.AdapterMaquinaStone;
import controle.ControleMaquinas;
import modelo.MaquinaCielo;
import modelo.MaquinaNovoCartao;
import modelo.MaquinaStone;


public class Cliente {

    public static void main(String[] args) {
        
        AdapterMaquinaCielo MaquinaCielo = new AdapterMaquinaCielo(new MaquinaCielo());
        
        AdapterMaquinaStone MaquinaStone = new AdapterMaquinaStone(new MaquinaStone());

        AdapterMaquinaCartaoNovo MaquinaNova = new AdapterMaquinaCartaoNovo(new MaquinaNovoCartao());
        
        ControleMaquinas ControlaMaquina = new ControleMaquinas();
        
        ControlaMaquina.iniciar(MaquinaCielo);
        ControlaMaquina.iniciar(MaquinaNova);
        ControlaMaquina.iniciar(MaquinaStone);
        
    }
    
}
