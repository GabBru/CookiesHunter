import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test RoomTest.
 *
 * @author  Diama FALL
 * @version 2018/11
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
public class RoomTest
{
    private Room roomDescription ;
    private TrapRoom Goodsetter;
    
    /**
     * Constructor of the RoomTest class alllow to initializ correctly the
     */
    public RoomTest()
    {    
    }

    /**
     * Met en place les engagements.
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
       roomDescription = new Room ("azertyu");
    }
    /**
     * 
     */
    @Test
    public void testSetExit() {
        Room thing = new Room("sxcvghuk");
        roomDescription.setExit("north",thing);
        assertEquals(thing, roomDescription.getExit("north"));
    }

    /**
    *
    * Method pour tester la viabilité du setter pour la sous-classe TrapRoom.
    */
    @Test
    public void testsetterVisited() // throws java.lang.Exception
    {
       Goodsetter.setVisited(true);
       assertEquals(true,Goodsetter.getIsVisited());
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
