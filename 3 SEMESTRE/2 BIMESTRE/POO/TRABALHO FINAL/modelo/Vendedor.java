package modelo;

import util.NumberUtils;

public class Vendedor extends Pessoa implements Entidade{
    double salario;
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public void exibirInformacoes() {
        System.out.print(nome + " CPF: " + cpf + " Salario: " +  NumberUtils.formatarValorMonetario(salario));
        endereco.exibirInformacoes();
        
    }

    
}
