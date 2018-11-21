import java.util.HashMap;
import java.util.*;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west,up and down.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Diama Fall & Kilian FELESMINO & Diama FALL
 * @version v0.1 2018nov
 *
 */
public class Room   
{
    protected String description;
    private HashMap<String, Room> exits;
    protected boolean isVisited;
    
    /**
     * Create a room described "Description". Initially, it has
     * no exits. "Description" is something like "a kitchen" or
     * "an open court yard".
     *  @param description The room's description. 
     * The description should not be short.One letter does not constitue a description. 
     * If we try to do that, an exception will be returned to us. 
     * And the room cannot be created.
     * 
     *@param "HashMap<>"
     *It define the exits of the rooms created. 
     *Every direction either leads to another room or is null (no exists there)
     *
     *@param "isVisited"
     *when the room does not meet the description criteria. 
     *it will not be created and therefore cannot be visited
     */
    public Room(String description) 
    {
        if (description.length()<=1) throw new IllegalArgumentException("Description courte");
        this.description = description;
        exits = new HashMap<>();
        isVisited = false;
    }

    /**
     * Method getExit: returns the room that we reach in the given direction
     * If there is no room in that direction, returns null
     *
     * @param direction The exit's direction. It gives the direction where the exit is located.
     * @So it returns The room in the given direction.
     */
    
    public Room getExit(String direction){
            return exits.get(direction);
    }
    
    /**
     * Method setExit: defines an exit from this room
     * Replaces the setExits method
     *
     * @param direction the direction:gives of the exit.
     * @param neighbor:indicates the room in the given direction.
     */
    public void setExit(String direction, Room neighbor){
            exits.put(direction, neighbor);
    }
    
    /**
     * Get a sting that describe the exits of rooms
     *
     */
    public String getExitString(){
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }
    
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Get the value of the boolean isVisited
     */
    public boolean getIsVisited()
    {
        return isVisited;
    }
    
    /**
     * Method that change the value of the boolean isVisited 
     */
    public void setIsVisited()
    {
        if (isVisited == true)
            isVisited = false;
        else
            isVisited = true; 
    }
}
