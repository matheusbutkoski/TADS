package builder.java.atividade_casa.componentes;

public class Parede {
    private String cor;
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Parede(String cor, String material){
        this.cor = cor;
        this.material = material;
    }

    public String getCor(){
        return cor;
    }
}
