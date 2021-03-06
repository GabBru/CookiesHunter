import java.awt.*;
import javax.swing.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.text.*;
/**
 * This class will allow to display information such as the name of the player, the level of the player and the current room where the player is located.
 *
 * @author Diama FALL
 * @version v0.2 2018dec
 */
public class Info extends JPanel
{
    private JPanel myPanel;
    private JLabel myLabel1, myLabel2, myLabel3;
    private Game myGame;
    private Player dCharacter; 
    
    public Info(TheWindows win){
        myGame = win.getGame();
        // create Label PlayerName
        myLabel1 = new JLabel("Name : "+ myGame.getPlayer().getName());
        // createLabel Level
        myLabel2 = new JLabel("Level : "+myGame.getPlayer().getLevel());
        // create Label CurrentRoom
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
