package modelo;

public class ProcessadorSupervisor extends ProcessadorBase {

    public ProcessadorSupervisor(Processador proximoProcessador) {
        super(proximoProcessador);
    }

 
    public void processar(Venda requisicao) {
        if(requisicao.getValor() > 0){
            if(requisicao.getDesconto() > 10 && requisicao.getDesconto() <= 15){
                System.out.println("Desconto de " + requisicao.getDesconto() + "% aprovado pelo Supervisor");
            }else{
                super.processar(requisicao);
            }
        }
        
    }

    
}