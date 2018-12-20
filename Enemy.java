import java.util.*;
/**
 * Subclass Ennemies inheriting the superclass Character. 
 * This class represents the different members of the family : 
 * the mother, the father, the sister, the brother, the grand-mother, the grand-father and 
 * the baby who holds the magic cookie.
 *
 * @author Amandine Poullot & Gabriel Brunet & Diama FALL
 * @version v0.2 2018-nov
 */
public class Enemy extends Character
{
    protected int level; // The level variable includes the level of the ennemy.
    private boolean isDead; // The isDead variable say if the ennemy is alive or not.
    protected Character Enemy1;
    protected Room enemyRoom;
    /**
     * Constructor that allows to ceate a new Ennemy.
     * 
     * As one of the subclass of the Character superclass, each attributes of this class has the same restrictions.
     * The ennemy have a status which determine if he is dead or not. It will allows the Player to picked up the ennemy inventory.
     * The level must be up to 0, initialised during creation and determine if the user is able to beat him.
     * 
     * @param isDead Inform on the living or non-living status of ennemy.
     * @param level Return the current level of the ennemy.
     * @exception IllegalArgumentException Returned in case of level troubles (<0).
     */
    public Enemy(String newName, int level, Room enemyRoom)
    {
        super(newName);
        isDead=false;
        if (level<0) throw new IllegalArgumentException("Level must be positive");
        this.level = level;
        this.enemyRoom = enemyRoom;
    }
    
    /**
     * @return Return the value of the boolean isDead.
     * This method informs of the living or non-living status of ennemy.
     */
    public boolean getIsDead()
    {
        return isDead;
    }
    
    /**
     * Change the value of the boolean isDead;
     * This method allows to modify the status of ennemy.
     */
    public void setIsDead(boolean isDead)
    {
        this.isDead = isDead;
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
    
    /**
     * Change the value of the character's level.
     */
    public void setLevel(int newLevel)
    {
        level = newLevel;
    }
}
