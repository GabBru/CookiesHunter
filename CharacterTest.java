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
 * Les classes-test sont documentees ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basees sur le document 2002 Robert A. Ballance intitule
 * "JUnit: Unit Testing Framework".
 */
public class CharacterTest
{
    private Character okCharacter, testCharacter;
    private ArrayList<Item> testInvent;
    private Item cookie;
    private Room grenier;
    boolean result;
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
        okCharacter = new Character("Bazigouloum");
        boolean result = true;
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
     * Method testConstructor() : Check the right operation of the constructor.
     */
    @Test
    public void testConstructor()
    {
        assertEquals("Bazigouloum", okCharacter.getName());
    }
    
    /**
     * Method testConstructorWrongName() : Check if incorrect names are correctly managed.
     */
    @Test
    public void testConstructorWrongName()
    {
        try {
            testCharacter = new Character("   ");
        } catch (IllegalArgumentException e) {
            result = false;
        }
        assertEquals(false, result);
    }
}
