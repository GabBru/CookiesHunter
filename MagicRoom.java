import java.util.*;
/**
 * It is a class who inherites from Room. This room needs a password to be opened.
 *
 * @author GIL Thibaud
 * @version (2)
 */
 
public class MagicRoom extends Room
{
    //Variables d'instance
    private boolean isLocked; //The isLocked boolean define if the room is closed or open.
    private String passWord; //The passWord String 
    //Constructor for object of class MagicRoom

    public MagicRoom (String newDescription, String passWord)
    {
        super(newDescription);
        this.passWord = passWord;
    }

    /** 
    * Modify the passWord of rooms
    */
   public void setPassword (String newPassWord)
    {
        this.passWord = newPassWord;
    }
    
    /** 
    * Return the password of room
    */
   public String getPassword()
    {
        return passWord;
    }

    /** 
    * Modify the boolean isLocked
    */
   public void setIsLocked()
    {
        if (isLocked == true)
            isLocked = false;
        else
            isLocked = true;
    }

   /** 
    * Return the boolean isLocked
    */
   public boolean getIsLocked()
    {
        return isLocked;
    }
}
