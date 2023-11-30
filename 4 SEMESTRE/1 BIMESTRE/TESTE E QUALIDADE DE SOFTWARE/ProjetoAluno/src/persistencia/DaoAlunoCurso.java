
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AlunoCurso;


public class DaoAlunoCurso extends DAO{
    
    public void setarDadosViaResultSet(AlunoCurso cur, ResultSet rs) {
        try {
            cur.setId(rs.getInt("idaluno_curso"));
            cur.getAluno().setId(rs.getInt("idaluno"));
            cur.getCurso().setId(rs.getInt("idcurso"));
            
        } catch (SQLException e) {
            System.err.println("Falha ao setar dados da entidade aluno curso!\n" + e.getMessage());
        }
    }
    
    public boolean salvar(AlunoCurso alunoCurso){
        
        try {
            String sql = "insert into aluno_curso (id, idaluno, idcurso) values (?,?,?)";
            
            PreparedStatement ps = criarPreparedStatement(sql);
            alunoCurso.setId(gerarProximoId("aluno_curso"));
            
            ps.setInt(1, alunoCurso.getId());
            ps.setInt(2, alunoCurso.getAluno().getId());
            ps.setInt(3, alunoCurso.getCurso().getId());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Falha ao Salvar a relação Aluno Curso!\n"+ex.getMessage());
            return false;
        }
    }
    
    public String comandoSqlRemover(AlunoCurso alunoCurso) {
        return "DELETE FROM aluno_curso WHERE id = " + alunoCurso.getId();
    }

    public boolean remover(AlunoCurso alunoCurso) {
        try {
            executeSql(comandoSqlRemover(alunoCurso));
            return true;
        } catch (SQLException e) {
            System.err.println("Falha ao remover Aluno curso\n" + e.getMessage());
            return false;
        }
    }
}
