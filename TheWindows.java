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
    // creation of a pTop panel that contains the Image and Inventory panels
    //that will be organized in BorderLayout.
    private JPanel pTop, pBottom;
    
     /**
     * Image class object builder
     */
    public TheWindows () //
    {
                
        myGame = new Game();
        JFrame myFrame = new JFrame("Hunter Cookies");
        
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //myFrame.setSize(1600,900);
        myFrame.setResizable(true);
        myFrame.setLayout(new GridLayout(2,1));
                
        myFrame.add(new Image(myGame.getImgCurrentRoom()));
        myFrame.add(new JLabel(""));
        myFrame.add(new ActionPanel(this));
        myFrame.add(new Info(this));
        
        myFrame.pack();
        myFrame.setVisible(true);
    }
    
    public Game getGame(){
        return myGame;
    }
}
