package modelo;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.FutureOrPresent;
import org.hibernate.validator.constraints.Range;
import util.validacoes.CPF;

public class Funcionario extends Pessoa {

    @NotBlank(message = "A CTPS não pode estar em branco")
    @Pattern(regexp = "[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}-?[0-9]{2}", message = "cpf inválido! o CTPS deve estar no seguinte formato: xxx.xxx.xxx-xx")
    @CPF
    String ctps;

    @NotNull
    @PastOrPresent
    LocalDate dataAdmissao;

    @NotNull
    @FutureOrPresent         
    LocalDate dataDemissao;
    
    @NotNull
    @Range(min = 0, max = 200000, message = "O salário não pode ser menor que 0 e maior que 200000")
    double Salario;
    
    @NotNull
    boolean recebeValeTransporte;
    
    @NotNull
    boolean recebeValeAlimentacao;
    
    @PositiveOrZero
    int numeroDependentes;

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(LocalDate dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public boolean isRecebeValeTransporte() {
        return recebeValeTransporte;
    }

    public void setRecebeValeTransporte(boolean recebeValeTransporte) {
        this.recebeValeTransporte = recebeValeTransporte;
    }

    public boolean isRecebeValeAlimentacao() {
        return recebeValeAlimentacao;
    }

    public void setRecebeValeAlimentacao(boolean recebeValeAlimentacao) {
        this.recebeValeAlimentacao = recebeValeAlimentacao;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

}
