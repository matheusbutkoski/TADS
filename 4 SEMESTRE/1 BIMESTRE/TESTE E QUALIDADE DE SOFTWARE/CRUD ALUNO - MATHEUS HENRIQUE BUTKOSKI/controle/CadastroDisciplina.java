package controle;

import modelo.Disciplina;
import util.Input;

public class CadastroDisciplina {
    
    public static Disciplina cadastrar() {
            Disciplina a = new Disciplina();
            setarInformacoes(a);
            return a;
        }
    
        public static void setarInformacoes(Disciplina a) {
             
            System.out.print("Descrição: ");
            a.setDescrição(Input.next());    
             
        }
    
        public static Disciplina editar(Disciplina a) {       
            setarInformacoes(a);   
            return a;
        }
    }
