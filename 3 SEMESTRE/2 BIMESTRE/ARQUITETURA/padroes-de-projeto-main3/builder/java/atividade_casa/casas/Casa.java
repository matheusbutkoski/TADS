package builder.java.atividade_casa.casas;

import builder.java.atividade_casa.componentes.Parede;
import builder.java.atividade_casa.componentes.Teto;

public class Casa {
    private final TipoDeCasa tipoDeCasa;

    public TipoDeCasa getTipoDeCasa() {
        return tipoDeCasa;
    }

    private final int janelas;
    
    public int getJanelas() {
        return janelas;
    }

    private final int portas;
    public int getPortas() {
        return portas;
    }

    private final Parede paredes;
    public Parede getParedes() {
        return paredes;
    }

    private final Teto teto;
    public Teto getTeto() {
        return teto;
    }

    private final int quartos;

        public int getQuartos() {
        return quartos;
    }

    private final int qtdGaragem;

        public int getQtdGaragem() {
        return qtdGaragem;
    }

        public Casa(TipoDeCasa tipoDeCasa, int janelas, int portas, Parede paredes, Teto teto, int quartos, int qtdGaragem) {
        this.tipoDeCasa = tipoDeCasa;
        this.janelas = janelas;
        this.portas = portas;
        this.paredes = paredes;
        this.teto = teto;
        this.quartos = quartos;
        this.qtdGaragem = qtdGaragem;
    }

    public String print() {
        String info = "";
        info += "Tipo da Casa: " + tipoDeCasa + "\n";
        info += "Número de Janelas: " + janelas + "\n";
        info += "Numero do Portas " + portas + "\n";
        info += "Cor Paredes: " + paredes.getCor() + " Material Paredes:" + paredes.getMaterial() + "\n";
        info += "Material Teto: " + teto.getMaterial() + "\n";
        info += "Qtd Quartos: " + quartos + "\n";
        info += "Espacos Garagem: " + qtdGaragem + "\n";

      
        return info;
    }

}
