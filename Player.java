import java.util.*;
/**
 * Subclass Player inheriting the superclass Character.
 * This class represents the player in the game. 
 *
 * @author Gabriel Brunet & Amandine Poullot & Martin Pettinotti
 * @version v0.3 2018dec
 */
public class Player extends Character
{
    private int level; // The level variable includes the level of character.
    private Room currentRoom; // Obviously, this variable store the room where 
    private boolean win; // This variable is used in the fight method.
    private ArrayList<Item> inventory; // The inventory variable includes the character's item list.
    private String answer; // This variable store the riddle's answer to be compare with the MagicRoom's password.
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
        answer="";
    }
    
    /**
     * @return Return the level of the character under a integer form.
     */
    public int getLevel()
    {
        return level;
    }
    
    /**
     * @return Return the boolean win.
     */
    public boolean getWin()
    {
        return win;
    }
    
    /**
     * This method allows changing the contains of the string "answer".
     */
    public void setAnswer(String s)
    {
        answer = s;
    }
    
    /**
     * @return Return the string containing the answer entered as the riddle's answer.
     */
    public String getAnswer()
    {
        return answer;
    }
    
    /**
     * @return Return the description of the current room (Room class) where the character is. Just more faster than using the command getRoom().getDescription().
     */
    public String getRoomDesc()
    {
        return currentRoom.getDescription();
    }
    
    /** 
     * @return Return the current Room of the player.
     */
    public Room getRoom()
    {
        return currentRoom;
    }
    
    /**
     * Count the number of item given as parameters in the inventory of the player.
     * @return Return an integer which represent the occurence of an Item in the inventory.
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
     * This is a method which return the contents of the inventory. HTML tags are added into the string to manage the appearence on screen.
     * @return Return a string listing items in the character's inventory. 
     */
    public String returnInventory()
    {
        String contents = "<html><FONT size=5>";
        int count = 0;
        for (String nameItem : Item.validItems) {
        count = getNumberItemGave(nameItem);
            if ( count >0){
                contents = (contents + count + " " +nameItem+"<br>");
                count = 0;
            }
        } 
        contents = contents + "</FONT></html>";
        return contents;
    } 
    
    /**
     * This is a method which return an inventory.
     * @return Return the player's inventory.
     */
    public ArrayList<Item> returnInventoryPlayer()
    {
        return inventory;
    }
    
    /**
     * Change the room (Room class) where the character is.
    */
    public void setCurrentRoom(Room newCurrentRoom)
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
     * This method allows the player to move in other rooms. It first check the nature of the next room where the player try to go, then actions on. 
     */
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
                System.out.println("1");
                if (mr.getIsLocked() == true){
                    System.out.println(answer);
                    if (mr.checkPass(answer)){
                        mr.setIsLocked();
                        System.out.println("2");
                        if(mr.getNameRoom() == "hall")
                            currentRoom.setDescription("<html>You arrive in the hall with 3 other doors. The door facing north is opened.");
                        if(mr.getNameRoom() == "laundryRoom")
                            currentRoom.setDescription("<html>You arrive in the laundry. You have acces to the attic");
                        currentRoom=mr;
                    }
                } else {currentRoom=mr;}             
            }
            else { 
                currentRoom.isVisited = true;
                currentRoom=nextRoom; 
            }
    }
    
    /**
     * HasKey method check the presence of a key into the inventory.
     * @return Return a boolean if there is a "Key" in the inventory.
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
     * This method allows to compare the player's level and the enemy's level and decides the issu of the "fight."
     */
    public void fight(Enemy enemy, int playerLevel){
        boolean ok = true;
        
        if(enemy.getLevel() > playerLevel){
            win = false;
        }
        else if (enemy.getName().equals("Baby")){
            for(Item i : inventory){
                if(i.getName().equals("Bottle of milk")){
                    enemy.setIsDead();
                    ok = true;
                    break;
                }
                else{ 
                    ok = false; 
                }
            }
            if (ok = false) {
                win = false;
            }
        }
        else {
            enemy.setIsDead();
            levelUp(); 
        }
}
