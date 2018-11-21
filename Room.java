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
 * @author  Diama Fall & Kilian FELESMINO
 * @version 2018.11
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
     * 
     * @param description The room's description. 
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
     * Method setExit: defines an exit from this room and replaces the setExits method.
     *This method allows to change exit of this room. In order to find other exits if there are any,
     *otherwise it returns null.
     *
     * @param direction:gives the direction of the exit.
     * @param neighbor:indicates the room in the given direction.
     */
    public void setExit(String direction, Room neighbor){
            exits.put(direction, neighbor);
    }
       
    /**
     * @return The description of the room.
     * This method gives the details of the room with its exits.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Get the value of the boolean isVisited. it informs us that the room has been visited by the player or not.
     * But does not block the accessibility of the room. And avoids revisiting the room.
     */
    public boolean getIsVisited()
    {
        return isVisited;
    }
    
    /**
     * Method that change the value of the boolean isVisited.
     * 
     */
    public void setIsVisited(boolean isVisited)
    {
        if (isVisited == true)
            isVisited = false;
        else
            isVisited = true;
    }
}
