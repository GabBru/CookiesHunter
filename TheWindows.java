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
 * Class The window orgenized the different panels : Info, Message, Menu, ActionPanel,Image and ImageRoom.
 * Creation of a pTop panel that contains the Image and Inventory panels
 * Creation of a pBottom panel that contains the Message, DirectionInfo panels
 * Creation of the DirectionInfo panel that contains the ActionPanel and the Info
 * 
 * @author Antoine P. & Martin P.
 * @version 05/12/2018
 */
public class TheWindows extends JFrame
{
    // --- ATTRIBUTS OF THE GAME ---
    private ImageRoom test;
    private Game myGame;
    private JPanel pDirectionInfo, pDead;

    // --- ATTRIBUTS OBJECTS CLASS ---
    //private JButton buttonPlay = new JButton(" PLAY ");
    //private Icon iconStart;

    // --- ATTRIBUTS First Frame ---
    private JPanel pTop = new JPanel();
    private JPanel pBottom = new JPanel();
    private JButton buttonPlay = new JButton(" PLAY ");
    private Icon iconStart = new ImageIcon("images/CookiesHunter_log.jpeg");
    private Icon iconTitle = new ImageIcon("images/titre.jpg");
    private JLabel myLabel = new JLabel();
    private JLabel myTitle = new JLabel();
    private JFrame frame = new JFrame("Cookies Hunter");
    
     /**
     * TheWindows class object builder
     * Defined the name of windows "Cookies Hunter"
     * The preferences of the displaying
     * Call the method playerLive()
     */
    public TheWindows () //
    {
        // Param of the Frame
        myGame = new Game();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setPreferredSize(new Dimension(1147,779));
        this.setResizable(true);
        this.setLayout(new BorderLayout());
        this.setBackground(new java.awt.Color(98, 5, 5));
        
        // Denined the parthern of the first frame
        pTop.setLayout(new BorderLayout());
        pBottom.setLayout(new BorderLayout());
        // Add the objects in panels & add the panels in the frame
        myTitle.setIcon(iconTitle);
        myLabel.setIcon(iconStart);

        pTop.add(myTitle, BorderLayout.NORTH);
        pTop.add(myLabel, BorderLayout.CENTER,JLabel.CENTER);
        pBottom.add(buttonPlay, BorderLayout.SOUTH);
        buttonPlay.addActionListener(new ActionListener()
            {
                /**
                 * Display the interface of the game when you click on the button
                 */
                public void actionPerformed(ActionEvent e)
                {
                    pBottom.removeAll();
                    pTop.removeAll();
                    revalidate();
                    repaint();
                    // Calling the frame when the player live
                    playerLive();
                }
            }
        );
        
        // Display when the button is not clicked 
        add(pTop, BorderLayout.NORTH);
        add(pBottom, BorderLayout.SOUTH);

        // add the visibility in the frame
        pTop.setVisible(true);
        pBottom.setVisible(true);
        this.pack();
        this.setVisible(true);
    }
    
    
    /**
     * Parthern of the game frame
     * Class TheWindow orgenized the different panels : Info, Message, Menu, ActionPanel,Image and ImageRoom.
     * Creation of a pTop panel that contains the Image and Inventory panels that will be organized in BorderLayout.
     * Creation of a pBottom panel that contains the Message, DirectionInfo panels that will be organized in BorderLayout.
     * Creation of the DirectionInfo panel that contains the ActionPanel and the Info, will be organized in BorderLayout.
     */
    public void playerLive(){
        this.setSize(new Dimension(1147,779));
        // --- TOP PANEL ---
        pTop = new JPanel();        
        pTop.setLayout(new BorderLayout());
        pTop.setBorder(BorderFactory.createMatteBorder(2,0,8,0,new java.awt.Color(98, 5, 5)));
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
        pBottom.add(pDirectionInfo, BorderLayout.EAST);
        pBottom.setBackground(new java.awt.Color(98, 5, 5));

        // --- ADD PANEL IN THE FRAME ---
        this.add(new Menu(this));
        this.add(pTop, BorderLayout.NORTH);
        this.add(pBottom, BorderLayout.SOUTH);
    }
    
    /**
     * @return the game
     */
    public Game getGame(){
        return myGame;
    }
    
    /**
     * Method who refresh the Frame
     * If the player is lived the frame of the game is displaying
     * Else the frame gameOver is displaying
     */
    public void refresh(){
        if (myGame.getPlayer().getWin()){
            refreshInLive();
            if(myGame.getEnemy().getName() == "Baby" && myGame.getEnemy().getIsDead()){
                victory();
            }
        } else {gameOver();}
    }
    
    /**
     * Frame victory display when the player win the game
     */
    public void victory(){
        this.setSize(new Dimension(500,400));
        //remove all Panels
        pBottom.removeAll();
        pTop.removeAll();
        pDirectionInfo.removeAll();
        
        //Creation game over object & add in the frame
        JLabel myLabel = new JLabel();
        Icon iconGameOver = new ImageIcon("images/cookie1.gif");
        myLabel.setIcon(iconGameOver);
        this.add(myLabel);
        
        // Validate the frame
        this.revalidate();
        this.repaint();
    }
    
    /**
     * Frame victory display when the player win the game
     */
    public void newGame(){
        this.setSize(new Dimension(10,10));
        //remove all Panels
        pBottom.removeAll();
        pTop.removeAll();
        pDirectionInfo.removeAll();
        
        //Creation new game
        new TheWindows();
        
        // Validate the frame
        this.revalidate();
        this.repaint();
    }
    
    /**
     * Refresh when the player is not dead
     */
    public void refreshInLive(){
        // remove all Panels
        pBottom.removeAll();
        pTop.removeAll();
        pDirectionInfo.removeAll();

        // Add the new Panels
        // --- TOP PANEL ---
        pTop.setBorder(BorderFactory.createMatteBorder(2,0,8,0,new java.awt.Color(98, 5, 5)));
        pTop.add(new Image(myGame.getImgCurrentRoom()), BorderLayout.CENTER);
        
        // --- DIRECTION & INFO PANEL ---
        pDirectionInfo.add(new ActionPanel(this));
        pDirectionInfo.add(new Info(this), BorderLayout.SOUTH);
        
        // --- BOTTOM PANEL ---
        pBottom.add(new Message(this), BorderLayout.WEST);
        pBottom.add(new Inventory(this), BorderLayout.CENTER);
        pBottom.add(pDirectionInfo, BorderLayout.EAST);
        pBottom.setBorder(BorderFactory.createEmptyBorder(5,15,5,15));
        pBottom.setBackground(new java.awt.Color(98, 5, 5));
        
        // Add the panel in the frame
        this.add(pTop, BorderLayout.NORTH);
        this.add(pBottom, BorderLayout.SOUTH);

        // Validate the frame
        this.revalidate();
        this.repaint();
    }

    /**
     * Frame of the Game over when the player is dead
     */
    public void gameOver(){
        this.setSize(new Dimension(390,186));
        // remove all Panels
        pBottom.removeAll();
        pTop.removeAll();
        pDirectionInfo.removeAll();

        // Creation game over object & add in the frame
        JLabel myLabel = new JLabel();
        Icon iconGameOver = new ImageIcon("images/gameOver.gif");
        myLabel.setIcon(iconGameOver);
        this.add(myLabel);
        
        // Validate the frame
        this.revalidate();
        this.repaint();
    }
}
