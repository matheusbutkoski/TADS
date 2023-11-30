import facade.ComputadorFacade;

public class Cliente {

    public static void main(String[] args) {
        
        System.out.println("Atividade muito simples do padrão Facade");
        ComputadorFacade computerFacade = new ComputadorFacade();
        computerFacade.incializarComputador();
    }
    
}
