
package controle;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import modelo.Endereco;
import modelo.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matheus
 */
public class ControlePessoaTest {
    
    public ControlePessoaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        InputStream inputStream = new ByteArrayInputStream(getDados().getBytes());
        System.setIn(inputStream);

    }
    
    @After
    public void tearDown() {
        System.setIn(null);
    }
    
    public String getDados(){
        StringBuilder builder = new StringBuilder();
        builder.append("AAA");
        builder.append("111111111111");
        builder.append("aaa@univel.br");
        builder.append("(045)3223-1234");
        return builder.toString();
    }

    @Test
    public void testSetarDados() {
       Pessoa pessoaTeste = new Pessoa();
       Pessoa pessoaAux = new Pessoa(null,"Andre", "1111111111", "andre@univel.br","(045)3223-1234", new Endereco());
       ControlePessoa controle = new ControlePessoa();
       controle.setarDados(pessoaTeste);
       assertEquals(pessoaAux, pessoaTeste);
       
    }
    
}
