
package herancapolimorfismo;

import java.time.LocalDate;

public class Estagiario extends Funcionario{
    protected int cargaHoraria;
    protected float salarioBase;
    
    public Estagiario(String n, String c, LocalDate d, Endereco e, String cg, LocalDate da){
        super.nome = n;
        super.cpf = c;
        super.endereco = e;
        super.dataNasc = d;
        super.cargo = cg;
        super.dataAdmissao = da;
 
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    
     @Override
 public float calcularSalario(float qtd){
    return salarioBase;
} 
 @Override
    public float calcularFGTS(float total){
        return 0;
    }
    @Override
    public String toString() {
        return super.toString() + " Estagiario - " + "Carga Horaria: " + cargaHoraria + ", Salario Base: " + salarioBase;
    }
    
    
}
