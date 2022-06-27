package loja;

import static java.lang.Math.pow;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;


public class Gerente extends Funcionario {

public Gerente(){
    
}    
    
     public Gerente(String n, String l, String s, String e, String Cpf, String Ctps, LocalDate data, String dep, double sal, double bon, Endereco end){
        super.nome = n;
        super.login = l;
        super.email = e;
        super.senha = s;
        super.cpf = Cpf;
        super.ctps = Ctps;
        super.salario = sal;
        super.departamento = dep;
        super.bonus = bon;
        super.dataAdmissao = data;
        super.endereco = end;
        super.tipoUsuario = "Gerente";
    }



    
    @Override
    public void calcularSalario() {
       
        LocalDate dataHoje = LocalDate.now();
        long dif = ChronoUnit.YEARS.between(dataAdmissao, dataHoje);
        double salarioBonus = salario + bonus;
        double salarioFinal = salarioBonus * pow(1.01f, dif);
        System.out.format("Salario: %.2f\n", salarioFinal);
    }
    
    
}

