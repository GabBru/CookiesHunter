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
 * @author Diama FALL
 * @version 11/12/18
 */
public class Info extends JPanel
{
    JPanel myPanel;
    JLabel myLabel1, myLabel2, myLabel3;
    private Game myGame;
    Player dCharacter; 
        
    public Info(TheWindows win){
        myGame = win.getGame();
        
        // set the different Labels
        myLabel1 = new JLabel("Name : "+ myGame.getPlayer().getName());

        //createLabel Level
        myLabel2 = new JLabel("Level : "+myGame.getPlayer().getLevel());

        //create Label CurrentRoom
        myLabel3 = new JLabel("Current room : " + myGame.getPlayer().getRoom().getNameRoom());

        //Add the Label in myPanel
        JPanel labelPane = new JPanel(new GridLayout(0,1));
        labelPane.add(myLabel1);
        labelPane.add(myLabel2);
        labelPane.add(myLabel3);
        
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(labelPane, BorderLayout.CENTER);
    }
}
