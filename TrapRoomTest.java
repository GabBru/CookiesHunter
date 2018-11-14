

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test TrapRoomTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 */
public class TrapRoomTest
{
    private TrapRoom Badsetter;
    private TrapRoom Goodsetter;
    

    /**
     * Constructeur de la classe-test TrapRoomTest
     */
    public TrapRoomTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
       
    }
    
     /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Test
    public void testsetterVisited() // throws java.lang.Exception
    {
       Goodsetter.setVisited(true);
       assertEquals(true,Goodsetter.getIsVisited());
    }
    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }
}
