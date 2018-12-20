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
import java.lang.String;
/**
 * Class The window orgenized the different panels : Info, Message, Menu, ActionPanel,Image and Image Room.
 * Creation of a pTop panel that contains the Image and Inventory panels that will be organized in BorderLayout.
 * Creation of a pBottom panel that contains the Message, DirectionInfo panels that will be organized in BorderLayout.
 * Creation of the DirectionInfo panel that contains the ActionPanel and the Info, will be organized in BorderLayout.
 * 
 * @author Antoine P. & Martin P.
 * @version 05/12/2018
 */
public class TheWindows extends JFrame
{
    private ImageRoom test;
    private Game myGame;
    private JPanel pTop, pBottom, pDirectionInfo, pDead;
    
     /**
     * Image class object builder
     */
    public TheWindows () //
    {
        // Organization of the Frame
        myGame = new Game();
        this.setTitle("Cookies Hunter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1120,960));
        this.setResizable(true);
        this.setLayout(new BorderLayout());
        
        playerLive();
        
        this.pack();
        this.setVisible(true);
    }
    
    public void playerDead(){
        this.removeAll();
        pDead = new JPanel();
        pDead.add(new Image(new ImageRoom("images/gameOver.gif",new Room("gameOver"," "))));
        this.add(pDead);
    }
    
    public void playerLive(){
        // --- TOP PANEL ---
        pTop = new JPanel();
        pTop.setLayout(new BorderLayout());
        pTop.setBorder(BorderFactory.createMatteBorder(2,0,8,0,Color.blue));
        pTop.add(new Image(myGame.getImgCurrentRoom()), BorderLayout.CENTER);
        this.add(pTop); //Image
        
        // --- BOTTOM PANEL ---
        pBottom = new JPanel();
        pBottom.setLayout(new BorderLayout());
        pBottom.setBorder(BorderFactory.createEmptyBorder(5,15,5,15));
        
        // *** DIRECTION INFO PANEL ***
        pDirectionInfo = new JPanel();
        pDirectionInfo.setLayout(new BorderLayout());
        pDirectionInfo.add(new ActionPanel(this));
        pDirectionInfo.add(new Info(this), BorderLayout.SOUTH);
        // ****************************
        
        pBottom.add(new Message(this), BorderLayout.WEST);
        pBottom.add(new Inventory(this), BorderLayout.CENTER);        
        //pBottom.add(new DescriptionRoom(this));
        pBottom.add(pDirectionInfo, BorderLayout.EAST);
        
        // --- ADD PANEL IN THE FRAME ---
        this.add(new Menu(this));
        this.add(pTop, BorderLayout.NORTH);
        this.add(pBottom, BorderLayout.SOUTH);  
    }
    
    public Game getGame(){
        return myGame;
    }
    
    /**
     * Method which refresh the Frame
     */
    public void refresh(){
        // remove all Panels
        pBottom.removeAll();
        pTop.removeAll();
        pDirectionInfo.removeAll();
        
        // Add the new Panels
        pTop.add(new Image(myGame.getImgCurrentRoom()), BorderLayout.CENTER);
        pDirectionInfo.add(new ActionPanel(this));
        pDirectionInfo.add(new Info(this), BorderLayout.SOUTH);
        pBottom.add(new Message(this));
        
        //pBottom.add(new DescriptionRoom(this));
        pBottom.add(new Message(this), BorderLayout.WEST);
        pBottom.add(pDirectionInfo, BorderLayout.EAST);
        pBottom.add(new Inventory(this), BorderLayout.CENTER);
        
        this.add(pTop, BorderLayout.NORTH);
        this.add(pBottom, BorderLayout.SOUTH);
        
        // Validate the frame
        this.revalidate();
        this.repaint();
    }  
}
