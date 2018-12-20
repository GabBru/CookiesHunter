import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Classe-test LockRoomTest - for LockRoom class.
 *
 * @author  Antoine PIERSON
 * @version v0.1 2018nov
 *
 * Les classes-test sont documentees ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basees sur le document Ã…Â  2002 Robert A. Ballance intitule
 * "JUnit: Unit Testing Framework".
 *
 */
public class LockRoomTest
{
    private LockRoom okLockRoom;
    private String myDescription;
    /**
     * Classe-test LockRoomTest constructor.
     */
    public LockRoomTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     * 
     * @param goodRoom Object used to do tests in general. This object respesct each constructor restrictions.
     * @param myDescription String used for the parameter "description" in constructor.
     */
    @Before
    public void setUp()
    {
        myDescription = "You are in the kitchen";
        LockRoom goodRoom = new LockRoom("name",myDescription);
    }
    
    /**
     * Method testConstructorLockRoom : Check the good operation of the constructor.
     */
    @Test
    public void testConstructorLockRoom()
    {
        boolean result = true;
        try{
            okLockRoom = new LockRoom("name",myDescription);
        } catch (IllegalArgumentException e){
            result = false;
        }
        assertEquals(true, result);
        assertEquals(myDescription, okLockRoom.getDescription());
        assertEquals(false, okLockRoom.getLocked());
    }
    
    /**
     * Method testSetIsLocked: Test if the setter change the boolean correctly.
     */
    @Test
    public void testSetIsLocked()
    {
        okLockRoom = new LockRoom("name",myDescription);
        okLockRoom.setLocked();
        assertEquals(true, okLockRoom.getLocked());
        okLockRoom.setLocked();
        assertEquals(false, okLockRoom.getLocked());
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        //Liberez ici les ressources engagees par setUp()
    }
}
