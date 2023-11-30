package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static Connection con = null;
  
    private static void criarConexao()
    {
        String url = "jdbc:mysql://localhost:3306/trabalho_alunos";
        String user = "root";
        String pass = "UNIVEL";
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
}