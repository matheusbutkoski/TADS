package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ConfiguracaoFolhaPag {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    int anoVigencia;
    boolean ativo;
    
    double valorDiaValeAlimentacao;
    double valorDiaValeTransporte;
    double percentualDescontoValeTransporte;
    double percentualDescontoValeAlimentacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoVigencia() {
        return anoVigencia;
    }

    public void setAnoVigencia(int anoVigencia) {
        this.anoVigencia = anoVigencia;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getValorDiaValeAlimentacao() {
        return valorDiaValeAlimentacao;
    }

    public void setValorDiaValeAlimentacao(double valorDiaValeAlimentacao) {
        this.valorDiaValeAlimentacao = valorDiaValeAlimentacao;
    }

    public double getValorDiaValeTransporte() {
        return valorDiaValeTransporte;
    }

    public void setValorDiaValeTransporte(double valorDiaValeTransporte) {
        this.valorDiaValeTransporte = valorDiaValeTransporte;
    }

    public double getPercentualDescontoValeTransporte() {
        return percentualDescontoValeTransporte;
    }

    public void setPercentualDescontoValeTransporte(double percentualDescontoValeTransporte) {
        this.percentualDescontoValeTransporte = percentualDescontoValeTransporte;
    }

    public double getPercentualDescontoValeAlimentacao() {
        return percentualDescontoValeAlimentacao;
    }

    public void setPercentualDescontoValeAlimentacao(double percentualDescontoValeAlimentacao) {
        this.percentualDescontoValeAlimentacao = percentualDescontoValeAlimentacao;
    }
    
    
}
