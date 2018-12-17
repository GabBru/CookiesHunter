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
    // variable declaration
    JPanel JPanelTxt, JPanelGet;
    JTextArea myTextArea;
    JTextField textField;
    //Player thisPlayer;
    private TheWindows myWindow;
    Message message;

    public Message(TheWindows win)
    { 
        myWindow = win;
        //Creation of the objects (Text)
        JPanelTxt = new JPanel();
        JPanelGet = new JPanel();
        setLayout(new BorderLayout());
        JPanelTxt.setLayout(new GridLayout(1,1));
        JPanelGet.setLayout(new FlowLayout());
        //monLabel = new JLabel("ah que coucou", JLabel.CENTER);
        myTextArea = new JTextArea(myWindow.getGame().getPlayer().getRoom().getDescription());
        
        JTextField textField = new JTextField();
        textField.setColumns(30);
        
        // add in the panel
        JPanelTxt.add(myTextArea);
        JPanelGet.add(textField);
       
        //Add object to the Frame
        add(JPanelTxt, BorderLayout.NORTH);
        add(JPanelGet, BorderLayout.SOUTH);
       
        
        //Display elements
        JPanelTxt.setVisible(true);
        JPanelGet.setVisible(true);
        setVisible(true); 
    }
    
    /**
     * method for a performed action
     */
    public String actionPerformed(ActionEvent evt) {
        String text = textField.getText();
        return text;
    }
}

