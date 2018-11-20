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
    protected Character Player1;
    //protected ArrayList<Item> CharInvent;
    /**
     * Player class constructors.
     * 
     */
    public Player(String newName, Room newRoom, ArrayList<Item> CharInvent)
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
     * Change the level of the character.
     */
    public void setLevel(int level)
    {
    }
}
