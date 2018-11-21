
/**
 * Class Item allows to manipulate items in the game. 
 * An item is owned by a character.
 *
 * @author : Marie Bogusz
 * @version (1)
 */
public class Item
{
    // Name is the variable that contains the item name.
    protected String name;
    // Description is the variable that contains the description of the item. 
    protected String description;
    
    /**
     * Constructor for objects of class Item
     * string name is the name of an Item
     * string description is the description of an Item 
     * (for exemple: the denture contains 18 teeth and is suitable for the grandmother)
     */
    public Item(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    /**
     * getName() allows to return the name of the item. 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * getDescription() allows to return the description of the item.
     */
    public String getDescription()
    {
        return description;
    }
}
