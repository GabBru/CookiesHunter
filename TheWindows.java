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
 * Class The window orgenized the different panels : Info, Message, 
 * Menu, ActionPanel,Image and Image Room
 * 
 * @author Antoine P. & Martin P.
 * @version 05/12/2018
 */

public class TheWindows extends JFrame
{
    private ImageRoom test;
    private Game myGame;
    private JFrame myFrame;
    // creation of a pTop panel that contains the Image and Inventory panels
    //that will be organized in BorderLayout.
    private JPanel pTop, pBottom;
    
     /**
     * Image class object builder
     */
    public TheWindows () //
    {
        myGame = new Game();
        myFrame = new JFrame("Hunter Cookies");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //myFrame.setSize(1600,900);
        myFrame.setResizable(true);
        myFrame.setLayout(new GridLayout(2,1));
        
        pTop = new Image(myGame.getImgCurrentRoom());
        pBottom = new Info(this);        
        myFrame.add(pTop);
        myFrame.add(new Inventory(this));
        myFrame.add(pBottom);
        myFrame.add(new ActionPanel(this));
        myFrame.add(new JLabel(""));
        
               
        myFrame.pack();
        myFrame.setVisible(true);
    }
    
    public Game getGame(){
        return myGame;
    }
    
    /*
     * Method who refresh the Frame
     */
    public void refresh(){
        pBottom.removeAll();
        pTop.removeAll();
        pBottom.add(new Info(this));
        pTop.add(new Image(myGame.getImgCurrentRoom()));        
        myFrame.revalidate();
        myFrame.repaint();
    }  
}
