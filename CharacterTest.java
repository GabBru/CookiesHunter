import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

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
    private ArrayList<Item> testInvent;
    private Item Cookie;
    private Room Grenier;
    
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
        testCharacter = new Character("Moi",Grenier);
        Grenier = new Room("Vous êtes dans le grenier du gros bébé!");
        Cookie = new Item ("Cookie", "Gros cookie pour gros bébé");
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
            ok = new Character("   ",Grenier);
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
            ok = new Character ("Amandine",Grenier);
        } catch (IllegalArgumentException e) {
            result=false;
        }
        assertEquals(false, result);
    }
    
    /**
     * Method testConstructorCharacter : method that checked the good process of removing items from the list.
     */
    @Test
    public void testRemoveItem()
    {
        testCharacter.addInventory(Cookie);
        testCharacter.removeInventory(Cookie);
        assertEquals(false,testInvent.isEmpty());
    }
    
    /**
     * Method that checks if an item is correctly add to the inventory
     */
    @Test
    public void testAddItem()
    {
        testCharacter.addInventory(Cookie);
        assertEquals(1,testInvent.size());
    } 
}
