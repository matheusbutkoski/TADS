package builder.java.atividade_casa.builders;

import builder.java.atividade_casa.casas.Casa;
import builder.java.atividade_casa.casas.TipoDeCasa;
import builder.java.atividade_casa.componentes.Parede;
import builder.java.atividade_casa.componentes.Teto;

public class CasaBuilder implements Builder{
 
    private TipoDeCasa tipoDaCasa;
    private int portas;
    private Parede paredes;
    private Teto teto;
    private int quartos;
    private int janelas;
    private int garagem;
@Override
    public void setTipoDeCasa(TipoDeCasa tipoDaCasa) {
        this.tipoDaCasa = tipoDaCasa;
    }

    
    public void setJanelas(int janelas) {
        this.janelas = janelas;
    }

    
    public void setPortas(int portas) {
        this.portas = portas;
    }

    
    public void setParedes(Parede paredes) {
        this.paredes = paredes;
    }
    
    public void setTeto(Teto teto) {
        this.teto = teto;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public void setGaragem(int espacoGaragem) {
        this.garagem = espacoGaragem;       
    }

    public Casa getResultado(){
        return new Casa(tipoDaCasa,janelas,portas,paredes,teto,quartos,garagem);
    }


}
