package builder;

import modelo.Casa;

public class CasaBuilder {
    
    private int quartos;   
    private int janelas;    
    private boolean jardim;
    private float m2;  
    private int espacoGaragem; 
    private int banheiros;

    
    public CasaBuilder setQuartos(int quartos) {
        this.quartos = quartos;
        return this;
    }
    public CasaBuilder setJanelas(int janelas) {
        this.janelas = janelas;
        return this;
    }
    public CasaBuilder setJardim(boolean jardim) {
        this.jardim = jardim;
        return this;
    }
    public CasaBuilder setM2(float m2) {
        this.m2 = m2;
        return this;
    }
    public CasaBuilder setEspacoGaragem(int espacoGaragem) {
        this.espacoGaragem = espacoGaragem;
        return this;
    }
    public CasaBuilder setBanheiros(int banheiros) {
        this.banheiros = banheiros;
        return this;
    }

    public Casa build(){
        return new Casa(quartos, janelas, jardim, m2, espacoGaragem, banheiros);
    }
}
