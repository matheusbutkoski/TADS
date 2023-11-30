package modelo;

public class Circulo extends Forma {
    public int radius;

    public Circulo() {
    }

    public Circulo(Circulo circulo) {
        super(circulo);
        if (circulo != null) {
            this.radius = circulo.radius;
        }
    }

    @Override
    public Forma clone() {
        return new Circulo(this);
    }

    @Override
    public String toString() {
        return "Circulo [radius=" + radius + "]";
    }

    

}
