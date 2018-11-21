

/**
 * The class LockRoom inherite of the class Room
 * This class is used for the Room Pantry and num 6.
 * this class links all classes that are blocked by a key or a password
 * 
 * @author Antoine PIERSON
 * @version 1.0
 * @date 14/11/2018
 */
public class LockRoom extends Room
{
    // It is a boolean so mean is the room is locked or not
    // by default the room is locked, so isLocked = false
    private boolean isLocked;
    /**
     * Constructor of the object of the class LockRoom
     * 
     * @param "description"
     * This class inherite the same criteria of the class Room for the description. 
     * The description should not be short.One letter does not constitue a description. 
     * If we try to do that, an exception will be returned to us. 
     * And the room cannot be created.
     * 
     * @param "isLocked"
     * The room have a specificity = it is locked.
     * We cannot access it without unlocking it.
     */
    public LockRoom(String description)
    {
        super(description);
        // initialisation of isLocked
        isLocked = false;
    }

    /**
     * getLocked allow to return the boolean isLocked 
     * @return isLocked.
     * This method inform us of the blocked or unblocked status of the room.
     */
    public boolean getLocked()
    {
        if (isLocked == false)
        {
            return false;
        }
        else // isLocked == true
        {
            return true;
        }
    }
    
    /**+
     * setLocked allows to modify the boolean isLocked
     * This method modifies the blocked or unblocked status of the room. 
     * we can use this method when we have what it takes to unlock it.
     */
    public void setLocked()
    {
        if (isLocked == false)
        {
            isLocked = true;
        }
        else // isLocked == true
        {
            isLocked = false;
        }
    }
}
