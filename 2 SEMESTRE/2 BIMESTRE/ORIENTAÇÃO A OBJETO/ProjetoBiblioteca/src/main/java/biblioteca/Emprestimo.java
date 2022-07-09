
package biblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private Obra obra;
    private Pessoa pessoa;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDev;
    private LocalDate dataDevolucao;
    private String situacao;
    private float multaPaga;
    
    public Emprestimo(){
        this.situacao = "Pendente";
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataPrevistaDev() {
        return dataPrevistaDev;
    }

    public void setDataPrevistaDev(LocalDate dataPrevistaDev) {
        this.dataPrevistaDev = dataPrevistaDev;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public float getMultaPaga() {
        return multaPaga;
    }

    public void setMultaPaga(float multaPaga) {
        this.multaPaga = multaPaga;
    }


public float calcularMulta(LocalDate dataDevPrev, LocalDate dataDev){
   float valor;
    long dif = ChronoUnit.DAYS.between(dataDevPrev, dataDev);
    if(dif > 0){
        valor = dif * 2;
        return valor;
    }
    return 0;
}

    @Override
    public String toString() {
        return "Data do Emprestimo: " + dataEmprestimo + ", Data de Devolucao: " + dataDevolucao + ", Situacao: " + situacao + ", MultaPaga: " + multaPaga;
    }
 

 
}

