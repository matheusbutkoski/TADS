package template_method;

public abstract class Imovel {
    protected double valor;

    public Imovel(double valor) {
        this.valor = valor;
    }

    public abstract double calcularImposto();

    public double carregarImpostoImovel(){
        double imposto = calcularImposto();

        return imposto;
    }

}
