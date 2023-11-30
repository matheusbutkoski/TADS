package modelo;

public abstract class Lance {
    
    public double valor;
    public Leilao leilao;
    public abstract void criar(double valor, Leilao leilao);
    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Leilao getLeilao() {
        return leilao;
    }
    public void setLeilao(Leilao leilao) {
        this.leilao = leilao;
    }


}
