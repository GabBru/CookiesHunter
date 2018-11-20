import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test LockRoomTest.
 *
 * @author  Antoine PIERSON
 * @version 1.0
 *
 * Les classes-test sont documentÃ©es ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basÃ©es sur le document Å  2002 Robert A. Ballance intitulÃ©
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associÃ©s aux classes Ã  tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le mÄ™me paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque mÃ©thode Test Ã  exÃ©cuter.  Il peut y avoir
 * plus d'une mÃ©thode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ dÃ©couvrira automatiquement (par introspection) les mÃ©thodes
 * Test de votre classe Test et gÃ©nÃ©rera la TestSuite consÃ©quente.
 * Chaque appel d'une mÃ©thode Test sera prÃ©cÃ©dÃ© d'un appel de setUp(),
 * qui rÃ©alise les engagements, et suivi d'un appel Ã  tearDown(), qui les
 * dÃ©truit.
 */
public class LockRoomTest
{
    private LockRoom ok;
    private String myDescription;
    
    /**
     * Constructeur de la classe-test LockRoomTest
     */
    public LockRoomTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Method called before each test methods calls.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        myDescription = "You are in the kitchen";
        
        //creation of a good locked room
        LockRoom goodRoom = new LockRoom(myDescription);
    }

    /**
     * Method testConstructorLockRoom : 
     * Test creating if the boolean isLocked is FALSE
     */
    @Test
    public void testConstructorLockRoom()
    {
        boolean result = true;
        try{
            ok = new LockRoom(myDescription);
        } catch (IllegalArgumentException e){
            result = false;
        }
        assertEquals(true, result);
        // Check if my test is ok
        assertEquals(myDescription, ok.getDescription());
        // Check if the boolean isLocked is false
        assertEquals(false, ok.getLocked());
    }
    
    /**
     * Method testSetIsLocked:
     * test if the setter change the boolean
     */
    @Test
    public void testSetIsLocked()
    {
        // by default isLocked is False, so setLocked change isLocked in true
        ok.setLocked();
        assertEquals(true, ok.getLocked());
        // isLocked is true, so setLocked change isLocked in false
        ok.setLocked();
        assertEquals(false, ok.getLocked());
    }
    
    /**
     * Supprime les engagements
     *
     * MÃ©thode appelÃ©e aprÃ¨s chaque appel de mÃ©thode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //LibÃ©rez ici les ressources engagÃ©es par setUp()
    }
}
