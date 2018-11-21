import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class PlayerTest.
 *
 * @author  Brunet Gabriel & Amandine Poullot
 * @version v0.1 2018nov
 */
public class PlayerTest
{
    private Player testPlayerCharacter;
    private Room Grenier; 
    private String playerName;
    
    /**
     * Default constructor for test class PlayerTest
     * 
     * @param testPlayerCharacter Object used to do tests in general. See setUp() method.
     */
    public PlayerTest()
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
        testPlayerCharacter= new Player(playerName,Grenier);    
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
     * Method testLevelUp() : Check if level up is correctly done and increase of 1 level only.
     */
    @Test
    public void testLevelUp()
    {
        testPlayerCharacter.levelUp();
        assertEquals(1,testPlayerCharacter.getLevel());
        testPlayerCharacter.levelUp();
        assertEquals(2,testPlayerCharacter.getLevel());
    }
}
