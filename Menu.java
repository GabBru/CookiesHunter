import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class Menu here.
 *
 * @author Thibaud G.
 * @version 12/12/2018
 */
public class Menu extends JPanel
{
    JMenu fileMenu, helpMenu, newGameMenu, exitMenu;
    public Menu ()
    {
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);
        newGameMenu = new JMenu ("New Game");
        newGameMenu.setMnemonic(KeyEvent.VK_N);
        exitMenu = new JMenu ("Exit");
        exitMenu.setMnemonic(KeyEvent.VK_E);
        
        menuBar.add(fileMenu);
        fileMenu.add(helpMenu);
        fileMenu.addSeparator();
        fileMenu.add(newGameMenu);
        fileMenu.addSeparator();
        fileMenu.add(exitMenu);
        
    }}
