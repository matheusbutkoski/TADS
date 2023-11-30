/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controle;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
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
 * @author ANDRE.LUCHESI
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
        InputStream inputStram = new ByteArrayInputStream(getDados().getBytes());
        System.setIn(inputStram);
    }
    
    @After
    public void tearDown() {
        System.setIn(null);
    }
    
    public String getDados(){
        StringBuilder builder = new StringBuilder();
        builder.append("Andre\n");
        builder.append("11111111111\n");
        builder.append("andre@univel.br\n");
        builder.append("(045)3223-1234\n");
        return builder.toString();
    }

    @Test
    public void testeSetDados(){
        Pessoa pessoaTeste = new Pessoa();
        Pessoa pessoaAux = new Pessoa(null, "Andre", "11111111111", 
                "andre@univel.br" , "(045)3223-1234" , new Endereco());
        ControlePessoa controle = new ControlePessoa();
        controle.setarDados(pessoaTeste);
        assertEquals(pessoaAux, pessoaTeste);
    }
    
}
