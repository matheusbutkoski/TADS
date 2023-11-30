package controle;

import modelo.Livro;
import util.Input;

public class CadastroLivro {

    public static Livro cadastrar() {
        Livro l = new Livro();
        setarInformacoes(l);
        return l;
    }

    public static void setarInformacoes(Livro l) {
         
        System.out.print("Titulo: ");
        l.setTitulo(Input.next());
        
        System.out.print("Autor: ");
        l.setAutor(Input.next());

        System.out.print("Editora: ");
        l.setEditora(Input.next());

        System.out.print("Numero de Paginas: ");
        l.setNumPag(Input.nextInt());
        
       
    }

    public static Livro editar(Livro l) {         
        setarInformacoes(l);   
        return l;
    }
}
