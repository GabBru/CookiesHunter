import java.util.*;
/**
 * Subclass Player inheriting the superclass Character.
 * This class represents the player in the game. 
 *
 * @author Gabriel Brunet @ Amandine Poullot
 * @version v0.1 2018nov
 */
public class Player extends Character
{  
    protected int level;
    /**
     * Player class constructors.
     * As one of the subclass of the Character superclass, each attributes of this class has the same restrictions.
     * The level of the player is always initialised to 0 once created and so cannot be under 0.
     * 
     * @param level Proper attribute for Player class. Represent the level of the character (int).
     */
    public Player(String newName, Room newRoom)
    {
        super(newName, newRoom);
        this.level=0;
    }
    
    /**
     * @return Return the level of the character under a integer form.
     */
    public int getLevel()
    {
        return level;
    }
    
    /**
     * Increment the level of the character (level + 1).
     */
    public void levelUp()
    {
        level++;
    }
    
    /**
     * Count the number of item given as parameters in the inventory of the player.
     * @return Return an integer which represent the occurence of an Item in an inventory.
     */
    
    public int getNumberItemGave(Item theItem)
    {
        int numberItem = 0;
        for (Item i : inventory)
            if (i.equals(theItem)){
                numberItem++;
            }
        return(numberItem);
    }
}
