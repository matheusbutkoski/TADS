package modelo;

public class Presencial extends Lance{
    
   
        @Override
        public void criar(double valor, Leilao leilao) {
            super.setValor(valor);
            super.setLeilao(leilao);
            System.out.println("Lance presencial feito com sucesso no valor de: "+ valor);
            System.out.println("Lance realizado no Leilao de id: " + leilao.getId());
            
        }
    
}
