package modelo;

import java.time.LocalDate;

public class Cliente extends Pessoa{
    
    private double limiteCredito;

    public Cliente() {
    }

    public Cliente(double limiteCredito, String nome, String cpf, LocalDate dataNasc, Endereco endereco) {
        super(nome, cpf, dataNasc, endereco);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    
    
}
