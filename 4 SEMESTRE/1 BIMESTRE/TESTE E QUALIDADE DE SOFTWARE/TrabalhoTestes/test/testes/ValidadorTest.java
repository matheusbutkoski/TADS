/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testes;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import validador.Validador;

/**
 *
 * @author Matheus
 */
public class ValidadorTest {
    Validador instance = new Validador();
    public ValidadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of somenteNumeros method, of class Validador.
     */
    @Test
    public void testSomenteNumeros() {
       assertEquals(true, instance.somenteNumeros("12345678910"));
       // assertEquals(false, instance.somenteNumeros("ABCDEFGHIJK"));
       // assertEquals(false, instance.somenteNumeros("!@#$%¨&*"));
       // assertEquals(false, instance.somenteNumeros("ABC123DEF456"));      
       //assertEquals(false, instance.somenteNumeros(""));// ERRO ACEITANDO STRING VAZIA
   
    } 
       

    @Test
    public void testCartaoValido() {
    //assertEquals(true, instance.cartaoValido("230650349378210")); //15 DIGITOS VERDADEIRO
     //assertEquals(false, instance.cartaoValido("123456789101112")); //15 DIGITOS FALSO
     //assertEquals(true, instance.cartaoValido("2306503493782106")); //16 DIGITOS VERDADEIRO
    //assertEquals(true, instance.cartaoValido("23065034937821060")); //17 DIGITOS VERDADEIRO
    //assertEquals(false, instance.cartaoValido("23065034937821066")); //17 DIGITOS FALSO
     //assertEquals(false, instance.cartaoValido("ABC123DEF456GHIJ"));
     //assertEquals(false, instance.cartaoValido("ABC123DEF456GH@@"));
     //assertEquals(false, instance.cartaoValido("ABCDEFGIHJKLMNOP"));
     //assertEquals(false, instance.cartaoValido("abcdefghijklmop"));
     //assertEquals(false, instance.cartaoValido("1234 5678 9101 1121"));
     //assertEquals(false, instance.cartaoValido(""));
     
     
           
    }

    /**
     * Test of cpfValido method, of class Validador.
     */
    @Test
    public void testCpfValido() {
      //assertEquals(false, instance.cpfValido("11111111111"));
      //assertEquals(true, instance.cpfValido("08573118911"));
      //assertEquals(false, instance.cpfValido("12312312312"));
      //assertEquals(false, instance.cpfValido("ABC123ABC123"));
      //assertEquals(false, instance.cpfValido("085731189111"));
      //assertEquals(false, instance.cpfValido(""));
      
    }

    /**
     * Test of cnpjValido method, of class Validador.
     */
    @Test
    public void testCnpjValido() {
      //assertEquals(true, instance.cnpjValido("04619823000150"));
      //assertEquals(false, instance.cnpjValido("11111111111111"));
      //assertEquals(false, instance.cnpjValido("ABC123ABC123ABC"));
      //assertEquals(false, instance.cnpjValido("046198230001500"));
      //assertEquals(false, instance.cnpjValido(""));
        
    }
    
    @Test
    public void testFecharNotas(){
        Assert.assertEquals(5.0, instance.fecharNotas(10, 0));
    }
    
    @Test
    public void testResultadoFinal(){
        Assert.assertEquals("Aprovado", instance.resultadoFinal(6));
    }
    
}
