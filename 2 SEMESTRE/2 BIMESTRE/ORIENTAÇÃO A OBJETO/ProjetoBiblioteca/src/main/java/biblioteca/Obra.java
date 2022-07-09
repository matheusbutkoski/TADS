package biblioteca;

public class Obra {
    protected int codigo;
    protected String titulo;
    protected String autor;
    protected int ano;
    protected String cidade;
    protected boolean disponibilidade;
    
    
    public Obra(){
        this.disponibilidade = true;
        
    }
    
    public Obra(int c, String t, String au, int a, String ci){
        this.codigo = c;
        this.titulo = t;
        this.autor = au;
        this.ano = a;
        this.cidade = ci;
        this.disponibilidade = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

   
    @Override
    public String toString() {
        return ", Codigo: " + codigo + ", Titulo: " + titulo + ", Autor: " + autor + ", Ano: " + ano + ", Cidade: " + cidade + ", Disponibilidade: " + disponibilidade;
    }
 
    public String toString2() {
        return "Codigo: " + codigo +", Titulo: " + titulo;
    }

    
    
    public int duracaoEmprestimo(String tipo){
        return 0;
    }
    
    
}
