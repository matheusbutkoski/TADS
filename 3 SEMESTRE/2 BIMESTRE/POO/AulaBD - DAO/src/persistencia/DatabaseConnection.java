package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    private static Connection con = null;
  
    private static void criarConexao()
    {
        String url = "jdbc:mysql://localhost:3306/trabalho_imoveis";
        String user = "root";
        String pass = "UNIVEL";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexão con o banco de dados realizada com sucesso!");
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
    
    
}
