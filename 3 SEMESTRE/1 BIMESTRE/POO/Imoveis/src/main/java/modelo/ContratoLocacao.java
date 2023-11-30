
package modelo;

import java.time.LocalDate;


public class ContratoLocacao extends Contrato {
    protected LocalDate dataInicio;
    protected LocalDate dataTermino;
    protected double percentualMulta;

    public ContratoLocacao() {
    }

    public ContratoLocacao(LocalDate dataInicio, LocalDate dataTermino, double percentualMulta, int id, Vendedor funcionario, Pessoa cliente, Imovel imovel, double valor) {
        super(id, funcionario, cliente, imovel, valor);
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.percentualMulta = percentualMulta;
    }

    
    
    
    
}
