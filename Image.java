import java.awt.*;
import javax.swing.*;
/**
 * The Image class allows you to manage images and Gifs that will be displayed during the game.
 * There is always one image of a room to display during the game. 
 * There is not always a Gif to display during the game.
 *
 * @author kilian felesmino & Marie Bogusz
 * @version 11/12/2018
 */

public class Image extends JPanel
{   
    private ImageRoom roomImage; // The roomImage variable includes the name of the image corresponding to the room.
    private JLabel myLabel1, myLabel2;
    /**
     * Image class constructor.
     * If there is no GIF, we simply want to display the image of the room.
     * If there is Gif, we want to display the Gif next to the image of the room.
     */
    public Image (ImageRoom img)
    {
        roomImage = img;
        if (roomImage.getGif() == "null")
        {
           //setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
           //Icon room = new ImageIcon(roomImage.getImage());
           //add(new JButton(room));
           
           Icon inventScreen = new ImageIcon(roomImage.getImage());
           myLabel1 = new JLabel();
           myLabel1.setIcon(inventScreen);
           add(myLabel1);
        }        
        else
        {
           setLayout(new GridLayout(1,2));
           
           myLabel1 = new JLabel();
           myLabel2 = new JLabel();
           myLabel1.setIcon(new ImageIcon(roomImage.getImage()));
           
           myLabel2.setIcon(new ImageIcon(roomImage.getGif()));
           add(myLabel1); 
           add(myLabel2);                     
        }       
    }
}
