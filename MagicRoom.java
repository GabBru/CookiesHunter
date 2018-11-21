import java.util.*;
/**
 * It is a class who inherites from Room. This room needs a password to be opened.
 *
 * @author GIL Thibaud
 * @version 11/14/2018
 */
 
public class MagicRoom extends Room
{
    //Variables d'instance
    private boolean isLocked; //Boolean represe
    private String magicPass, passWord;
    //Constructor for object of class MagicRoom

    public MagicRoom (String newDescription, String passWord)
    {
        super(newDescription);
        this.magicPass = passWord;
    }

    public void setPassword (String newPassWord)
    {
        this.passWord = newPassWord;
    }

    // Return to password
    public void getPassword()
    {
    }

    public void LockRoom()
    {
    }

}
