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
     * If one of those restrictions are not respected, the object cannot be created and an Exception statement will be returned.
     * @param name This parameter represent the name of the Character. It will be automatically initialised depending on which Character is created except for the Player class.
     * @param newRoom This parameter represent the current room where the character is located. It will evolve according to the progress of the game (Player case).
     * @param inventory Not given in the constructor method (always empty when characters are created).
     * @exception IllegalArgumentException Returned in case of name's troubles - Less than 3 characters, more than one space or start with a space.
     */
    public Character(String newName, Room newRoom)
    { 
        if (newName.length()<=2 || (newName.substring(0,1).equals(" ")) || (newName.length() - newName.replace(" ","").length())>1) throw new IllegalArgumentException("Incorrect name");
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
    
    /**
     * Count the number of item given as parameters in the inventory of the player.
     * @return Return an integer which represent the occurence of an Item in an inventory.
     */
    
    public int getNumberItemGave(String nameItem)
    {
        int numberItem = 0;
        for (Item i : inventory)
            if (i.name.equals(nameItem)){
                numberItem++;
            }
        return(numberItem);
    }
    
    /**
     * This is a method which return the contents of the inventory
     */
    
    public String returnInventory()
    {
        String contents = "Votre inventaire contient : ";
        int count = 0;
        count = getNumberItemGave("Cookie");
            if ( count >0){
                contents = (contents + count + "Cookie ;");
                count = 0;
            }
        count = getNumberItemGave("Dentier");
            if (count > 0){
                contents = (contents + count + "Dentier ;");
                count = 0;
            }
        count = getNumberItemGave("Clé");
            if (count >0){
                contents = (contents + count + "Clé ;");
                count = 0;
            }                
        count = getNumberItemGave("Biberon");
            if (count >0){
                contents = (contents + count + "Biberon ;");
                count = 0;
            }
        count = getNumberItemGave("Biberon de lait");
            if (count >0){
                contents = (contents + count + "Biberon de lait ;");
                count = 0;
            }
            
        return contents;
    } 
}
