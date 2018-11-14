/**
 * It is a class who inherites from Room. This room needs a password to be opened.
 *
 * @author GIL Thibaud
 * @version 11/14/2018
 */
 
public class MagicRoom extends Room
{
    //Variables d'instance
    private String passWord; //It is the password to unlock the door
    private boolean isLocked; //Boolean represe

    //Constructor for object of class MagicRoom

    public void passWord(String passWord)
    {
        this.passWord = passWord;
    }

    public void setPassword()
    {
    }

    // Return to the password
    public String getPassword(passWord)
    {
        return passWord;
    }

    public void LockRoom()
    {
        return isLocked;
    }

}
