package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Negative;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.PositiveOrZero;
import util.validacoes.DESCONTOINSS;
import util.validacoes.DESCONTOIR;


public class FolhaPagFuncionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Range(min = 1900, max = 2023, message = "O ano deve conter 4 numeros")
    private int anoReferencia;

    @Range(min = 01, max = 12, message = "O mes deve conter 2 numeros")
    private int mesReferencia;

    @NotNull
    @PastOrPresent
    private LocalDate dataPagamento;
 
    @NotNull
    private LocalTime horasTrabalhadas;

    @Range(min = 0, max = 31, message = "Nao sao permitidas mais de 31 faltas")
    @PositiveOrZero
    private int faltasSemJustificativas;

    @Range(min = 1320, max = 100000, message = "Salario muito alto ou muito baixo")
    private double salarioBase;
    
    
    @Range(min = 5, max = 100, message = "Valor muito alto ou muito baixo")
    private double valorHorasExtras;
    
    private double TotalPreventos;
    
    @PositiveOrZero
    private double valorValeTransporte;
    
    @PositiveOrZero
    private double valorValeAlimentacao;
    
    @DESCONTOINSS
    private double descontoINSS;
    
    @DESCONTOIR
    private double descontoIR;
    
    @Range(min = 0, max = 6, message = "O valor nao pode exceder 6%")
    private double descontoValeTransporte;
    
    @Range(min = 0, max = 20, message = "O valor nao pode exceder 20%")
    private double descontoValeAlimentacao;
    
    private double valorFGTS = salarioBase * 0.08;
    
    private double totalDescontos = ((salarioBase - (salarioBase * descontoINSS)) + (salarioBase - (salarioBase * descontoIR)) + (valorValeTransporte - (valorValeTransporte * descontoValeTransporte)) + (valorValeAlimentacao - (valorValeAlimentacao * descontoValeAlimentacao)));
    
    private double salarioLiquido = (salarioBase + valorValeAlimentacao + valorValeTransporte) - totalDescontos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoReferencia() {
        return anoReferencia;
    }

    public void setAnoReferencia(int anoReferencia) {
        this.anoReferencia = anoReferencia;
    }

    public int getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(int mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public LocalTime getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(LocalTime horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getFaltasSemJustificativas() {
        return faltasSemJustificativas;
    }

    public void setFaltasSemJustificativas(int faltasSemJustificativas) {
        this.faltasSemJustificativas = faltasSemJustificativas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getValorHorasExtras() {
        return valorHorasExtras;
    }

    public void setValorHorasExtras(double valorHorasExtras) {
        this.valorHorasExtras = valorHorasExtras;
    }

    public double getTotalPreventos() {
        return TotalPreventos;
    }

    public void setTotalPreventos(double TotalPreventos) {
        this.TotalPreventos = TotalPreventos;
    }

    public double getValorValeTransporte() {
        return valorValeTransporte;
    }

    public void setValorValeTransporte(double valorValeTransporte) {
        this.valorValeTransporte = valorValeTransporte;
    }

    public double getValorValeAlimentacao() {
        return valorValeAlimentacao;
    }

    public void setValorValeAlimentacao(double valorValeAlimentacao) {
        this.valorValeAlimentacao = valorValeAlimentacao;
    }

    public double getDescontoINSS() {
        return descontoINSS;
    }

    public void setDescontoINSS(double descontoINSS) {
        this.descontoINSS = descontoINSS;
    }

    public double getDescontoIR() {
        return descontoIR;
    }

    public void setDescontoIR(double descontoIR) {
        this.descontoIR = descontoIR;
    }

    public double getDescontoValeTransporte() {
        return descontoValeTransporte;
    }

    public void setDescontoValeTransporte(double descontoValeTransporte) {
        this.descontoValeTransporte = descontoValeTransporte;
    }

    public double getDescontoValeAlimentacao() {
        return descontoValeAlimentacao;
    }

    public void setDescontoValeAlimentacao(double descontoValeAlimentacao) {
        this.descontoValeAlimentacao = descontoValeAlimentacao;
    }

    public double getValorFGTS() {
        return valorFGTS;
    }

    public void setValorFGTS(double valorFGTS) {
        this.valorFGTS = valorFGTS;
    }

    public double getTotalDescontos() {
        return totalDescontos;
    }

    public void setTotalDescontos(double totalDescontos) {
        this.totalDescontos = totalDescontos;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

}
