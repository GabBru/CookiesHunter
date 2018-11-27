/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 * 
 * Contributors : Amandine Poullot, Martin Pettinotti, Marie Bogusz, Kilian Felesmino, Diama Fall, Thibaut Gill, Antoine Pierson, Gabriel Brunet.
 */

public class CommandWords
{
    // a constant array that holds all valid command words
    private static final String[] validCommands = {
        "go", "quit", "help", "look", "talk", "fight", "pickup"
    };

    /**
     * Constructor - initialise the command words.
     */
    public CommandWords()
    {
        // nothing to do at the moment...
    }

    /**
     * Method printValidCommands: prints a string that contains all valid commands, separated by a space
     */
    public static void printValidCommands(){
        String theCommands = "";
        for(String command : validCommands) {
            theCommands += command + " ";
        }
        System.out.print(theCommands);
    }

    /**
     * Check whether a given String is a valid command word. 
     * @return true if a given string is a valid command,false if it isn't.
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        // if we get here, the string was not found in the commands
        return false;
    }
}
