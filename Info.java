import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

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
    Game theGame;
    Player dCharacter;
    
    public Info(Game monGame){
        theGame = monGame;
        setLayout(new GridLayout(1,3));

        // set the different Labels
        myLabel1 = new JLabel("Name : "+ monGame.getPlayer().getName());

        //createLabel Level
        myLabel2 = new JLabel("Level "+monGame.getPlayer().getLevel());

        //create Label CurrentRoom
        myLabel3 = new JLabel("Current room : " + monGame.getPlayer().getRoom());

        //Add the Label in myPanel
        add(myLabel1);
        add(myLabel2);
        add(myLabel3);
        
        // set visible the panel "info"
        setVisible(true);
    }
}
