import java.util.*;
/**
 * Subclass Enemy inheriting the superclass Character. 
 * This class represents the different members of the family who can be attacked :
 * the mother, the father, the brother, the grand-mother, the grand-father and 
 * the baby who holds the magic cookie.
 *
 * @author Amandine Poullot & Gabriel Brunet & Diama FALL
 * @version 20/12/18
 */
public class Enemy extends Character
{
    private int level; // The level variable contains the level of the enemy.
    private boolean isDead; // The isDead variable says if the enemy is alive or not.
    private Room enemyRoom; // The enemyRoom variable contains the room where the enemy is.
    /**
     * Constructor that allows to ceate a new Enemy.
     * 
     * As one of the subclass of the Character superclass, each attributes of this class has the same restrictions.
     * The enemy have a status which determine if he is dead or not. It will allows the Player to picked up the enemy inventory.
     * The level must be up to 0, initialised during creation and determine if the user is able to beat him.
     * 
     * @param isDead informs on the living or non-living status of enemy.
     * @param level Returns the current level of the enemy.
     * @param enemyRoom contains the enemy room.
     * @exception IllegalArgumentException Returned in case of level troubles (<0).
     */
    public Enemy(String newName, int level, Room enemyRoom)
    {
        super(newName);
        isDead=false; //When an enemy is created, he is alive
        if (level<0) throw new IllegalArgumentException("Level must be positive");
        this.level = level;
        this.enemyRoom = enemyRoom;
    }
    
    /**
     * @return Return the value of the boolean isDead.
     * This method informs of the living or non-living status of enemy.
     */
    public boolean getIsDead()
    {
        return isDead;
    }
    
    /**
     * This method allows to kill the enemy.
     * An enemy can not come back to life. He dies only once.
     */
    public void setIsDead()
    {
        isDead = true;
    }
    
    /**
     * @return Return the value of the character's level.
     */
    public int getLevel()
    {
        return level;
    }
    
    /**
     * @return the room of the enemy
     */
    public Room getEnemyRoom(){
        return this.enemyRoom;
    }
}
