package facade.java.atividade_computador.facade;

import facade.java.atividade_computador.modelo.Armazenamento;
import facade.java.atividade_computador.modelo.CPU;
import facade.java.atividade_computador.modelo.Memoria;

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
