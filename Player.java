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
    private ArrayList<Item> inventory; // The inventory variable includes the character's item list.
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
                inventory = new ArrayList<Item>();
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
     * Count the number of item given as parameters in the inventory of the player.
     * @return Return an integer which represent the occurence of an Item in an inventory.
     */
    
    public int getNumberItemGave(String nameItem)
    {
        int numberItem = 0;
        for (Item i : inventory)
            if (i.name.equals(nameItem)){
                numberItem++;
            }
        return(numberItem);
    }
    
        /**
     * Add an item (Item class) in the inventory of the character.
     */
    public void addInventory(Item theItem)
    {
        inventory.add(theItem);
    }
    
    /**
     * Remove one type of item (Item class) from the inventory of the character.
     */
    public void removeInventory(Item i)
    {
        inventory.remove(i);
    }
    
    /**
     * This is a method which return the contents of the inventory.
     * @return Return a string listing items in the character's inventory. 
     */
    
    public String returnInventory()
    {
        String contents = "<html>";
        int count = 0;
        for (String nameItem : Item.validItems) {
        count = getNumberItemGave(nameItem);
            if ( count >0){
                contents = (contents + count + " " +nameItem+" ;<br>");
                count = 0;
            }
        } 
        return contents;
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
                if(lr.getLocked()==true){
                    for(Item i : inventory){
                        if(i.getName().equals("Key")){         
                            lr.setLocked();
                            currentRoom=lr;
                            inventory.remove(i);
                            break;
                        }
                    }
                } 
                else { currentRoom=lr;}
                    
            } 
            else if (nextRoom instanceof MagicRoom) {               
                MagicRoom mr = (MagicRoom)nextRoom;
                if (mr.getIsLocked() == true){
                    if (mr.checkPass("on récupère le string saisi ici")){
                        mr.setIsLocked();
                        if (mr.getNameRoom().equals("daughterRoom"))
                        {
                            currentRoom.setDescription("You are in the hall. The north-facing door is open");
                        }
                        currentRoom=mr;
                    }
                }
                
            } 
            else { 
                currentRoom.isVisited = true;
                currentRoom=nextRoom; 
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
