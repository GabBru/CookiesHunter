import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * The test class MagicRoomTest - for class MagicRoom.
 *
 * @author  Brunet Gabriel
 * @version v0.1 2018nov
 */
public class MagicRoomTest
{
    private MagicRoom okMagicRoom, badMagicRoom;
    private String okDescription, okPassWord, okName;
    /**
     * Default constructor for test class MagicRoomTest
     * 
     * @param badMagicRoom Object used to tests setter and good process of exceptions. No respect of rules.
     */
    public MagicRoomTest()
    {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     * 
     * @param okDescription Used as default description for the correct test object (String).
     * @param okPassWord Used as default password for the correct test object (String).
     * @param okMagicRoom Object used to do tests in general. Respect all restrictions and set in the setUp() method.
     */
    @Before
    public void setUp()
    {
        okDescription = ("Doors of Durin, lord of the Moria, say \"friends\" and come in");
        okName = ("name");
        okPassWord = ("mellon");
        okMagicRoom = new MagicRoom(okName,okDescription, okPassWord);
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
     * Method testConstructorMagicRoom() : Test the good process of the constructor.
     */
    @Test
    public void testConstructorMagicRoom()
    {
        boolean result = true;
        assertEquals(okDescription,okMagicRoom.getDescription());
        assertEquals(okPassWord, okMagicRoom.getPassword());
        try { badMagicRoom = new MagicRoom("Name","ShortDesc",okPassWord);}
        catch (IllegalArgumentException e) {result=false;}
        assertEquals(false, result);
        tearDown();
        try { badMagicRoom = new MagicRoom("Name",okDescription,"Iam baaadpassword");}
        catch (IllegalArgumentException e) {result=false;}
        assertEquals(false, result);
        tearDown();
        try { badMagicRoom = new MagicRoom("Name",okDescription,"");}
        catch (IllegalArgumentException e) {result=false;}
        assertEquals(false, result);        
    }
}
