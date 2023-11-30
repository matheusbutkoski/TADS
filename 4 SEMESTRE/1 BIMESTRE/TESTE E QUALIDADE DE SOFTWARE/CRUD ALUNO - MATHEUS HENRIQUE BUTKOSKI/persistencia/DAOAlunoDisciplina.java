package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.AlunoDisciplina;
import modelo.Disciplina;

public class DAOAlunoDisciplina extends DAO {

        public boolean inserir(AlunoDisciplina alunoDisciplina){
            try{ 
            String sql = "INSERT INTO aluno_disciplina (aluno_id, disciplina_id) VALUES (?, ?)";
            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setInt(1, alunoDisciplina.getAluno().getId());
            ps.setInt(2, alunoDisciplina.getDisciplina().getId());
            ps.executeUpdate();
    
            return true;
        } catch (SQLException ex){
            return false;
        }
    }

    public ArrayList<Disciplina> carregarDisciplinasDoAluno(String raAluno) {
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        try {
            String sql = "SELECT aluno.nome, disciplina.descricao\n" +
                        " FROM aluno_disciplina" +
                        " join aluno on aluno.id = aluno_disciplina.aluno_id \n" +
                        " join disciplina on disciplina.id = aluno_disciplina.disciplina_id \n" +
                        " where aluno.ra = "+ raAluno;
            ResultSet rs = consultaSQL(sql);
            while (rs.next()) { 
                
                Disciplina disciplina = new Disciplina();
                disciplina.setDescrição(rs.getString("disciplina.descricao"));
                disciplinas.add(disciplina);
            }
        } catch (SQLException ex) {
            System.err.println("Falha ao carregar disciplinas do aluno!\n" + ex.getMessage());
        }
        return disciplinas;
    }
     }

