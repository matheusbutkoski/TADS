package facade;

import modelo.Armazenamento;
import modelo.CPU;
import modelo.Memoria;

public class ComputadorFacade {
     
    Armazenamento armazenamento = new Armazenamento();
    CPU cpu = new CPU();
    Memoria memoria = new Memoria();
   

    public void incializarComputador(){
        
        System.out.println("Inicializando computador...");
        
        cpu.iniciarProcessamento();
        memoria.iniciarCarregamento();
        armazenamento.iniciarLeituraDeDados();
        System.out.println("Inicialização do computador completada");
    }

}
