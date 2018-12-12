import java.awt.*;
import javax.swing.*;
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
    Player nn;
    
    /**
     * Constructeur d'objets de classe Image
     */
    public TheWindows (ImageRoom tata)
    {
            test=tata;
            nn = oo;
            JFrame myFrame = new JFrame("plan");
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
                       
            myFrame.add(new Image(test));
            myFrame.add(new Message(nn));
            
            
            myFrame.pack();
            myFrame.setVisible(true);
        

        
    }
}
