import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.LayoutManager.*;
import javax.swing.JPanel.*;

/**
 * this class will allow a display of information such as the name of the player, the current room ...
 *
 * @author Diama FALL
 * @version 11/12/18
 */
public class Info extends JPanel
{
    JPanel myPanel;
    JFrame myFrame;
    JLabel myLabel1;
    JLabel myLabel2;
    JLabel myLabel3;
    Player dCharacter;
    public Info(Player b){
     dCharacter = b;
    //create Panel level
     JPanel myPanel = new JPanel();
    // //Initialisation de GrilLayout(ligne, colonne)
     myPanel.setLayout(new GridLayout(1,3));
    
    // Create Label Name
     JLabel myLabel1 = new JLabel();
    myLabel1 = new JLabel("Name"+dCharacter.getName());
    
    
    //createLabel Level
   JLabel myLabel2 = new JLabel("Level"+dCharacter.getLevel());
    
    //create Label CurrentRoom
    JLabel myLabel3 = new JLabel("CurrentRoom"+dCharacter.getRoom());
    
    //Add the Label in myPanel
    
    myPanel.add(myLabel1);
    myPanel.add(myLabel2);
    myPanel.add(myLabel3);
    
    // Add panels in Frame
    JFrame myFrame = new JFrame("The Window");
    myFrame.add(myPanel,BorderLayout.WEST);
    
    
    
    }

    
    
}
