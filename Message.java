import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * This class is the class which contains the graphical representation
 * of the messages and the entry field.
 *
 * @author Gp3 Amandine POULLOT
 * @version 21/11/2018
 */
public class Message extends JPanel
{
    // déclarations variables
    JPanel JPanelTxt, JPanelGet;
    JLabel myLabel;
    Player thisPlayer;
    Message message;

    public Message(Player nn)
    { 
        thisPlayer=nn;
        //Creation of the objects (Buttons)
        JPanelTxt = new JPanel();
        JPanelGet = new JPanel();
        setLayout(new BorderLayout());
        JPanelTxt.setLayout(new GridLayout(1,1));
        JPanelGet.setLayout(new FlowLayout());
        //monLabel = new JLabel("ah que coucou", JLabel.CENTER);
        myLabel = new JLabel(thisPlayer.getRoom(), JLabel.CENTER);
        
        JTextField textField = new JTextField();
        textField.setColumns(10);
        
        // add in the panel
       JPanelTxt.add(yLabel);
       JPanelGet.add(textField);
       
        //Add object to the Frame
        add(JPanelTxt, BorderLayout.NORTH);
        add(JPanelGet, BorderLayout.SOUTH);
       
        
        //Display elements
        JPanelTxt.setVisible(true);
        JPanelGet.setVisible(true);
        setVisible(true); 
    }
}

