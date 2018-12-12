import java.util.*;
import javax.swing.*;
import java.awt.*;
/**
 * Décrivez votre classe Image ici.
 * 
 *
 * @author kilian felesmino
 * @version 05/12/2018
 */

public class TheWindows extends JFrame
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private ImageRoom test;
    private Game monGame;
    // creation of a pTop panel that contains the Image and Inventory panels
    //that will be organized in BorderLayout.
    private JPanel pTop, pBottom;
    
    /**
     * Constructeur d'objets de classe Image
     */
    public TheWindows (Game theGame) //
    {
        monGame = theGame;
        
        JFrame myFrame = new JFrame("Hunter Cookies");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //myFrame.setSize(1600,900);
        myFrame.setResizable(true);
        myFrame.setLayout(new GridLayout(2,1));
        
        
        myFrame.add(new Image(monGame.getImgCurrentRoom()));
        myFrame.add(new JLabel(""));
        myFrame.add(new ActionPanel(monGame.getPlayer()));
        myFrame.add(new Info(monGame));
        
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
