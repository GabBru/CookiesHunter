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
    private ArrayList<Item> testInvent;
    private Item Cookie;
    private Room Grenier; 
    private String playerName;
    
    /**
     * Default constructor for test class PlayerTest
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
     * Method testConstructorCharacter : method that checked if level up
     * is correctly done.
     */
    @Test
    public void testSetLevel()
    {
        testPlayerCharacter.levelUp();
        assertEquals(1,testPlayerCharacter.levelUp());
    }
}
