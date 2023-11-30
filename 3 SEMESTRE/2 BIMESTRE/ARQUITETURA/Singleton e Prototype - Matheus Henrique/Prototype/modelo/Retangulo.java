package modelo;

public class Retangulo extends Forma {
    
    

    public int largura;
    public int altura;

    public Retangulo() {
    }

    public Retangulo(Retangulo retangulo) {
        super(retangulo);
        if (retangulo != null) {
            this.largura = retangulo.largura;
            this.altura = retangulo.altura;
        }
    }

    @Override
    public Forma clone() {
        return new Retangulo(this);
    }
    
    @Override
    public String toString() {
        return "Retangulo [largura=" + largura + ", altura=" + altura + "]";
    }
}