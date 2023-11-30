package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.DisciplinaCurso;
import modelo.Disciplina;

public class DAODisciplinaCurso extends DAO {
    public boolean inserir(DisciplinaCurso DisciplinaCurso){
        try{ 
        String sql = "INSERT INTO curso_disciplina (disciplina_id, curso_id) VALUES (?, ?)";
        PreparedStatement ps = criarPreparedStatement(sql);
        ps.setInt(1, DisciplinaCurso.getDisciplina().getId());
        ps.setInt(2, DisciplinaCurso.getCurso().getId());
        ps.executeUpdate();

        return true;
    } catch (SQLException ex){
        return false;
    }
}

public ArrayList<Disciplina> carregarCursosDaDisciplina(String nomeCurso) {
    ArrayList<Disciplina> disciplinas = new ArrayList<>();
    try {
        String sql = "SELECT disciplina.descricao, curso.nome\n" +
                    " FROM curso_disciplina" +
                    " join disciplina on disciplina.id = curso_disciplina.disciplina_id \n" +
                    " join curso on curso.id = curso_disciplina.curso_id \n" +
                    " where curso.nome like "+"'"+nomeCurso+"'";
        ResultSet rs = consultaSQL(sql);
        while (rs.next()) { 
            
            Disciplina disciplina = new Disciplina();
            disciplina.setDescrição(rs.getString("disciplina.descricao"));
            disciplinas.add(disciplina);
        }
    } catch (SQLException ex) {
        System.err.println("Falha ao carregar Disciplinas do Curso!\n" + ex.getMessage());
    }
    return disciplinas;
}
 }
