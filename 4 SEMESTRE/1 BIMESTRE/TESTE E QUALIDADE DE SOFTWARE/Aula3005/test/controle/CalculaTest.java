
package controle;

import junit.framework.Assert;
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
public class CalculaTest {
    
    public CalculaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testarMedia(){
        int[] valores = new int[]{10,15,20};
        
        Assert.assertEquals(15.0, Calcula.media(valores));
 
    
    }
    
    
}
