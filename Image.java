import java.awt.*;
import javax.swing.*;
/**
 * Décrivez votre classe Image ici.
 *
 * @author kilian felesmino
 * @version 05/12/2018
 */

public class Image extends JPanel
{   
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private ImageRoom roomImage;

    /**
     * Constructeur d'objets de classe Image
     */
    public Image (ImageRoom tata)
    {
        roomImage = tata;
        if (roomImage.getGif() == "null")
        {
           //setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
            
            Icon room = new ImageIcon(roomImage.getImage());
            
            
            
           add(new JButton(room));
            
           
        }
        
        else
        {
    
            //setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
            
            Icon room = new ImageIcon(roomImage.getImage());
            Icon gif = new ImageIcon(roomImage.getGif());
            
            add(new JButton(gif));
            add(new JButton(room));
            
            
        }

        
    }
}
