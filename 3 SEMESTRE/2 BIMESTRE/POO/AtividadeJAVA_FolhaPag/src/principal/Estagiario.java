package principal;

import java.time.LocalDate;
import java.util.Date;

public class Estagiario extends Funcionario {

    private double salarioBase;
    private int cargaHoraria;

    public Estagiario(double salarioBase, int cargaHoraria, LocalDate dataAdmissao, String cargo, String nome, String cpf, LocalDate dataNasc, Endereco endereco) {
        super(dataAdmissao, cargo, nome, cpf, dataNasc, endereco);
        this.salarioBase = salarioBase;
        this.cargaHoraria = cargaHoraria;
    }

    public Estagiario() {

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Estagiario{" + super.toString() + "salarioBase=" + salarioBase + ", cargaHoraria=" + cargaHoraria + '}';
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

}
