package modelo;

public interface Processador {
    
    public void setProximoProcessador(Processador proximoProcessador);
    
    public void processar(Venda requisicao);


}
