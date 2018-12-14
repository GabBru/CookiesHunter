import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

/**
 * The class Action 
 *
 * @author Antoine P & Martin P & Amandine P
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

    // ----- ATTRIBUTS GAME -----
    private Game myGame;
    private TheWindows win;
    
    /**
     * Action class object builder
     */
    public ActionPanel(TheWindows myWindows)
    {
        // initialisation variables       
        win = myWindows;
        myGame = win.getGame();
        
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
        north.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                win.getGame().getPlayer().move("North");
                win.refresh();
            }
        }
        );
        
        south = new JButton(southIcon);
        south.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                win.getGame().getPlayer().move("South");
                win.refresh();
            }
        }
        );
        
        east = new JButton(eastIcon);
        east.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                win.getGame().getPlayer().move("East");
                win.refresh();
            }
        }
        );
        
        west = new JButton(westIcon);
        west.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                win.getGame().getPlayer().move("West");
                win.refresh();
            }
        }
        );
        
        down = new JButton(downIcon);
        down.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                win.getGame().getPlayer().move("Down");
                win.refresh();
            }
        }
        );
        
        up = new JButton(upIcon);
        up.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                win.getGame().getPlayer().move("up");
                win.refresh();
            }
        }
        );
        
        search = new JButton(searchIcon);        
        attack = new JButton(attackIcon);
        attack.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                for(Enemy i : theGame.getListEnemy()){
                    if(i.getEnemyRoom() == theGame.getPlayer().getRoom()){
                        theGame.getPlayer().fight(i.getLevel(),theGame.getPlayer().getLevel());
                    }
                }
        }
       }
        );
        
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
