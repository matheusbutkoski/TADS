package persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.AlunoCurso;

/**
 *
 * @author Andre
 */
public class DaoAlunoDisciplina extends DAO{
    
    public boolean salvar(AlunoCurso alunoCurso){
        
        try {
            String sql = "insert into aluno_disciplina (id, idaluno, iddisciplina) values (?,?,?)";
            
            PreparedStatement ps = criarPreparedStatement(sql);
            alunoCurso.setId(gerarProximoId("aluno_disciplina"));
            
            ps.setInt(1, alunoCurso.getId());
            ps.setInt(2, alunoCurso.getAluno().getId());
            ps.setInt(3, alunoCurso.getCurso().getId());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Falha ao Salvar a relação Aluno Disciplina!\n"+ex.getMessage());
            return false;
        }
    }
}
