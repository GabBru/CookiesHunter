import java.util.*;
/**
 * Subclass Player inheriting the superclass Character.
 * This class represents the player in the game. 
 *
 * @author Gabriel Brunet @ Amandine Poullot
 * @version v0.1 2018nov
 */
public class Player extends Character
{  
    protected int level; // The level variable includes the level of character.
    protected Room currentRoom;
    /**
     * Player class constructors.
     * As one of the subclass of the Character superclass, each attributes of this class has the same restrictions.
     * The level of the player is always initialised to 0 once created and so cannot be under 0.
     * 
     * @param level Proper attribute for Player class. Represent the level of the character (int).
     */
    public Player(String newName, Room newRoom)
    {
        super(newName);
        currentRoom = newRoom;
        this.level=0;
    }
    
    /**
     * @return Return the level of the character under a integer form.
     */
    public int getLevel()
    {
        return level;
    }
    
    
    /**
     * Return the current room (Room class) where the character is.
     */
    public String getRoomDesc()
    {
        return currentRoom.getDescription();
    }
    
    public Room getRoom(){
        return currentRoom;
    }
    
    /**
     * Change the room (Room class) where the character is.
    */
    public void  setCurrentRoom(Room newCurrentRoom)
    {
        currentRoom = newCurrentRoom;
    }
    
    /**
     * Increment the level of the character (level + 1)
     */
    public void levelUp()
    {
        level++;
    }
    
    /**
     * Count the number of item given as parameters in the inventory of the player.
     * @return Return an integer which represent the occurence of an Item in an inventory.
     */
    
    public int getNumberItemGave(Item theItem)
    {
        int numberItem = 0;
        for (Item i : inventory)
            if (i.equals(theItem)){
                numberItem++;
            }
        return(numberItem);
    }
    
    public boolean move(String direction){       
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) return false;
        else {
            if (nextRoom instanceof LockRoom ){
                LockRoom lr = (LockRoom)nextRoom;
                if(hasKey(lr)){
                    lr.setLocked();
                    currentRoom=lr;
                    return true;
                }else{return false;}
            } else if (nextRoom instanceof MagicRoom) {
                //check password
                MagicRoom mr = (MagicRoom)nextRoom;
                Scanner reader = new Scanner(System.in);
                String attempt = reader.nextLine();
                if(mr.checkPass(attempt)){
                    mr.setIsLocked();
                    currentRoom=mr;
                    return true;
                }else {return false;}
            } else { currentRoom=nextRoom; }
        }
        return true;
    }
    
    public boolean hasKey(LockRoom thisRoom){
        for(Item i : inventory){
            if(i instanceof Key){
                Key k = (Key)i;
                if(thisRoom == k.getLockRoom()) return true;
            }
        }
        return false;
    }    
}
