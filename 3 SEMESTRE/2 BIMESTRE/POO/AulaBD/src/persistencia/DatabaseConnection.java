package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    private static Connection con = null;
  
    private static void criarConexao()
    {
        String url = "jdbc:mysql://localhost:3306/teste";
        String user = "root";
        String pass = "univel";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexão com o banco de dados realizada com sucesso!");
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection()
    {
        try {
            if(con==null || con.isClosed()){
                criarConexao();
            }
        } catch (SQLException ex) {
            System.out.println("Falha ao obter conexão");
        }
        return con;
    }
    
    public static void consultaSQL(){
        try {
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery("select id, nome, cpf, telefone from pessoa");
            while(res.next()){
                int id = res.getInt(1);
                String nome = res.getString("nome");
                String cpf = res.getString("cpf");
                String telefone = res.getString("telefone");
                
                System.out.println("Id: "+id +"Nome: "+nome +"CPF: "+cpf +"Telefone: "+telefone);
                
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao executar a Consulta SQL");
        }
    }
}
