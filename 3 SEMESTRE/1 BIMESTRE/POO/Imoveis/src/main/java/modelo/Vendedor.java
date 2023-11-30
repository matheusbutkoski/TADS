package modelo;

import java.time.LocalDate;

public class Vendedor extends Pessoa {
    protected double comissao;
    protected double salario;
    
    
    public Vendedor(){
        
    }

    public Vendedor(double comissao, double salario, String nome, String cpf, LocalDate dataNasc, Endereco endereco) {
        super(nome, cpf, dataNasc, endereco);
        this.comissao = comissao;
        this.salario = salario;
    }

   
    
    
}
