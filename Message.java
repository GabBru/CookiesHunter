import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * This class is the class which contains the graphical representation
 * of the messages and the entry field.
 *
 * @author Gp3 Amandine POULLOT
 * @version 21/11/2018
 */
public class Message extends JPanel
{
    // variable declaration
    JPanel PanelTxt, PanelGet;
    JTextArea myTextArea;
    JTextField textField;
    //Player thisPlayer;
    private TheWindows myWindow;
    Message message;
    private JLabel myLabel1;
    private Game myGame;

    public Message(TheWindows win)
    { 
        myWindow = win;
        myGame = win.getGame();
        this.setBackground(new java.awt.Color(98, 5, 5));
        //Creation of the objects (Text)
        PanelTxt = new JPanel();
        PanelGet = new JPanel();
        setLayout(new BorderLayout());
        PanelTxt.setLayout(new GridLayout());
        PanelTxt.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.black));
        PanelGet.setLayout(new BorderLayout());
        myLabel1 = new JLabel(myGame.getPlayer().getRoom().getDescription());
        Panel labelPane = new Panel(new GridLayout(0,1));

        TextField textField = new TextField("Perhaps you get a cookie if click here ?");
        textField.setForeground(Color.GRAY);
        
        //Description's size and text getter's size
        textField.setColumns(60);
        PanelTxt.setPreferredSize(new Dimension(460,200));
        
        // add in the panel
        PanelTxt.add(myLabel1);
        PanelGet.add(textField, BorderLayout.WEST);
       
        //Add object to the Frame
        add(PanelTxt, BorderLayout.NORTH);
        add(PanelGet, BorderLayout.SOUTH);
        
        //Action listener and focus listener (meaning if you're currently focusing on the writing area or not)
        textField.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent evt) {
                    String text = textField.getText();
                    myWindow.getGame().setAnswer(text);
                    textField.setText("");
                }
            }
        );
        
        textField.addFocusListener(new FocusListener() 
            {
                @Override
                public void focusGained(FocusEvent e) {
                    if (textField.getText().equals("Perhaps you get a cookie if click here ?")) {
                        textField.setText("");
                        textField.setForeground(Color.BLACK);
                    }
                }
                @Override
                public void focusLost(FocusEvent e) {
                    if (textField.getText().isEmpty()) {
                        textField.setForeground(Color.GRAY);
                        textField.setText("Perhaps you get a cookie if click here ?");
                    }
                }
            }
        );
        
        //Display elements
        PanelTxt.setVisible(true);
        //if (myGame.getPlayer().getRoom().getNameRoom() == "hall" || myGame.getPlayer().getRoom().getNameRoom() == "laundryRoom" ){
            PanelGet.setVisible(true);
        //}
        //else {PanelGet.setVisible(false);}
        setVisible(true);

        
    }
    
}
