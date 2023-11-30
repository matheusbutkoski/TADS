package controle;

public class LivroException extends Exception {
    public LivroException(){
        super("Esse livro ja esta emprestado!");
        
    }
}
