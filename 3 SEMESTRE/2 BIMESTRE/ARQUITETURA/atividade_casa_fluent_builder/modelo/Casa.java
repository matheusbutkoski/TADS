package modelo;

public class Casa {
    
    private int quartos;
    private int janelas;
    private boolean jardim;
    private float m2;
    private int espacoGaragem;
    private int banheiros;

    public Casa(int quartos, int janelas, boolean jardim, float m2, int espacoGaragem, int banheiros) {
        this.quartos = quartos;
        this.janelas = janelas;
        this.jardim = jardim;
        this.m2 = m2;
        this.espacoGaragem = espacoGaragem;
        this.banheiros = banheiros;
    }
    public String toString() {
        return "Quartos: " + quartos + ", Janelas: " + janelas + ", Jardim: " + jardim + ", m2: " + m2
                + ", Espaco Garagem:" + espacoGaragem + ", Banheiros: " + banheiros;
    }

}
