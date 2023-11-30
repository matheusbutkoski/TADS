package modelo;

import java.time.LocalDate;


public class Vendedor extends Pessoa{
    private double percentualComissao;
    private double salario;

    public Vendedor() {
    }

    public Vendedor(double percentualComissao, double salario, Integer id, String nome, String cpf, LocalDate dataNasc, Endereco endereco) {
        super(id, nome, cpf, dataNasc, endereco);
        this.percentualComissao = percentualComissao;
        this.salario = salario;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}