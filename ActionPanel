import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * The class Action 
 *
 * @author Antoine P & Martin P
 * @version 1
 */
public class ActionPanel extends JPanel 
{
    // variables
    
    // ----- ATTRIBUTS OF THE INTERFACE -----
    // Creation of the  button to move in front of(up), at right, at left,
    // behide(down),to up stairs (northEast) or to down stairs (southWest)
    private JButton up, down, right, left, southWest, northEast, search, attack;
    // creation of icons variables
    private Icon upIcon, downIcon, rightIcon, leftIcon, southWestIcon, northEastIcon;
    //Variable of labels
    private JLabel myLabel1, myLabel2;
    private JPanel myPanel;
    
    // ----- ATTRIBUTS PLAYER -----
    private Player player1;
    
    /**
     * Action class object builder
     */
    public ActionPanel(Player currentPlayer)
    {
        // initialisation variables
        player1 = currentPlayer;
        
        setLayout(new GridLayout(3,3));
        
        // add of the pictures
        Icon upIcon = new ImageIcon("arrows/up-arrow.png");
        Icon downIcon = new ImageIcon("arrows/down-arrow.png");
        Icon rightIcon = new ImageIcon("arrows/right-arrow.png");
        Icon leftIcon = new ImageIcon("arrows/left-arrow.png");
        Icon southWestIcon = new ImageIcon("arrows/southWest-arrow.png");
        Icon northEastIcon = new ImageIcon("arrows/northEast-arrow.png");
        // Button creation
        up = new JButton(upIcon);
        down = new JButton(downIcon);
        right = new JButton(rightIcon);
        left = new JButton(leftIcon);
        southWest = new JButton(southWestIcon);
        northEast = new JButton(northEastIcon);
        
        search = new JButton("Search");
        attack = new JButton("Attack");
        
        // Label creation for the gridLayout
        myLabel1 = new JLabel("");
        myLabel2 = new JLabel("");
        // Add the object in the panel
        add(myLabel1);
        add(up);
        add(northEast);
        
        add(left);
        add(search);
        add(right);
        
        add(southWest);
        add(down);
        add(myLabel2);
        
        setVisible(true);
    }

}
