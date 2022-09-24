package modelo;

import util.Input;
import util.NumberUtils;
import java.time.LocalDate;
import java.util.Scanner;
import controle.CadastroFuncionario;

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
    public void calculoFolhaPagmento() {
        System.out.print("Digite o valor total de vendas no mês: ");
        double vendas = Input.nextDouble();
        salarioBase += (vendas * percentualComissao);
        double descontoINSS = CadastroFuncionario.calculoDescontoINSS(salarioBase);
        double fgts = CadastroFuncionario.calculoFGTS(salarioBase);
        System.out.println("\tSalário Bruto: "+ NumberUtils.formatarValorMonetario(salarioBase) );
        System.out.println("\tDesconto INSS: "+ NumberUtils.formatarValorMonetario(descontoINSS));
        System.out.print("\tSalário Líquído: "+ NumberUtils.formatarValorMonetario(salarioBase - descontoINSS));
        System.out.println("\tFGTS: "+ NumberUtils.formatarValorMonetario(fgts));
    }


}
