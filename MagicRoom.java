import java.util.*;
import java.lang.String;

/**
 * Subclass Ennemies inherites the superclass Character. 
 * Like the LockRoom, this one needs an entity (here a String passWord) to be unlocked.
 *
 * @author GIL Thibaud & Kilian Felesmino & Marie Bogusz
 * @version v0.2 2018nov
 */
public class MagicRoom extends Room
{
    private boolean isLocked; // The isLocked variable say if the room is locked or not.
    private String passWord; // The passWord variable includes the password that allows to unlock the room.
   /**
    * Constructor that allows to create a new MagicRoom.
    * As one of the subclass of the LockRoom superclass, each attributes of this class has the same restrictions.
    * The password must contain at least 1 character and must not contain any spaces.
    * If there is a space in the password, the object cannot be created and an exception is returned.
    * 
    * @param newDescription See details in the superclass.
    * @param passWord Must be compare to a given String to be changed as an unlockedRoom. If the two spring are not the same, the room stay blocked and the Player cannot go inside.
    * @exception IllegalArgumentException Returned in case of passWord troubles (spaces).
    */
   public MagicRoom (String nameRoom, String newDescription, String passWord)
   {
       super(nameRoom, newDescription);
       if ((passWord.length()<1) || (passWord.length() - passWord.replace(" ","").length())>0) throw new IllegalArgumentException("Incorrect password");
       this.passWord = passWord;
       isLocked=true;
   }
   
   /** 
    * Able to change the value of the String passWord. Should not be used once the object created whithout exception. 
    */
   public void setPassword (String newPassWord)
   {
       this.passWord = newPassWord;
   }
   
   /** 
    * @return Return the string corresponding to the passWord.
    */
   public String getPassword()
   {
       return passWord;
   }

   /** 
    * Method changing automatically the value of the boolean isLocked. Switch the state "true" or false" to its inverse.
    */
   public void setIsLocked()
   {
       isLocked=true;
   }

   /** 
    * @return Return the boolean isLocked.
    */
   public boolean getIsLocked()
   {
       return isLocked;
   }
   
   /**
    * @return Return a boolean to check the password entered in case of right password or not.
    */
   public boolean checkPass(String attempt){
       if(attempt.equals(passWord)) return true;
       else return false;
   }
}
