package principal;

import java.time.LocalDate;
import java.util.Scanner;

public class Comissionado extends Funcionario {

    private double percentualComissao;
    private double salarioBase;
    private double cargaHoraria;
    private String ctps;

    public Comissionado(double percentualComissao, double salarioBase, double cargaHoraria, String ctps, LocalDate dataAdmissao, String cargo, String nome, String cpf, LocalDate dataNasc, Endereco endereco) {
        super(dataAdmissao, cargo, nome, cpf, dataNasc, endereco);
        this.percentualComissao = percentualComissao;
        this.salarioBase = salarioBase;
        this.cargaHoraria = cargaHoraria;
        this.ctps = ctps;
    }

    public Comissionado() {
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Comissionado{" + super.toString() + "percentualComissao=" + percentualComissao + ", salarioBase=" + salarioBase + ", cargaHoraria=" + cargaHoraria + ", ctps=" + ctps + '}';
    }

    @Override
    public double calcularSalario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de vendas realizadas no mês pelo funcionario: ");
        double vendas = sc.nextDouble();
        return salarioBase + (percentualComissao * vendas);
    }


}
