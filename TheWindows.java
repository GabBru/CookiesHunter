import java.awt.*;
import javax.swing.*;
/**
 * Décrivez votre classe TheWindows ici.
 * 
 *
 * @author kilian felesmino
 * @version 05/12/2018
 */

public class TheWindows extends JFrame
{
    private ImageRoom test;
    Player pl;
    
    /**
     * Constructeur d'objets de classe Image
     */
    public TheWindows (ImageRoom imgR, Player play)
    {
            test = imgR;
            pl = play;
            JFrame myFrame = new JFrame("plan");
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
                       
            myFrame.add(new Image(test));
            myFrame.add(new Message(pl));
            
            
            myFrame.pack();
            myFrame.setVisible(true);
        

        
    }
}
