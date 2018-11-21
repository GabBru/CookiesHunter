import java.util.*;
/**
 * Subclass Ennemies from the superclass Character. This class represents the different members of the family : 
 * the mother, the father, the sister, the grand-mother and the grand-father. 
 * 
 *
 * @author Amandine Poullot @ Gabriel Brunet
 * @version v0.1 2018-nov
 */
public class Ennemy extends Character
{
    protected int level;
    private boolean isDead;
    protected Character Enemy1;
    
    /**
     * Constructeur d'objets de classe Ennemies
     */
    public Ennemy(String newName, Room newRoom, int level)
    {
        super(newName, newRoom);
        isDead=false;
        this.level = level;
    }
    
    /**
     * @return the value of the boolean isDead.
     */
    public boolean getIsDead()
    {
        return isDead;
    }
    
    /**
     * Change the value of the boolean isDead;
     */
    public void setIsDead(boolean isDead)
    {
        this.isDead = isDead;
    }
    
    /**
     * @return the value of the character's level.
     */
    public int getLevel()
    {
        return level;
    }
    
    /**
     * Change the value of the character's level.
     */
    public void setLevel(int newLevel)
    {
        level = newLevel;
    }
}
