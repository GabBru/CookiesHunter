
/**
 * Décrivez votre classe TrapRoom ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TrapRoom extends Room
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    
    private boolean visited;
    
    /**
     * Constructeur d'objets de classe TrapRoom
     */
    public TrapRoom(String description)
    {
      super(description);
      visited=false;
    }

    /**
     * boolean is visited
     *
     * @
     */
    public boolean getIsVisited()
    {
        return visited;
    }
    
    /**
     * 
     *
     * @
     */
    public void setVisited(boolean vis)
    {
        visited = vis;
    }
}
