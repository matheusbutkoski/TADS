package modelo;

import java.time.LocalDate;


public class Cliente extends Pessoa{

    public Cliente() {
    }

    public Cliente(Integer id, String nome, String cpf, LocalDate dataNasc, Endereco endereco) {
        super(id, nome, cpf, dataNasc, endereco);
    }
    
    
}
