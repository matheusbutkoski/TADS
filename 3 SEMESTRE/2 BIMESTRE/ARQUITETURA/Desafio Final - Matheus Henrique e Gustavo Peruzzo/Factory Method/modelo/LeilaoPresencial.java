package modelo;

public class LeilaoPresencial extends Leilao{
    @Override
    public void criar(int id) {
       super.setId(id);
        System.out.println("Leilao presencial criado com sucesso");
    }
    
}
