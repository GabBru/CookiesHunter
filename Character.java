import java.util.*;
/**
 * This class is the super-class using by the different characters constructors.
 * @author Amandine POULLOT & Gabriel BRUNET
 * @version v0.1 2018nov
 */
public class Character
{
    protected String name;    
    protected ArrayList<Item> inventory;
    /**
     * Constructor
     * Create a new character.
     * Each character's name have to contain at least 3 characters. It also 
     * cannot start with a space or contain more than 1 space (ex : "firstname family_name").
     * If one of those restrictions are not respected, the object cannot be created and an Exception statement will be returned.
     * @param newName This parameter represent the name of the Character. It will be automatically initialised depending on which Character is created except for the Player class.
     * @param newRoom This parameter represent the current room where the character is located. It will evolve according to the progress of the game (Player case).
     * @param inventory Not given in the constructor method (always empty when characters are created).
     * @exception IllegalArgumentException Returned in case of name's troubles - Less than 3 characters, more than one space or started with a space.
     */
    public Character(String newName)
    { 
        if (newName.length()<=2 || (newName.substring(0,1).equals(" ")) || (newName.length() - newName.replace(" ","").length())>1) throw new IllegalArgumentException("Incorrect name");
        name = newName;        
        inventory = new ArrayList<Item>();
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
     * This is a method which return the contents of the inventory.
     * @return Return a string listing items in the character's inventory. 
     */
    
    public String returnInventory()
    {
        String contents = "Your inventory contains : ";
        int count = 0;
        for (String nameItem : Item.validItems) {
        count = getNumberItemGave(nameItem);
            if ( count >0){
                contents = (contents + count + " " +nameItem+" ;");
                count = 0;
            }
        } 
        return contents;
    } 
}
