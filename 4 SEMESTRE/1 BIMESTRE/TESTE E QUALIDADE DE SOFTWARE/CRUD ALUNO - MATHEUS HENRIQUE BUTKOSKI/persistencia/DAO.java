package persistencia;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DAO {
    private Connection conexao;

    public DAO() {
        conexao = DataBaseConnection.getConnection();
    }

    public Connection getConexao() {
        return conexao;
    }
    
    public ResultSet consultaSQL(String comandoSql) throws SQLException {
        ResultSet rs = conexao.createStatement().executeQuery(comandoSql);
        return rs;
    }

    protected int gerarProximoId(String tabela){
        try {
            ResultSet rs = consultaSQL("select max(id) from "+tabela);
            if(rs.next()){
                return rs.getInt(1) + 1;
            }
        } catch (SQLException ex) {
            System.out.println("falha ao gerar próximo ID\n"+ ex.getMessage());
        }
        return -1;
    }

    public PreparedStatement criarPreparedStatement(String sql) throws SQLException{
        return conexao.prepareStatement(sql);
    }
  

}