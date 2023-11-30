package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.AlunoCurso;
import modelo.Curso;

public class DAOAlunoCurso extends DAO {
    public boolean inserir(AlunoCurso alunoCurso){
        try{ 
        String sql = "INSERT INTO aluno_curso (aluno_id, curso_id) VALUES (?, ?)";
        PreparedStatement ps = criarPreparedStatement(sql);
        ps.setInt(1, alunoCurso.getAluno().getId());
        ps.setInt(2, alunoCurso.getCurso().getId());
        ps.executeUpdate();

        return true;
    } catch (SQLException ex){
        return false;
    }
}

public ArrayList<Curso> carregarCursosDoAluno(String raAluno) {
    ArrayList<Curso> cursos = new ArrayList<>();
    try {
        String sql = "SELECT aluno.nome, curso.nome\n" +
                    " FROM aluno_curso" +
                    " join aluno on aluno.id = aluno_curso.aluno_id \n" +
                    " join curso on curso.id = aluno_curso.curso_id \n" +
                    " where aluno.ra = "+ raAluno;
        ResultSet rs = consultaSQL(sql);
        while (rs.next()) { 
            
            Curso curso = new Curso();
            curso.setNome(rs.getString("curso.nome"));
            cursos.add(curso);
        }
    } catch (SQLException ex) {
        System.err.println("Falha ao carregar cursos do aluno!\n" + ex.getMessage());
    }
    return cursos;
}
 }
