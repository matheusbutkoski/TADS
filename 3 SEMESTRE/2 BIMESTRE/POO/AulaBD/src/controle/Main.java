package controle;

import persistencia.DatabaseConnection;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseConnection.getConnection();
        DatabaseConnection.consultaSQL();
    }
    
}
