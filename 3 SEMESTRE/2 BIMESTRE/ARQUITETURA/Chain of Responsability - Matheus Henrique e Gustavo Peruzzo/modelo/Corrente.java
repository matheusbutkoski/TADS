package modelo;

public class Corrente {

    Processador processador;

    public Corrente() {

      processador = new ProcessadorVendedor(null);
      Processador p2 = new ProcessadorSupervisor(null);
      Processador p3 = new ProcessadorGerente(null);
      
      processador.setProximoProcessador(p2);
      p2.setProximoProcessador(p3);
      };
    

    public void processar(Venda requisicao) {
       processador.processar(requisicao);
    }
   }
    

