package principal;

public class Docente extends Pessoa{
    private int codigo;
    private String formacao;
    private String titulacao;

    public Docente() {
    }

    public Docente(int codigo, String formacao, String titulacao, String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
        this.codigo = codigo;
        this.formacao = formacao;
        this.titulacao = titulacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Docente{" + "codigo=" + codigo + ", formacao=" + formacao + ", titulacao=" + titulacao + " "  + super.toString()+ '}';
    }
    
    
}
