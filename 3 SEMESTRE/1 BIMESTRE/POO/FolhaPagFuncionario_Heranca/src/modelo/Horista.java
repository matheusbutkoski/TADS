package modelo;

import util.Input;
import util.NumberUtils;
import java.time.LocalDate;
import java.util.Scanner;
import controle.CadastroFuncionario;

public class Horista extends Funcionario {

    private double valorHora;
    private String ctps;

    public Horista(double valorHora, String ctps, LocalDate dataAdmissao, String cargo, String nome, String cpf, LocalDate dataNasc, Endereco endereco) {
        super(dataAdmissao, cargo, nome, cpf, dataNasc, endereco);
        this.valorHora = valorHora;
        this.ctps = ctps;
    }

    public Horista() {

    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @Override
    public String toString() {
        return "Horista{"+ super.toString() + "valorHora=" + valorHora + ", ctps=" + ctps + '}';
    }
    
    @Override
    public void calculoFolhaPagmento() {
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horas = Input.nextDouble();
        double salarioBase = valorHora * horas;
        double descontoINSS = CadastroFuncionario.calculoDescontoINSS(salarioBase);
        double fgts = CadastroFuncionario.calculoFGTS(salarioBase);
        System.out.println("\tSalário Bruto: "+ NumberUtils.formatarValorMonetario(salarioBase) );
        System.out.println("\tDesconto INSS: "+ NumberUtils.formatarValorMonetario(descontoINSS));
        System.out.print("\tSalário Líquído: "+ NumberUtils.formatarValorMonetario(salarioBase - descontoINSS));
        System.out.println("\tFGTS: "+ NumberUtils.formatarValorMonetario(fgts));
    }

}
