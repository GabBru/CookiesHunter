import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
/**
 * Classe-test CharacterTest - for Character class.
 *
 * @author  Brunet Gabriel & Amandine Poullot
 * @version v0.1 2018nov
 *
 * Les classes-test sont documentÃƒÂ©es ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basÃƒÂ©es sur le document Ã…Â  2002 Robert A. Ballance intitulÃƒÂ©
 * "JUnit: Unit Testing Framework".
 */
public class CharacterTest
{
    private Character okCharacter, testCharacter;
    private ArrayList<Item> testInvent;
    private Item cookie;
    private Room grenier;
    /**
    * Classe-test CharacterTest constructor.
     */
    public CharacterTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     * 
     * @param okCharacter Used to do the tests in general.
     * @param testCharacter Used to do the constructor test - Useful to make sure that there is no conflicts with other methods. 
     * Variables "cookie", "grenier" and "testInvent" are used and constructed for help during the process of test methods.
     */
    @Before
    public void setUp() 
    {
        okCharacter = new Character("You");
        grenier = new Room("Vous ÃƒÂªtes dans le grenier du gros bÃƒÂ©bÃƒÂ©!");
        cookie = new Item ("Cookie", "Gros cookie pour gros bÃƒÂ©bÃƒÂ©");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() 
    {
        //LibÃƒÂ©rez ici les ressources engagÃƒÂ©es par setUp()
    }
    
    /**
     * Method testConstructorBlankName() : Check if there is no blank as name.
     */
    @Test
    public void testConstructorBlankName()
    {
        boolean result=true;
        try {
            testCharacter = new Character("   ");
        } catch (IllegalArgumentException e) {
            result = false;
        }
        assertEquals(false, result);
    }
    
    /**
     * Method testRemoveItem() : Check the good process of removing items from the list.
     */
    @Test
    public void testRemoveItem()
    {
        okCharacter.addInventory(cookie);
        assertEquals(1,okCharacter.getNumberItemGave("Cookie"));
        okCharacter.removeInventory("Cookie");
        assertEquals(true,okCharacter.inventory.isEmpty());
    }
    
    /**
     * Method testAddItem() : Check if an item is correctly add to the inventory
     */
    @Test
    public void testAddItem()
    {
        okCharacter.addInventory(cookie);
        assertEquals(1,okCharacter.inventory.size());
    }
    
    /**
     * Method testReturnInventory() : Check if the good string is returned when the character's inventory is non empty.
     * Also check if nothing is returned in case of empty inventory.
     */
    @Test
    public void testReturnInventory()
    {
        okCharacter.addInventory(cookie);
        assertEquals("Your inventory contains : 1 Cookie ;",okCharacter.returnInventory());
    }
}
