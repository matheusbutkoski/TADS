package modelo;

public class ProcessadorGerente extends ProcessadorBase {

    public ProcessadorGerente(Processador proximoProcessador) {
        super(proximoProcessador);
    }

 
    public void processar(Venda requisicao) {
        if(requisicao.getValor() > 0){
            if(requisicao.getDesconto() > 15 && requisicao.getDesconto() <= 20){
                System.out.println("Desconto de " + requisicao.getDesconto() + "% aprovado pelo Gerente");
            }else{
                System.out.println("Desconto nao enquadrado");
            }
        }
        
    }

    
}
