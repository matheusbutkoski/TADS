package modelo;

public class Livro implements Entidade {
    Integer id;
    String titulo;
    String autor;
    String editora;
    int numPag;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getNumPag() {
        return numPag;
    }
    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    
    @Override
    public void exibirInformacoes() {
        System.out.println(titulo + " - " + autor + "\n" + "Editora: " + editora + " Numero de Paginas: " + numPag);
        
    }


    
}
