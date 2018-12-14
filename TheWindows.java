import java.util.*;
import javax.swing.*;
import java.awt.*;
/**
 * Class The window orgenized the different panels : Info, Message, 
 * Menu, ActionPanel,Image and Image Room
 * 
 * @author Antoine P. & Martin P.
 * @version 05/12/2018
 */

public class TheWindows extends JFrame
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private ImageRoom test;
    private Game myGame;
    // creation of a pTop panel that contains the Image and Inventory panels
    //that will be organized in BorderLayout.
    private JPanel pTop, pBottom;
    
    /**
     * Constructeur d'objets de classe Image
     */
    public TheWindows (Game theGame) //
    {
        myGame = theGame;
        
        JFrame myFrame = new JFrame("Hunter Cookies");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //myFrame.setSize(1600,900);
        myFrame.setResizable(true);
        myFrame.setLayout(new GridLayout(2,1));
        
        
        myFrame.add(new Image(myGame.getImgCurrentRoom()));
        myFrame.add(new JLabel(""));
        myFrame.add(new ActionPanel(myGame.getPlayer()));
        myFrame.add(new Info(myGame));
        
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
