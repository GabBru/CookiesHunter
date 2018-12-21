import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class Menu here.
 *
 * @author Thibaud G & Diama.
 * @version 12/12/2018
 */
public class Menu extends JPanel
{
    private JMenu fileMenu ;
    private JMenuItem helpItem, newGameItem, exitItem;
    private JLabel myLabel;
    private JPanel myPanel;
    private TheWindows win;
    private Game myGame;
    
    public Menu (TheWindows myWindows)
    {
        win = myWindows;
        JMenuBar menuBar = new JMenuBar();        
        
        win.setJMenuBar(menuBar);
        
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        
        helpItem = new JMenuItem("Help");
        helpItem.setMnemonic(KeyEvent.VK_H);
        helpItem.addActionListener(new ActionListener()

            {
                public void actionPerformed(ActionEvent click)
                {
                    String str;
                    JDialog helpDialog = new JDialog((Frame)null,"Help",true);
                    
                    str = "<html>What is the goal ?<br>";
                    str = str + "The goal of the game is to find the magic cockie. The magic cockie is owned by a naughty baby.<br><br>";
                    str = str + "How to enter in a room closed by a password?<br>";
                    str = str + "- Enter the password (The password must start with a capital letter)<br>- Go in the room<br><br>";
                    str = str + "How to enter in a room closed by a key?<br>";
                    str = str + "- Find a key<br>- Go in the room<br><br>";                    
                    str = str + "Description of your Items:<br>";
                    for( Item i : win.getGame().getPlayer().returnInventoryPlayer()){                       
                        str = str + "- " + i.getName() +" : "+ i.getDescription() + "<br>";
                    }
                    str = str + "<br>";
                    
                    myLabel = new JLabel(str);
                    
                    JTextArea textHelp = new JTextArea(5,20);
                    
                    helpDialog.add(myLabel);
        
                    helpDialog.setSize(800,500);
                    helpDialog.setResizable(true);
                    helpDialog.setVisible(true);
                }
            }
        );
        
        newGameItem = new JMenuItem ("New Game");
        newGameItem.setMnemonic(KeyEvent.VK_N);
        newGameItem.addActionListener(new ActionListener()

            {
                public void actionPerformed(ActionEvent click)
                {
                    win.newGame();
                }
            }
        );
        
        exitItem = new JMenuItem ("Exit");
        exitItem.setMnemonic(KeyEvent.VK_E);
        exitItem.addActionListener(new ActionListener()

            {
                public void actionPerformed(ActionEvent click)
                {
                    System.exit(0);    
                }
            }
        );

        
         menuBar.add(fileMenu);
        fileMenu.add(helpItem);
        fileMenu.addSeparator();
        fileMenu.add(newGameItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        
        setVisible(true);
    }}
