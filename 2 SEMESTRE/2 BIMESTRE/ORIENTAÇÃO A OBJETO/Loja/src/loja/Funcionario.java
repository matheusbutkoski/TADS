
package loja;

import java.time.LocalDate;
import java.util.Date;


public class Funcionario extends Usuario {
    protected double bonus;
    protected String departamento;
    protected double salario;
    protected String ctps;
    protected LocalDate dataAdmissao;
    
    
    public void calcularSalario() {
       
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getBonus() {
        return bonus;
    }
    
    public double getSalario() {
        return salario;
    }

     public String getCtps() {
        return ctps;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    
    
}
