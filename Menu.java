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
                    JDialog helpDialog = new JDialog((Frame)null,"attention",true);
                    /**
                     * Texte help  faire
                     */    
                    JTextArea textHelp = new JTextArea(5,20);

                    helpDialog.setSize(250,150);
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
                    /**
                    * je regarde pour essayer de la faire mais la methode que j'ai fait une nouvelle fenetre
                    */
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
