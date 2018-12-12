import java.util.*;
import javax.swing.*;
import java.awt.*;

/**
 * Décrivez votre classe ActionPanel ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ActionPanel extends JPanel
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Player player1;

    /**
     * Constructeur d'objets de classe ActionPanel
     */
    public ActionPanel(Player currentPlayer)
    {
        // initialisation des variables d'instance
        player1 = currentPlayer;
        
        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(3,3));
        myPanel.add(new JLabel(""));
        myPanel.add(new JButton("NORTH"));
        myPanel.add(new JButton("UP"));
        myPanel.add(new JButton("WEST"));
        myPanel.add(new JLabel(""));
        myPanel.add(new JButton("EAST"));
        myPanel.add(new JButton("DOWN"));
        myPanel.add(new JButton("SOUTH"));
        myPanel.add(new JLabel(""));
        myPanel.setVisible(true);
        add(myPanel);
   
        setVisible(true);
    }
}
