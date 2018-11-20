import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * Classe-test RoomTest.
 *
 * @author  Diama FALL
 * @version 2018/11
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
public class RoomTest
{
    private Room roomTest;
    
    /**
     * Constructor of the RoomTest class alllow to initializ correctly the
     */
    public RoomTest()
    {    
    }

    /**
     * Met en place les engagements.
     * MÃ©thode appelÃ©e avant chaque appel de mÃ©thode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
       roomTest = new Room ("azertyu est une salle random");
    }
    
    /**
     * 
     */
    @Test
    public void testSetExit() {
        Room thing = new Room("sxcvghuk");
        roomTest.setExit("north",thing);
        assertEquals(thing, roomTest.getExit("north"));
    }

    /**
    *
    * Method pour tester la viabilitÃ© du setter pour la sous-classe TrapRoom.
    */
    @Test
    public void testsetterIsVisited() // throws java.lang.Exception
    {
       roomTest.setIsVisited(true);
       assertEquals(true,roomTest.getIsVisited());
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
    
    /**
     * 
     */
    @Test
    public void testDescription(){
        boolean result = true;
        try{
            Room test = new Room("");
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(false,result);
    }
    
}
