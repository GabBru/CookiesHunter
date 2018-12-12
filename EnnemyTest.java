import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EnnemyTest.
 *
 * @author  Gabriel Brunet & Amandine Poullot
 * @version v0.1 2018nov
 */
public class EnnemyTest
{
    protected int level;
    private boolean isDead;
    protected Ennemy testEnnemyCharacter;
    private Room attic;
    
    /**
     * Default constructor for test class EnnemyTest
     */
    public EnnemyTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        testEnnemyCharacter = new Ennemy("Baby",10);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Check the availability of the set methods for the boolean isDead.
     */
    @Test
    public void testSetIsDead()
    {
        testEnnemyCharacter.setIsDead(true);
        assertEquals(true,testEnnemyCharacter.getIsDead());
    }
}
