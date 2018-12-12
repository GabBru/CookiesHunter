/**
 * Class Key allows to manipulate the key items. 
 * The Key class inherits the Item class.
 * A key can open a closed door represents by the LockRoom class.
 *
 * @author Marie Bogusz & Kilian Felesmino
 * @version v0.1 2018nov
 */
public class Key extends Item
{
    private LockRoom roomUnlocked; // ???
     /**
     * Constructor for objects of class Key
     * 
     * As one of the subclass of the Item superclass, each attributes of this class has the same restrictions.
     */
    public Key(String newName, String newDescription, LockRoom newLock)
    {
        super(newName,newDescription);
        this.roomUnlocked = newLock; // ???
    }

    /**
     * @return getRoomUnlocked() allows to return the closed room that the key can open.
     */
    public LockRoom getRoomUnlocked()
    {
        return roomUnlocked; // ???
    }
    
    public LockRoom getLockRoom(){
        return roomUnlocked;
    }
}
