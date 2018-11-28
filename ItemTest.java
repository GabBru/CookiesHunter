import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * The class-test ItemTest - for the Item class.
 *
 * @author  Marie Bogusz & Amandine Poullot & Gabriel Brunet
 * @version v0.1 2018nov
 */
public class ItemTest
{
    private Item okItem;
    /**
     * Default constructor for test class ItemTest
     * 
     * @param okItem Used to do the tests in general.
     */
    public ItemTest()
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
    }

    /**
     * Method testConstructorItemOk() : Test creating an item which fit all criterias.
     * Name must contain at least 1 character.
     * Description must contain at least 10 characters.
     */
    @Test
    public void testConstructorItemOk()
    {
        boolean result=true;
        try {
            okItem = new Item("Cookie","Emma's candy found in the kitchen");
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(true, result);
        assertEquals("Cookie", okItem.getName());
        assertEquals("Emma's candy found in the kitchen", okItem.getDescription());                 
    }
    
     /**
     * Method testConstructorNullName(): Test creating an item with an empty name.
     * Should not be possible, the constructor is supposed to send back an exception that can be catched.
     */
    @Test
    public void testConstructorNullName()
    {
        boolean result=true;
        try {
            okItem = new Item("","Emma's candy found in the kitchen");
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(false, result);
    }   
    
     /**
     * Method testConstructorNullDescription(): Test creating an item with an empty description.
     * Should not be possible, the constructor is supposed to send back an exception that can be catched.
     */
    @Test
    public void testConstructorNullDescription()
    {
        boolean result=true;
        try {
            okItem = new Item("Cookie","");
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(false, result);
    }  
    
     /**
     * Method testConstructorBlankName() : Test creating an item with a name only composed of blank spaces.
     * Should not be possible, the constructor is supposed to send back an exception that can be catched.
     */
    @Test
    public void testConstructorBlankName()
    {
        boolean result=true;
        try {
            okItem = new Item("   ","Emma's candy found in the kitchen");
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(false, result);
    }
    
     /**
     * Method testConstructorBlankDescription() : Test creating an item with a description only composed of blank spaces.
     * Should not be possible, the constructor is supposed to send back an exception that can be catched.
     */
    @Test
    public void testConstructorBlankDescription()
    {
        boolean result=true;
        try {
            okItem = new Item("Möttorzwage","Emma's candy found in the kitchen");
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(false, result);
    }
    
    /**
     * Method testConstructorBadName() : Test the creation of an item with a name non present in the list of valid items.
     * Should not be possible, the constructor is supposed to send back an exception that can be catched.
     */
    @Test
    public void testConstructorBadName()
    {
        boolean result=true;
        try {
            okItem = new Item("Cookie","    ");
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(false, result);  
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
}
