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
    // Creation of the  button to move in front of(north), at east, at west,
    // behide(south),to north stairs (up) or to south stairs (down)
    private JButton north, south, east, west, down, up, search, attack;
    // creation of icons variables
    private Icon northIcon, southIcon, eastIcon, westIcon, downIcon,
    upIcon, searchIcon, attackIcon;
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
        Icon northIcon = new ImageIcon("arrows/north-arrow.png");
        Icon southIcon = new ImageIcon("arrows/south-arrow.png");
        Icon eastIcon = new ImageIcon("arrows/east-arrow.png");
        Icon westIcon = new ImageIcon("arrows/west-arrow.png");
        Icon downIcon = new ImageIcon("arrows/down-arrow.png");
        Icon upIcon = new ImageIcon("arrows/up-arrow.png");
        Icon searchIcon = new ImageIcon("arrows/magnifier.png");
        Icon attackIcon = new ImageIcon("arrows/spoon.png");
        // Button creation
        north = new JButton(northIcon);
        south = new JButton(southIcon);
        east = new JButton(eastIcon);
        west = new JButton(westIcon);
        down = new JButton(downIcon);
        up = new JButton(upIcon);
        search = new JButton(searchIcon);
        attack = new JButton(attackIcon);
        
        // Label creation for the gridLayout
        myLabel1 = new JLabel("");
        myLabel2 = new JLabel("");
        // Add the object in the panel
        add(myLabel1);
        add(north);
        add(up);
        
        add(west);
        add(search);
        add(east);
        
        add(down);
        add(south);
        add(myLabel2);
        
        setVisible(true);
    }

}
