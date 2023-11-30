package modelo;

public class LeilaoOnline extends Leilao{

    @Override
    public void criar(int id) {
       super.setId(id);
        System.out.println("Leilao online criado com sucesso");
    }
    
}
