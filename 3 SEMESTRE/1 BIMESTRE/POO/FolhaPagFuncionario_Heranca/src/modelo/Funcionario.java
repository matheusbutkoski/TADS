package modelo;

import util.DateUtils;
import java.time.LocalDate;

public abstract class Funcionario extends Pessoa {

    protected LocalDate dataAdmissao;
    protected String cargo;
    
    //Métodos Abstratos
    public abstract void calculoFolhaPagmento();

    public Funcionario(LocalDate dataAdmissao, String cargo, String nome, String cpf, LocalDate dataNasc, Endereco endereco) {
        super(nome, cpf, dataNasc, endereco);
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }

    public Funcionario() {

    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("   Cargo: "+cargo + " dataAdmissao: "+ dataAdmissao);
    }

    @Override
    public String toString() {
        return "Funcionario{" + super.toString() + "dataAdmissao=" + DateUtils.formatarDataBR(dataAdmissao) + ", cargo=" + cargo + '}';
    }

}
