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
    private Item cookie;
    
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
        testPlayerCharacter= new Player("Chuck Norris",Grenier); 
        cookie = new Item ("Cookie", "Big cookie for big baby");
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
     * Method testConstructor() : Check the right operation of the constructor, or not.
     */
    @Test
    public void testConstructor()
    {
        assertEquals("Chuck Norris", testPlayerCharacter.getName());
        assertEquals(0, testPlayerCharacter.getLevel());
        assertEquals(true, testPlayerCharacter.getWin());
        assertEquals("", testPlayerCharacter.getAnswer());
    }
    
    /**
     * Method testSetAnswer() : Check if the answer is correctly changed.
     */
    @Test
    public void testSetAnswer()
    {
        testPlayerCharacter.setAnswer("Chuck Norris fait pleurer les oignons");
        assertEquals("Chuck Norris fait pleurer les oignons",testPlayerCharacter.getAnswer());
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
    
    /**
     * Method testRemoveItem() : Check the good process of removing items from the list.
     */
    @Test
    public void testRemoveItem()
    {
        testPlayerCharacter.addInventory(cookie);
        assertEquals(1,testPlayerCharacter.getNumberItemGave("Cookie"));
        testPlayerCharacter.removeInventory(cookie);
        assertEquals(true,testPlayerCharacter.returnInventoryPlayer().isEmpty());
    }
    
    /**
     * Method testAddItem() : Check if an item is correctly add to the inventory
     */
    @Test
    public void testAddItem()
    {
        testPlayerCharacter.addInventory(cookie);
        assertEquals(1,testPlayerCharacter.returnInventoryPlayer().size());
    }
    
    /**
     * Method testReturnInventory() : Check if the good string is returned when the character's inventory is non empty.
     * Also check if nothing is returned in case of empty inventory.
     */
    @Test
    public void testReturnInventory()
    {
        testPlayerCharacter.addInventory(cookie);
        assertEquals("<html><FONT size=5>1 Cookie<br></FONT></html>", testPlayerCharacter.returnInventory());
    }
}
