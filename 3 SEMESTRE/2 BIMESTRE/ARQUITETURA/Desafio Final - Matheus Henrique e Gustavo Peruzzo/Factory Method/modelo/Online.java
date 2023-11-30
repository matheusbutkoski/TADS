package modelo;

public class Online extends Lance{


    @Override
    public void criar(double valor, Leilao leilao) {
        super.setValor(valor);
        super.setLeilao(leilao);
        System.out.println("Lance online feito com sucesso no valor de: "+ valor);
        System.out.println("Lance realizado no Leilao de id: " + leilao.getId());
        
    }

    @Override
    public String toString() {
        return "Online [valor=" + valor + ", leilao=" + leilao.toString() + "]";
    }
    
}
