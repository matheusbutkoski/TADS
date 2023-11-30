package PadraoAdapter.modelo;

public class LanceOnline {

    public Leilao leilao;
    
    public Leilao getLeilao() {
        return leilao;
    }
    public void setLeilao(Leilao leilao) {
        this.leilao = leilao;
    }
    public void processar(Double valor, Leilao leilao) {
        System.out.println("Lance efetuado com sucesso no valor de: " + valor);
    }
}
