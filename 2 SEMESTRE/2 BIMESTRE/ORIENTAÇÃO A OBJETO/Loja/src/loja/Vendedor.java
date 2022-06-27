package loja;

import static java.lang.Math.pow;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vendedor extends Funcionario {
    
    public Vendedor(){
        
    }
    
    public Vendedor(String n, String l, String s, String e, String Cpf, String Ctps, LocalDate data, double sal, Endereco end){
        super.nome = n;
        super.login = l;
        super.email = e;
        super.senha = s;
        super.cpf = Cpf;
        super.ctps = Ctps;
        super.salario = sal;
        super.dataAdmissao = data;
        super.endereco = end;
        super.tipoUsuario = "Vendedor";
    }
 


    @Override
    public void calcularSalario() {
       
        LocalDate dataHoje = LocalDate.now();
        long dif = ChronoUnit.YEARS.between(dataAdmissao, dataHoje);
        double salarioFinal = salario * pow(1.01f, dif);
        System.out.format("Salario: %.2f\n", salarioFinal);
    }
    
    
}
