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
 * Les classes-test sont documentees ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basees sur le document Ã…Â  2002 Robert A. Ballance intitulee
 * "JUnit: Unit Testing Framework".
 */
public class RoomTest
{
    private Room roomTest;
    private Item dentier;
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
       roomTest = new Room ("name","azertyu est une salle random");
       dentier = new Item("Denture","Buuuurk, there is mamy's slime on it");
    }
    
    /**
     * Method testSetExit() : Check the good operation of the exit setter.
     */
    @Test
    public void testSetExit() {
        Room thing = new Room("name","sxcvgjgvfgjhgfhuk");
        roomTest.setExit("north",thing);
        assertEquals(thing, roomTest.getExit("north"));
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
            Room test = new Room("name","");
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(false,result);
    }
}
