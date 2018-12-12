// import java.util.*
/**
 * The class LockRoom inherites the super class Room.
 * This class links all rooms that are blocked by a key or a password.
 * 
 * @author Antoine PIERSON & Marie BOGUSZ & Martin PETTINOTTI
 * @version v0.2 2018nov
 */
public class LockRoom extends Room
{
    private boolean isLocked;
    /**
     * Constructor of the object of the class LockRoom
     * 
     * This class inherite the same criteria of the class Room for the description. 
     * The description should not be short.One letter does not constitue a description. 
     * If we try to do that, an exception will be returned. 
     * And the room cannot be created.
     * 
     * @param description See details in superclass. 
     * @param isLocked This attributes allows us to manage the accessibility of a room to an other.We cannot access it without unlocking it with a key (Item).
     */
    public LockRoom(String description)
    {
        super(description);
        isLocked = true;
    }

    /**
     * This method inform us on the blocked or unblocked status of the room. 
     * @return isLocked Return the boolean isLocked.
     */
    public boolean getLocked()
    {
        return isLocked;
    }
    
    /**
     * This method switched the blocked or unblocked status of the room. 
     */
    public void setLocked()
    {
        if (isLocked == false){isLocked = true;}
        else {isLocked = false;}
    }
}
