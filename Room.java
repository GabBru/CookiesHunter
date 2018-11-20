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
    private ArrayList<Item> roomItem;
    protected boolean alreadyVisited;
    /**
     * Create a room described "Description". Initially, it has
     * no exits. "Description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        if (description.length()<=1) throw new IllegalArgumentException("Description courte");
        this.description = description;
        exits = new HashMap<>();
        roomItem = new ArrayList<>();
        alreadyVisited = false;
    }

    /**
     * Method getExit: returns the room that we reach in the given direction
     * If there is no room in that direction, returns null
     *
     * @param direction The exit's direction
     * @return The roomin the given direction
     */
    
    public Room getExit(String direction){
            return exits.get(direction);
    }
    
    /**
     * Method setExit: defines an exit from this room
     * Replaces the setExits method
     *
     * @param direction the direction of the exit
     * @param neighbor the room in the given direction
     */
    public void setExit(String direction, Room neighbor){
            exits.put(direction, neighbor);
    }
       
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}
