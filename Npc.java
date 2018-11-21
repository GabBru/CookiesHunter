import java.util.*;
/**
 * Npc is a class of non-player character, not agressive, with a different constructor.
 * @Amandine POULLOT & Gabriel BRUNET
 * @version 1.0 14/11/2018
 */

public class Npc extends Character
{
    /**
     * Constructeur d'objets de classe Npc.
     */
    public Npc(String newName, Room newRoom, ArrayList<Item> CharInvent)
    {
        super(newName, newRoom);
    }

}
