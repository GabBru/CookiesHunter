import java.awt.*;
import javax.swing.*;
/**
 * Class Inventory.
 * This class is a part of the graphical interface.
 * --> Display the player's inventory on a panel (Texte).
 *
 * @author Gabriel Brunet
 * @version v0.2 dec2018
 */    
public class Inventory extends JPanel
{
    private JPanel myUpPanel, myDownPanel;
    private JLabel myLabelTitle;
    private JLabel myLabelInvent;
    private Game myGame;
    private Player myPlayer;
    
    public Inventory (TheWindows win)
    {        
        myGame = win.getGame();
        myPlayer = myGame.getPlayer();
        // setPreferredSize(new Dimension(500,800));
        myUpPanel = new JPanel();
        myDownPanel = new JPanel();
        myDownPanel.setSize(getWidth(),getHeight());
        
        setLayout(new GridLayout(2,1));
        
        Icon inventScreen = new ImageIcon("images/Bandeau_inventory.png");
        myLabelTitle = new JLabel();
        myLabelTitle.setIcon(inventScreen);
        myLabelInvent = new JLabel(myPlayer.returnInventory());
        myLabelInvent.setPreferredSize(new Dimension(100,200));
        
        // Add to the panel 
        myUpPanel.add(myLabelTitle);
        myDownPanel.add(myLabelInvent);
        add(myUpPanel);
        add(myDownPanel);
        
        // Display elements 
        myUpPanel.setVisible(true);
        myDownPanel.setVisible(true);
        setVisible(true);
    }
}
