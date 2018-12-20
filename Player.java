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
    protected boolean win;
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
        win=true;
    }
    
    /**
     * @return Return the level of the character under a integer form.
     */
    public int getLevel()
    {
        return level;
    }
        
    public boolean getWin(){
        return win;
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

    public void move(String direction){       
        Room nextRoom = currentRoom.getExit(direction);
            if (nextRoom instanceof LockRoom ){
                LockRoom lr = (LockRoom)nextRoom;
                for(Item i : inventory){
                    if(i.getName().equals("Key")){
                        currentRoom=nextRoom;
                        //removeInventory("Key"); 
                        lr.setLocked();           
                    }
                }
                    
            } else if (nextRoom instanceof MagicRoom) {
                //check password                
                MagicRoom mr = (MagicRoom)nextRoom;
                currentRoom=nextRoom;
                mr.setIsLocked();
                
                //Scanner reader = new Scanner(System.in);
                //String attempt = reader.nextLine();
                //if(mr.checkPass(attempt)){
                  //  mr.setIsLocked();                   
                  //currentRoom=nextRoom; 
                //}
            } else { 
                currentRoom.isVisited = true;
                currentRoom=nextRoom; 
                }
        
    }
    
    /**
     * hasKey method
     * @return boolean if there is a "Key" in the inventory
     */
    public boolean hasKey(){
        for(Item i : inventory){
            if(i.getName().equals("Key")){
                return true; // there is a key in the inventory
            }
            else {return false;} // there is not a key in the inventory
        }
        return false; // return false if the method not enter in the for loop
    }
    
    /**
     * this method allows to compare the player's level and the enemy's level and decides the issu of the "fight."
     */
    public void fight(Enemy enemy, int playerLevel){
        if(enemy.getLevel() > playerLevel){
            win = false; // ici ÃƒÆ’Ã‚Â§a devrait appeler la mÃƒÆ’Ã‚Â©thode qui affiche le game over
        }
        else{
            enemy.setIsDead(true);
            levelUp(); 
            //Donner cookie
            //changer description piece
        }
    }
}
