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
public class EnemyTest
{
    protected int level;
    private boolean isDead;
    protected Enemy testEnemyCharacter;
    private Room attic;
    
    /**
     * Default constructor for test class EnnemyTest
     */
    public EnemyTest()
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
        testEnemyCharacter = new Enemy("Baby",10,attic);
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
        testEnemyCharacter.setIsDead();
        assertEquals(true,testEnemyCharacter.getIsDead());
    }
}
