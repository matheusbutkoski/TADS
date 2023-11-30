package controle;

import modelo.Curso;
import util.Input;

public class CadastroCurso {
    
        public static Curso cadastrar() {
                Curso a = new Curso();
                setarInformacoes(a);
                return a;
            }
        
            public static void setarInformacoes(Curso a) {
                 
                System.out.print("Nome: ");
                a.setNome(Input.next());
                
                System.out.print("Carga Horaria: ");
                a.setCargaHoraria(Input.nextInt());
                
                 
            }
        
            public static Curso editar(Curso a) {       
                setarInformacoes(a);   
                return a;
            }
        }

