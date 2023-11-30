package modelo;

public class Venda {

   private double valor;
   private double desconto;

public Venda(double valor, double desconto) {
    this.valor = valor;
    this.desconto = desconto;
}

public double getDesconto() {
    return desconto;
}

public void setDesconto(double desconto) {
    this.desconto = desconto;
}

public double getValor() {
    return valor;
}

public void setValor(double valor) {
    this.valor = valor;
}
   
    
}
