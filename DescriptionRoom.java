import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import java.text.*;

/**
 * this class will allow a display of information such as the name of the player, the current room ...
 *
 * @author Marie Bogusz
 * @version 15/12/18
 */
public class DescriptionRoom extends JPanel
{
    private JPanel myPanel;
    private JLabel myLabel1;
    private Game myGame;
     
    
    public DescriptionRoom(TheWindows win){
        myGame = win.getGame();
        
        setLayout(new GridLayout());

        myLabel1 = new JLabel(myGame.getPlayer().getRoom().getDescription());

        //Add the Label in myPanel
        JPanel labelPane = new JPanel(new GridLayout(0,1));
        labelPane.add(myLabel1);
        
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(labelPane, BorderLayout.CENTER);
        
    }
}
