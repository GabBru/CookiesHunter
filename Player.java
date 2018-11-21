import java.util.*;

/**
 * Class Player = Subclass of Character.
 * This class represents the players in the different rooms. 
 * It also stored the list of objects picked up 
 * in the different maps = inventory.
 *
 * @author Gabriel Brunet @ Amandine Poullot
 * @version v0.1 2018-nov
 */
public class Player extends Character
{  
    protected int level; // the level of the character 
    //protected ArrayList<Item> CharInvent;
    /**
     * Player class constructors.
     * 
     */
    public Player(String newName, Room newRoom)
    {
        super(newName, newRoom);
        this.level=0;
    }
    
    /**
     * Return the level of the character.
     */
    public int getLevel()
    {
        return level;
    }
    
    /**
     * increment the level of the character (level + 1).
     */
    public void levelUp(int level)
    {
        level++;
    }
    
    /**
     * count the number of item named "cookie" in the inventory of the player
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
