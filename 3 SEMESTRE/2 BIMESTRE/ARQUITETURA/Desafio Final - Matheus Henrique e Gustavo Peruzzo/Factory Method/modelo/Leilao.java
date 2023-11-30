package modelo;

public abstract class Leilao {
    int id;

    public abstract void criar(int id);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
