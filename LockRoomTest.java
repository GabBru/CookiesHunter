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
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class LockRoomTest
{
    private LockRoom ok;
    private string myDescription;
    
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
        goodRoom.setLocked();
        assertEquals(true, goodRoom.getLocked());
        // isLocked is true, so setLocked change isLocked in false
        goodRoom.setLocked();
        assertEquals(false, goodRoom.getLocked());
    }
    
    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }
}
