import java.util.HashMap;
import java.util.*;
/**
 * Class Room - a room in an adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west,up and down.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Diama Fall & Kilian Felesmino & Amandine Poullot & Gabriel Brunet
 * @version v0.1 2018nov
 */
public class Room   
{
    protected String description; // The description variable includes the description of the room.
    private String nameRoom;
    private HashMap<String, Room> exits; // The exits variable is a HashMap that includes the rooms associated with the exits.
    protected boolean isVisited; // The isVisited variable indicates if the player has visited the room or not.
    protected Item itemRoom; // The inventoryRoom variable is a ArrayList that includes the items was in the room.
    /**
     * Constructor 
     * Create a new Room.
     * 
     * Initially, it has no exits. 
     * Description must contain at least 10 characters and have not to start with a space. 
     * If we try to do that, an exception will be returned and the room cannot be created.
     *
     * @param description Proper description for the room created.
     * @param exits It define the exits of the rooms created. Each direction either leads to another room or is null (no exists here)
     * @param isVisited Used to inform if the Player has already visited the room. Useful to manage traps and mini map.
     * @exception IllegalArgumentException Returned in case of description's troubles. Incorrect size or format. See instructions above.
     */
    public Room(String nameRoom, String description) 
    {
        if (description.length()<10) throw new IllegalArgumentException("Incorrect description");
        this.description = description;
        this.nameRoom = nameRoom;
        exits = new HashMap<>();
        isVisited = false;
        this.itemRoom = null; 
    }

    /**
     * Returns the room that we reach in the given direction.
     * If there is no room in that direction, return null.
     *
     * @param direction The exit's direction. It gives the direction where the exit is located.
     * @return Directions of the current room.
     */
    public Room getExit(String direction){
            return exits.get(direction);
    }
    
    /**
     * Defines an exit from this room. The direction have to be present in the enumerate type for directions.
     *
     * @param direction Cardinal direction (north,south,east,west,up,down). Represent keys in the HashMap<>.
     * @param neighbor Indicates the room in the given direction.
     */
    public void setExit(String direction, Room neighbor){
            exits.put(direction, neighbor);
    }
    
    /**
     * This method displays a sentence containing exits of the current room.
     * 
     * @return displayExits String returned containing all exits of the current room. Use the HashMap<> tool.
     */
    public String getExitString(){
        String displayExits = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            displayExits += " " + exit;
        }
        return displayExits;
    }
    
    /**
     * @return Return a string describing the room (=description).
     */
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String des)
    {
        description = des;
    }
    
    /**
     * @return Return a name at the room.
     */
    public String getNameRoom()
    {
        return nameRoom;
    }
    
    /**
     * @return The value of the boolean isVisited.
     */
    public boolean getIsVisited()
    {
        return isVisited;
    }
    
    /**
     * Add an item (Item class) in the inventory of the character.
     */
    public void addItemRoom(Item theItem)
    {
        itemRoom = theItem;
    }
    
    public Item getItem(){
        return itemRoom;
    }
    
    /**
     * Remove an item (Item class) from the inventory of the character.
     */
    public void removeItemRoom(Item theItem)
    {
        itemRoom = null;
    }

}
