package principal;

import java.time.LocalDate;


public class Mensalista extends Funcionario {

    private double salarioBase;
    private int cargaHoraria;
    private String ctps;

    public Mensalista(double salarioBase, int cargaHoraria, String ctps, LocalDate dataAdmissao, String cargo, String nome, String cpf, LocalDate dataNasc, Endereco endereco) {
        super(dataAdmissao, cargo, nome, cpf, dataNasc, endereco);
        this.salarioBase = salarioBase;
        this.cargaHoraria = cargaHoraria;
        this.ctps = ctps;
    }

    public Mensalista() {

    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Mensalista{" + super.toString() + "salarioBase=" + salarioBase + ", cargaHoraria=" + cargaHoraria + ", ctps=" + ctps + '}';
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
