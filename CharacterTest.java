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
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
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
    * 
    * @param okCharacter Used to do the tests in general.
    * @param testCharacter Used to do the constructor test - Useful to make sure that there is no conflicts with other methods. 
    * Variables "cookie", "grenier" and "testInvent" are used and constructed for help during the process of test methods.
     */
    public CharacterTest()
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
        okCharacter = new Character("Moi",grenier);
        grenier = new Room("Vous êtes dans le grenier du gros bébé!");
        cookie = new Item ("Cookie", "Gros cookie pour gros bébé");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() 
    {
        //Libérez ici les ressources engagées par setUp()
    }
    
    /**
     * Method testConstructorBlankName() : Check if there is no blank as name.
     */
    @Test
    public void testConstructorBlankName()
    {
        boolean result=true;
        try {
            testCharacter = new Character("   ",grenier);
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
        okCharacter.removeInventory(cookie);
        assertEquals(true,testInvent.isEmpty());
    }
    
    /**
     * Method testAddItem() : Check if an item is correctly add to the inventory
     */
    @Test
    public void testAddItem()
    {
        okCharacter.addInventory(cookie);
        assertEquals(1,testInvent.size());
    } 
}
