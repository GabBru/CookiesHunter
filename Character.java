/**
 * This class is the super-class using by the different characters constructors.
 * @author Amandine POULLOT & Gabriel BRUNET
 * @version v0.1 2018nov
 */
public class Character
{
    protected String name; // The name variable includes the name of the character.
    /**
     * Constructor that allows you to create a new character.
     * Each character's name have to contain at least 3 characters. It also 
     * cannot start with a space or contain more than 1 space (ex : "firstname family_name").
     * If one of those restrictions are not respected, the object cannot be created and an Exception statement 
     * will be returned.
     * 
     * @param newName This parameter represent the name of the Character. It will be automatically initialised.
     * @exception IllegalArgumentException Returned in case of name's troubles - Less than 3 characters, more 
     * than one space or started with a space.
     */
    public Character(String newName)
    { 
        if (newName.length()<=2 || (newName.substring(0,1).equals(" ")) || (newName.length() - newName.replace(" ","").length())>1) throw new IllegalArgumentException("Incorrect name");
        name = newName;
    }

   /**
     * Return the name of the character.
     */
    public String getName()
    {
        return name;
    }
}
