import java.util.*;
/**
 * Subclass Ennemies from the superclass Character. 
 * This class represents the different members of the family : 
 * the mother, the father, the sister, the brother, the grand-mother, the grand-father and 
 * the baby who holds the magic cookie.
 * 
 * This class inherites of the class Character. so the class has the same attributes as the parent class:
 * String name, Room currentRoom, ArrayList<Item> inventory
 * 
 * this class groups the different targets and levels to reach in order to obtain the "magic cookie" grale
 *
 * @author Amandine Poullot @ Gabriel Brunet
 * @version v0.1 2018-nov
 */
public class Ennemy extends Character
{
    protected int level;// it is a integer which means that the level is protected
    private boolean isDead;// it is a boolean which means that the ennemy is dead or not
    protected Character Enemy1;
    
    /**
     * Enemy class object constructor.
     * 
     * creates an ennemy described(has a name, a location with an assigned level and a certain number of objects)
     * @param "isDead" 
     * shows the living or non-living status of ennemy. To create an object in this class,
     * it must meet the construction criteria otherwise they will be an exception.
     * @param "Level"
     * returns the current level/room where ennemy is located.
     */
    public Ennemy(String newName, Room newRoom, int level)
    {
        super(newName, newRoom);
        isDead=false;
        this.level = level;
    }
    
    /**
     * @return the value of the boolean isDead.
     * This method informs of the living or non-living status of ennemy.
     */
    public boolean getIsDead()
    {
        return isDead;
    }
    
    /**
     * Change the value of the boolean isDead;
     * This method allows to modify the status of ennemy.
     */
    public void setIsDead(boolean isDead)
    {
        this.isDead = isDead;
    }
    
    /**
     * @return the value of the character's level.
     * This method gives the level where ennemy is located.
     * This
     */
    public int getLevel()
    {
        return level;
    }
    
    /**
     * Change the value of the character's level.
     */
    public void setLevel(int newLevel)
    {
        level = newLevel;
    }
}
