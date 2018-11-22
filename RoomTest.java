import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
/**
 * Classe-test RoomTest - for Room class.
 * 
 * @author  Diama Fall & Amandine Poullot & Gabriel Brunet 
 * @version v0.1 2018nov
 * 
 * Les classes-test sont documentÃ©es ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basÃ©es sur le document Å  2002 Robert A. Ballance intitulÃ©
 * "JUnit: Unit Testing Framework".
 */
public class RoomTest
{
    private Room roomTest;
    /**
     * Classe-test RoomTest constructor. 
     */
    public RoomTest()
    {    
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     * 
     * @param roomTest Object used to do tests in general.
     */
    @Before
    public void setUp() 
    {
       roomTest = new Room ("azertyu est une salle random");
    }
    
    /**
     * Method testSetExit() : Check the good operation of the exit setter.
     */
    @Test
    public void testSetExit() {
        Room thing = new Room("sxcvghuk");
        roomTest.setExit("north",thing);
        assertEquals(thing, roomTest.getExit("north"));
    }

    /**
    *
    * Method testsetterIsVisited() : Check the good operation for the isVisited setter.
    */
    @Test
    public void testsetterIsVisited()
    {
       roomTest.setIsVisited();
       assertEquals(true,roomTest.getIsVisited());
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
    
    /**
     * Method testEmptyDescription() : Create an object with an empty description. The constructor is supposed to refuse the creation and returned an exception.
     */
    @Test
    public void testEmptyDescription()
    {
        boolean result = true;
        try{
            Room test = new Room("");
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(false,result);
    }
}
