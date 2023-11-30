package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ANDRE.LUCHESI
 */
public class ConexaoBD {
    private static EntityManagerFactory emFactoryObj;
    private static EntityManager entityMamager;
    private static final String PERSISTENCE_UNIT_NAME = "AulaPU";  
 
    public static void criarConexao()  {
        emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        entityMamager = emFactoryObj.createEntityManager();
    }
    
    public static EntityManager getConeticon(){
        if(entityMamager == null){
            criarConexao();
        }
        return entityMamager;
    }

}
