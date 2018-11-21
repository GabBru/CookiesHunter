import java.util.*;
/**
 * This class is the super-class using by the different characters constructors.
 * @author Amandine POULLOT & Gabriel BRUNET
 * @version v0.1 2018nov
 */

public class Character
{
    protected String name;
    protected Room currentRoom;
    protected ArrayList<Item> inventory;
    /**
     * Constructor
     * Create a new character.
     * Each character's name have to contain at least 3 characters. It also 
     * cannot start with a space or contain more than 1 space ("firstname family_name").
     * If one of those restrictions are not respected, the object cannot be created and an Exception statement will be return.
     * @param name This parameter represent the name of the Character. It will be automatically initialised depending on which Character created except for the Player class.
     * @param newRoom This parameter represent the current room where the character is located. It will evolve according to the progress of the game (Player case).
     * @param inventory Not given in the constructor method (always empty when characters are created).
     */
    public Character(String newName, Room newRoom)
    { 
        if (newName.length()<=2) throw new IllegalArgumentException();
        if ((newName.substring(0,1).equals(" ")) || (newName.length() - newName.replace(" ","").length())>1) throw new IllegalArgumentException();
        name = newName;
        currentRoom = newRoom;
        inventory = new ArrayList<Item>();
    }
    
    /**
     * Return the current room (Room class) where the character is.
     */
    public String getRoom()
    {
        return currentRoom.getDescription();
    }
    
    /**
     * Change the room (Room class) where the character is.
    */
    public void  setCurrentRoom(Room newCurrentRoom)
    {
        currentRoom = newCurrentRoom;
    }
    
    /**
     * Add an item (Item class) in the inventory of the character.
     */
    public void addInventory(Item theItem)
    {
        inventory.add(theItem);
    }
    
    /**
     * Remove an item (Item class) from the inventory of the character.
     */
    public void removeInventory(Item theItem)
    {
        inventory.remove(theItem);
    }
    
    /**
     * Recovers the name of the character.
     */
    public String getName()
    {
        return name;
    }
}
