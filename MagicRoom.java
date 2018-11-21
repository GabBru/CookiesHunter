import java.util.*;
/**
 * It is a class who inherites from Room. This room needs a password to be opened.
 *
 * @author: Thibaud GIL- Marie Bogusz
 * @version (2)
 */
 
public class MagicRoom extends Room
{
    //Variables d'instance
    private boolean isLocked; //The isLocked boolean define if the room is closed or open.
    private String passWord; //The passWord String 
    //Constructor for object of class MagicRoom
    /**
     * Constructor for objects of class MagicRoom
     * super(newDescription) means that we use the mother class (here : Room)
     * this.passWord is a local variable 
    */
    public MagicRoom (String newDescription, String passWord)
    {
        super(newDescription);
        this.passWord = passWord;
    }

    /** 
    * Modify the passWord of rooms using this.passWord which refers to the local variable.
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
