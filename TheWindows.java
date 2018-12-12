import java.util.*;
import javax.swing.*;
import java.awt.*;
/**
 * Décrivez votre classe TheWindows ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TheWindows extends JFrame
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Game jeu;
    /**
     * Constructeur d'objets de classe TheWindows
     */
    
    public TheWindows(Game currentGame)
    {
        jeu = currentGame;
        // initialisation des variables d'instance
        JFrame myFrame = new JFrame("Test");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(1600,900);
        myFrame.setResizable(true);
        myFrame.setLayout(new GridLayout(2,2));
        myFrame.add(new Image(jeu.getImgCurrentRoom()));
        myFrame.add(new JLabel(""));
        myFrame.add(new ActionPanel(jeu.getPlayer()));
        
        //Display elements
        myFrame.pack();
        myFrame.setVisible(true);
    }
    
    public void Initialisation () {
        //Initialiser tout les ImageRoom        
    }
}
