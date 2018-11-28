// import java.util.*;
/**
 * Class Item is used to manipulate items in the game. 
 * An item is owned by a character and composed of a proper name and description for each of them.
 * 
 * @author : Marie Bogusz & Gabriel Brunet
 * @version v0.2 2018nov
 */
public class Item
{
    protected String name;
    protected String description;
    public static final String[] validItems = {
      "Cookie", "Denture", "Baby bottle", "Milk", "Key", "Bottle of milk"
    };
    /**
     * Constructor 
     * Create a new Item.
     * Each item's name must contain at least 1 character and doesn't have to start with a space.
     * Description must contain at least 10 characters and have not to start with a space.
     * If one of those restrictions are not respected, the object cannot be created and an exception statement is returned.
     * 
     * @param name Proper name for the item created.
     * @param description Proper description for the item created.
     * @exception IllegalArgumentException Returned in case of name or description troubles. See restrictions above.
     */
    public Item(String name, String description)
    {
        if (isItem(name)==false) throw new IllegalArgumentException("Incorrect item's name");
        this.name = name;
        if (description.length()<10 || description.substring(0,1).equals(" ")) throw new IllegalArgumentException("Incorrect description");
        this.description = description;
    }
    
    /**
     * This method check the presence of a given string in the list "validItems".
     * 
     * @return Return a boolean true if a given string is in the list of valid items. False if not.
     */
    private boolean isItem (String name)
    {
        for(int i = 0; i < validItems.length; i++) {
            if(validItems[i].equals(name))
                return true;
        }
        return false;
    }
    
    /**
     * @return Return the name of the item under a String form. 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return Return the full description of the item under a String form.
     */
    public String getDescription()
    {
        return description;
    }
}
