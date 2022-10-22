package principal;

import java.time.LocalDate;
import java.util.Scanner;

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
    public double calcularSalario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        double horas = sc.nextDouble();
        return valorHora * horas;
    }

}
