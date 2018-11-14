
/**
 * The class LockRoom inherite of the class Room
 * This class is used for the Room Pandry and num 6.
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
     */
    public LockRoom(String description)
    {
        this.description = description;
        // initialisation of isLocked
        isLocked = false;
    }

    /**
     * getLocked allow to return the boolean isLocked 
     * @return isLocked
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
     * setLocked allow to modify the boolean isLo
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
