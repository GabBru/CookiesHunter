import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test CharacterTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
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
public class CharacterTest
{
    
    private Character ok, testCharacter;
    private ArrayList<String> testInvent;
    
    /**
     * Constructeur de la classe-test CharacterTest
     */
    public CharacterTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        testCharacter = new Character("Moi",0,setCurrentRoom(Grenier),addInventory(Cookie));
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
     * Method testConstructorCharacter : method that checked if there is no
     * blank as name.
     */
    @Test
    public void testConstructorBlankName()
    {
        boolean result=true;
        try {
            ok = new Character("   ",0,setCurrentRoom(Grenier),addInventory(Cookie));
        } catch (IllegalArgumentException e) {
            result = false;
        }
        assertEquals(false, result);
    }
    
    /**
     * Method testConstructorCharacter : method that checked if the level can be inferior than 0
     */
    @Test
    public void testInferiorLimitLevel()
    {
        boolean result=true;
        try {
            ok = new Character ("Amandine",-10,setCurrentRoom(Grenier),addInventory(Cookie));
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(false, result);
    }
    
    /**
     * Method testConstructorCharacter : method that checked the good process of removing items from the list.
     */
    @Test
    public testRemoveItem()
    {
        assertEquals(false,testCharacter.addInventory(Cookie));
    }
    
    /**
     * Method that checks if an item is correctly add to the inventory
     */
    @Test
    public testAddItem()
    {
        assertEquals(false,test
    }
    
    /**
     * Method testConstructorCharacter : method that checked if setting
     * level is correctly done.
     */
    @Test
    public void testSetLevel()
    {
        assertEquals(23,testCharacter.setLevel(23));
    }
    
    
}
