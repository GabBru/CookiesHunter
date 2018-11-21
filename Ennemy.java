import java.util.*;
/**
 * Subclass Ennemy from the superclass Character. This class represents the different members of the family : 
 * the mother, the father, the sister, the grand-mother and the grand-father. 
 * 
 *
 * @author Amandine Poullot @ Gabriel Brunet
 * @version v0.1 2018-nov
 */
public class Ennemy extends Character
{
    protected int level;
    private boolean isDead;
    protected Character Enemy1;
    
    /**
     * Constructor of the object of the class Ennemy
     */
    public Ennemy(String newName, Room newRoom, ArrayList<Item> CharInvent)
    {
        super(newName, newRoom);
        isDead=false;
    }
    
    /**
     * Return the value of the boolean isDead.
     */
    public boolean getDead()
    {
        return isDead;
    }
    
    /**
     * Change the value of the boolean isDead;
     */
    public void setDead()
    {
        if (isDead = false) {
            isDead = true;
        }
        else {
            isDead = false;
        }
    }
}
