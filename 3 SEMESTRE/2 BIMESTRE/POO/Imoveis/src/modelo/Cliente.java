package modelo;

import java.time.LocalDate;


public class Cliente extends Pessoa{

    public Cliente() {
    }

    public Cliente(String nome, String cpf, LocalDate dataNasc, Endereco endereco) {
        super(nome, cpf, dataNasc, endereco);
    }
    
    
}
