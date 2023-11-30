
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author andre.luchesi
 */
public class ConexaoBD {
    
    private static Connection con;
    
    private static final String user = "postgres";  
    private static final String senha = "postgres";  //univel
    private static final String baseDados = "bd_alunos";  //faculdade
    private static final String url = "jdbc:postgresql://localhost:5432/"+baseDados;  
    
    private static void criarConexao(){
        try {
            Class.forName("org.postgresql.Driver");
            
            con = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão concluida!");
        } catch (SQLException ex) {
            System.err.println("Falha ao abrir conexão com o banco de  dados!\n"+ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println("Falha ao carregar Driver de conexão com o banco de  dados!\n"+ex.getMessage());
        }
    }
    
    public static Connection getConnection(){
        try {
            if(con == null || con.isClosed()){
                criarConexao();
            }
            return con;
        } catch (SQLException ex) {
            System.err.println("Falha ao obter conexão\n"+ex.getMessage());
            return null;
        }
    }
}
