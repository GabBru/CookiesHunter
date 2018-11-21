
/**
 * Class Key allows to manipulate the key items. 
 * The Key class inherits the Item class.
 * A key can open a closed door.
 *
 * @author Marie Bogusz & Kilian Felesmino
 * @version (1)
 */
public class Key extends Item
{
    // The roomUnlocked variable is the closed room that the key can open.
    private LockRoom roomUnlocked;

     /**
     * Constructor for objects of class Key
     * super(newName,newDescription) means that we use the mother class (Item) this twice String must be more long than one character.
     * this.roomUnlocked = roomUnlocked; means that we use a function that allows to open locked doors
     */
    public Key(String newName, String newDescription)
    {
        super(newName,newDescription);
        this.roomUnlocked = roomUnlocked;
    }

    /**
     * getRoomUnlocked() allows to return the closed room that the key can open.
     */
    public LockRoom getRoomUnlocked()
    {
        return roomUnlocked;
    }
}
 
