import java.awt.*;
import javax.swing.*; //swing.ImageIcon;
/**
 * Class Inventory.
 * This class is a part of the graphical interface.
 * --> Display the player's inventory on a panel (Texte + Image).
 *
 * @author Gabriel Brunet
 * @version v0.2 dec2018
 */    
public class Inventory extends JPanel
{
    private JPanel myUpPanel, myDownPanel;
    private JLabel myLabelTitle;
    private JTextField myTextFieldInvent;
    private Game myGame;
    private Player myPlayer;
    
    public Inventory (TheWindows win)
    {        
        myGame = win.getGame();
        myPlayer = myGame.getPlayer();
        
        myUpPanel = new JPanel();
        myDownPanel = new JPanel();
        myDownPanel.setSize(getWidth(),getHeight());
        
        setLayout(new GridLayout(2,1));
        
        Icon inventScreen = new ImageIcon("Bandeau_inventory.png");
        myLabelTitle = new JLabel();
        myLabelTitle.setIcon(inventScreen);
        myTextFieldInvent = new JTextField(myPlayer.returnInventory());
        myTextFieldInvent.setPreferredSize(new Dimension(myDownPanel.getWidth(),myDownPanel.getHeight()));
        
        // Add to the panel 
        myUpPanel.add(myLabelTitle);
        myDownPanel.add(myTextFieldInvent);
        add(myUpPanel);
        add(myDownPanel);
        
        // Display elements 
        myUpPanel.setVisible(true);
        myDownPanel.setVisible(true);
        setVisible(true);
    }
}
