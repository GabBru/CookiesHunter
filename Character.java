import java.util.ArrayList;

/**
 * This class represents the different characters of the game.
 * @author Amandine POULLOT & Gabriel BRUNET
 * @version 1.0 14/11/2018
 */

public class Character
{
    // variables d'instance
    protected String name; // the name of the character
    protected Room currentRoom; //the current room where the character is in.
    protected ArrayList<Item> inventory; //represents a list with all items (Item class) detained by the character
       
    /**
     * Constructor
     * Create a new character.
     */
    public Character(String name, Room newRoom)
    { 
        this.name=name;
        currentRoom=newRoom;
        inventory= new ArrayList<Item>();
        
    }
    
    /**
     * Return the current Room where the character is in.
     */
    public String getRoom()
    {
        return currentRoom.getDescription();
    }
    
    /**
     * Change the room (Room class) where the character is in.
    */
    public void  setCurrentRoom(Room currentRoom)
    {
    }
    
    /**
     * Add an item (Item class) in the inventory of the character
     */
    public void addInventory(Item newItem)
    {
    }
    
    /**
     * Remove an item (Item class) from the inventory of the character
     */
    public void removeInventory(Item theItem)
    {
    }
    
    /**
     * Recovers the name of the character.
     */
    public String getName()
    {
        return name;
    }
        
    /**
     * Allows to the character to talk
     */
    
    public void talk()
    {
    }
    
}
