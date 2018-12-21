import java.awt.*;
import javax.swing.*;
import java.text.*;

/**
 * This class allow to display the desciption of the current room.
 * The description attribute can contain information about the current room, the characters dialog ...
 *
 * @author Marie Bogusz
 * @version v0.2 2018dec
 */
public class DescriptionRoom extends JPanel
{
    // ----- ATTRIBUTS OF THE INTERFACE -----
    //Variable of labels
    private JPanel myPanel;
    private JLabel myLabel1;
    
    // ----- ATTRIBUT GAME -----
    private Game myGame;  
    /**
     * DescriptionRoom() is the constructor of class DescriptionRoom
     * It allows you to create a Panel that contains text. 
     * This text describes the current room and other things.
     * This constructor will be called in our TheWindows Frame.
     */
    public DescriptionRoom(TheWindows win){
            //Game recovery
        myGame = win.getGame(); 
            //Adding the description of current room in the Label
        myLabel1 = new JLabel(myGame.getPlayer().getRoom().getDescription());
            //Add the Label in myPanel
        JPanel labelPane = new JPanel(new GridLayout(0,1));
        labelPane.add(myLabel1);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(labelPane, BorderLayout.CENTER);        
    }
}
