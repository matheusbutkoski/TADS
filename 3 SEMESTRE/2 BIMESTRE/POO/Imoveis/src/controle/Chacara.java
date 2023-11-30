package controle;


public class Chacara extends ImovelRural{

    @Override
    public double calcularICMS() {
        return valor * 0.03;
    }

}
