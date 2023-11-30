package modelo;

public class ProcessadorVendedor extends ProcessadorBase{

   

    public ProcessadorVendedor(Processador proximoProcessador) {
        super(proximoProcessador);
    }

    public void processar(Venda requisicao) {
        if(requisicao.getValor() > 0){
            if(requisicao.getDesconto() <= 10){
                System.out.println("Desconto de " + requisicao.getDesconto() + "% aprovado pelo Vendedor");
            }else{
                super.processar(requisicao);
            }
        }
        
    }
    
}
