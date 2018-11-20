
/**
 * Class Key allows to manipulate the key items. 
 * The Key class inherits the Item class.
 * A key can open a closed door.
 *
 * @author (Marie B)
 * @version (1)
 */
public class Key extends Item
{
    // The roomUnlocked variable is the closed room that the key can open.
    private LockRoom roomUnlocked;

    /**
     * Constructor for objects of class Key
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
 
