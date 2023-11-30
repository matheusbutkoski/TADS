
package aulatesteUnitario;

import junit.framework.Assert;
import org.junit.Test;

public class CalculadoraTest {
    
    @Test   
    public void testarSoma(){
        Assert.assertEquals(4.0, Calculadora.soma(2,2));
    }
    
   @Test
   public void testarMult(){
       Assert.assertEquals(64, Calculadora.mult(8, 8));
       Assert.assertEquals(0.0, Calculadora.mult(5, 0));
       Assert.assertEquals(-10.0, Calculadora.mult(10, -1));
       
   }
}
