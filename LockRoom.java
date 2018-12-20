/**
 * The class LockRoom inherites the super class Room.
 * This class links all rooms that are blocked by a key or a password.
 * 
 * @author Antoine PIERSON & Marie Bogusz
 * @version 05/12/2018
 */
public class LockRoom extends Room
{
    private boolean isLocked; // isLocked variable say if the room is locked or not.
    /**
     * Constructor that allows to create LockRoom
     * 
     * This class inherite the same criteria of the class Room for the description. 
     * The description should not be short.One letter does not constitue a description. 
     * If we try to do that, an exception will be returned and the room cannot be created.
     * 
     * @param description See details in superclass. 
     * @param isLocked This attributes allows us to manage the accessibility of a room to an other.
     * We cannot access it without unlocking it with a key Item.
     */
    public LockRoom(String nameRoom, String description)
    {
        super(nameRoom, description); //These two variables are inherited from the parent class Room.
        isLocked = true; //A new LockRoom is closed.
    }

    /**
     * This method inform us on the locked or unlocked status of the room. 
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
        isLocked = false;
    }
}
