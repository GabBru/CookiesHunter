import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ItemTest.
 *
 * @author  (Marie B)
 * @version (1.0)
 * 
 * name : string indicating the name of item, must be at least 1 character, 
 * or the constructor throws an error.
 * 
 * description : string indicating the description of item, must be at least 1 character, 
 * or the constructor throws an error.
 */
public class ItemTest
{
    private Item ok;
    /**
     * Default constructor for test class ItemTest
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
     * Method testConstructorItemOk: Test creating an item which fit all criteria
     *  -> name at least 1 char
     *  -> description at least 1 char
     */
    @Test
    public void testConstructorItemOk()
    {
        //Item ok;
        boolean result=true;
        try {
            ok = new Item("Candy","Emma's candy found in the kitchen");
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(true, result);
        assertEquals("Candy", ok.getName());
        assertEquals("Emma's candy found in the kitchen", ok.getDescription());                 
    }
    
     /**
     * Method testConstructorNullName(): Test creating an item with a name consisting of a space.
     * Should not be possible, the constructor sends back an exception that can be catched.
     */
    @Test
    public void testConstructorNullName()
    {
        //SalesItem ok;
        boolean result=true;
        try {
            ok = new Item("","Emma's candy found in the kitchen");
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(false, result);
    }   
    
     /**
     * Method testConstructorNullDescription(): Test creating an item with a description consisting of a space.
     * Should not be possible, the constructor sends back an exception that can be catched.
     */
    @Test
    public void testConstructorNullDescription()
    {
        //SalesItem ok;
        boolean result=true;
        try {
            ok = new Item("Candy","");
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(false, result);
    }  
    
     /**
     * Method testConstructorBlankName: Test creating an item with a name only composed of blank spaces
     * Should not be possible, the constructor sends back an exception that can be catched
     */
    @Test
    public void testConstructorBlankName()
    {
        //SalesItem ok;
        boolean result=true;
        try {
            ok = new Item("    ","Emma's candy found in the kitchen");
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(false, result);
    }
    
     /**
     * Method testConstructorBlankDescription: Test creating an item with a description only composed of blank spaces
     * Should not be possible, the constructor sends back an exception that can be catched
     */
    @Test
    public void testConstructorBlankDescription()
    {
        //SalesItem ok;
        boolean result=true;
        try {
            ok = new Item("Candy","    ");
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
