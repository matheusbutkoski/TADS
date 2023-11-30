package modelo;

public class ImovelRural extends Imovel {

    protected String cadPro;

    public double calcularICMS() {
        return 0;
    }

    @Override
    public double calcularArea() {
        return largura * comprimento;
    }

    public String getCadPro() {
        return cadPro;
    }

    public void setCadPro(String cadPro) {
        this.cadPro = cadPro;
    }

}
