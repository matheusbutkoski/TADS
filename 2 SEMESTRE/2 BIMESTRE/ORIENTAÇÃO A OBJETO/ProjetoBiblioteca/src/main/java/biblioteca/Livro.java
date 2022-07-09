package biblioteca;

public class Livro extends Obra{
    private String editora;
    private String edicao;
    private long ISBN;
    
    public Livro(){
        
    }
    
    public Livro(int c, String t, String au, int a, String ci, String e, String ed, long is){
        super(c,t,au,a,ci);
        this.editora = e;
        this.edicao = ed;
        this.ISBN = is;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
   
    @Override
    public int duracaoEmprestimo(String tipo){
        if(tipo.equals("Aluno")){
            return 7;
        }else if(tipo.equals("Docente")){
            return 14;
        }
        return 0;
    }

    @Override
    public String toString2() {
        return "Livro - " + super.toString2();
    }

    @Override
    public String toString() {
        return "Livro - " + "Editora: " + editora + ", Edicao:" + edicao + ", ISBN: " + ISBN + super.toString();
    }
    
    
    
    
}
