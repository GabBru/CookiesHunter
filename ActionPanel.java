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

/**
 * The class Action 
 *
 * @author Antoine P & Martin P & Amandine P
 * @version 1
 */
public class ActionPanel extends JPanel 
{
    // variables

    // ----- ATTRIBUTS OF THE INTERFACE -----
    // Creation of the  button to move in front of(north), at east, at west,
    // behide(south),to north stairs (up) or to south stairs (down)
    private JButton north, south, east, west, down, up, search, attack;
    // creation of icons variables
    private Icon northIcon, southIcon, eastIcon, westIcon, downIcon,
    upIcon, searchIcon, attackIcon;
    //Variable of labels
    private JLabel myLabel1, myLabel2;
    private JPanel myPanel;

    // ----- ATTRIBUTS GAME -----
    private Game myGame;
    private TheWindows win;
    private String nameR;
    private Room cRoom;
    
    private enum nameOfRoom{ 
        outside, hall, garage, livingRoom, daughterRoom, pantry, playRoom, kitchen, office, laundryRoom, attic;
    }

    /**
     * Action class object builder
     */
    public ActionPanel(TheWindows myWindows)
    {
        // initialisation variables       
        win = myWindows;
        myGame = win.getGame();
        nameR = myGame.getPlayer().getRoom().getNameRoom();
        cRoom = myGame.getPlayer().getRoom();
        
        setLayout(new GridLayout(3,3));

        // add of the pictures
        Icon northIcon = new ImageIcon("arrows/north-arrow.png");
        Icon southIcon = new ImageIcon("arrows/south-arrow.png");
        Icon eastIcon = new ImageIcon("arrows/east-arrow.png");
        Icon westIcon = new ImageIcon("arrows/west-arrow.png");
        Icon downIcon = new ImageIcon("arrows/down-arrow.png");
        Icon upIcon = new ImageIcon("arrows/up-arrow.png");
        Icon searchIcon = new ImageIcon("arrows/magnifier.png");
        Icon attackIcon = new ImageIcon("arrows/spoon.png");
        // Button creation
        north = new JButton(northIcon);
        north.addActionListener( new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    win.getGame().getPlayer().move("North");
                    nameR = cRoom.getNameRoom();
                    win.refresh();
                }
            }
        );

        south = new JButton(southIcon);
        south.addActionListener( new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    win.getGame().getPlayer().move("South");
                    nameR = myGame.getPlayer().getRoom().getNameRoom();
                    win.refresh();
                }
            }
        );

        east = new JButton(eastIcon);
        east.addActionListener( new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    win.getGame().getPlayer().move("East");
                    nameR = myGame.getPlayer().getRoom().getNameRoom();
                    win.refresh();
                }
            }
        );

        west = new JButton(westIcon);
        west.addActionListener( new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    win.getGame().getPlayer().move("West");
                    nameR = myGame.getPlayer().getRoom().getNameRoom();
                    win.refresh();
                }
            }
        );

        down = new JButton(downIcon);
        down.addActionListener( new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    win.getGame().getPlayer().move("Down");
                    nameR = myGame.getPlayer().getRoom().getNameRoom();
                    win.refresh();
                }
            }
        );

        up = new JButton(upIcon);
        up.addActionListener( new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(myGame.getEnemy() == null || myGame.getEnemy().getIsDead() == true){
                        win.getGame().getPlayer().move("Up");
                        nameR = cRoom.getNameRoom();
                        win.refresh();
                    }
                }
            }
        );

        search = new JButton(searchIcon); 
        search.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (cRoom.getItem() != null){   
                    if(nameR.equals("outside")){
                       myGame.getPlayer().addInventory(cRoom.getItem());
                       cRoom.removeItemRoom(cRoom.getItem());
                       cRoom.setDescription("<html>you approach the unicorn who begins to speak to you: I love this garden and I love the little girl of the house ! She farts glitters, like me !<br> You found a key on the floor");
                       myGame.getImgCurrentRoom().setGif("images/unicorn.gif");
                       win.refresh();
                       cRoom.setDescription("<html>You are in the garden.");
                   }
                   if(nameR.equals("pantry")){
                       if(cRoom.getItem() != null){
                           //if pas les 4 cookies
                            cRoom.setDescription("<html> Hey ! You are not a member of the family ! I am prisoner here because I am a good cook. If you defeat the family and bring me 4 cookies as proof, I could help you.");
                       //esle { suppri les cookies du player et lui donner du lait et suppr lait de la piece
                           //cRoom.setDescription("<html>Vous avez obtenue du lait");
                       //}
                       win.refresh();
                       cRoom.setDescription("<html>You are in the pantry. The cook looks at you, smiling.");
                    }
                   }
                   if(nameR.equals("daughterRoom")){
                       if(cRoom.getItem() != null){
                            cRoom.setDescription("<html>Well done ! You answered my riddle! To reward you, here is a key that allows you to go upstairs");
                            myGame.getPlayer().addInventory(cRoom.getItem());
                            cRoom.removeItemRoom(cRoom.getItem());
                            win.refresh();
                          cRoom.setDescription("<html>You are in the bedroom. The little girl is looking at you with a bad eye");
                        }
                   }
                   if(nameR.equals("livingRoom")){
                       if(cRoom.getItem() != null){
                           myGame.getPlayer().addInventory(cRoom.getItem());
                           cRoom.removeItemRoom(cRoom.getItem());
                           cRoom.setDescription("<html>You pick up the denture from the grandfather's mouth, it can still be used ...");
                           win.refresh();
                           cRoom.setDescription("<html>You are in the livingroom.");
                           //myGame.getImgCurrentRoom().setGif("null");
                    }
                   }
                   if(nameR.equals("garage")){
                       if(cRoom.getItem() != null){
                           myGame.getPlayer().addInventory(cRoom.getItem());
                           cRoom.removeItemRoom(cRoom.getItem());
                           cRoom.setDescription("<html>You found a cookie on the father's body.");
                           win.refresh();
                           cRoom.setDescription("<html>You are in the garage");
                        }
                   }
                   if(nameR.equals("playRoom")){
                       if(cRoom.getItem() != null){
                           myGame.getPlayer().addInventory(cRoom.getItem());
                           cRoom.removeItemRoom(cRoom.getItem());
                           cRoom.setDescription("<html>You found a cookie on the son's body");
                           win.refresh();
                           cRoom.setDescription("<html>You are in the playroom.");
                        }
                   }
                   if(nameR.equals("kitchen")){
                       if(cRoom.getItem() != null){
                           myGame.getPlayer().addInventory(cRoom.getItem());
                           cRoom.removeItemRoom(cRoom.getItem());
                           cRoom.setDescription("<html>You found a cookie on the mother's body");
                           win.refresh();
                           cRoom.setDescription("<html>You are in the kitchen.");
                        }
                   }
                   if(nameR.equals("office")){
                       if(cRoom.getItem() != null){
                           myGame.getPlayer().addInventory(cRoom.getItem());
                           cRoom.removeItemRoom(cRoom.getItem());
                           cRoom.setDescription("<html>You find a baby bottle. Weird.");
                           win.refresh();
                           cRoom.setDescription("<html>You are in the office. The door is still locked. The black hole is still there. You have to jump into it.");
                        }
                   }
                   if(nameR.equals("laundryRoom")){
                       // if the player gots the denture                          
                            cRoom.setDescription("<html>Oh thank you for the denture ! Now : answer my riddle or die!");
                       //esle { 
                           //cRoom.setDescription("<html>iezgnfiuHEFUNZH?CFOQJEFBL? HJEBGFLQK");
                       //}
                            myGame.getImgCurrentRoom().setGif("gannyScary.gif");
                       win.refresh();
                       cRoom.setDescription("<html>You are in the landry.");
                    }
                }
            }
        }
        );
        
        attack = new JButton(attackIcon);
        attack.addActionListener( new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                for(Enemy i : myGame.getListEnemy()){
                    if(i.getEnemyRoom() == myGame.getPlayer().getRoom()){
                        myGame.getPlayer().fight(i,myGame.getPlayer().getLevel());
                    }
                    if(i.getIsDead()){
                        if(nameR.equals("livingRoom")){
                            myGame.getImgCurrentRoom().setImage("images/livingroomMonster.jpg");
                            myGame.getImgCurrentRoom().setGif("images/grandfather.gif");
                            cRoom.setDescription("You killed the GrandPa"); // on peut ajouter un gif
                        }
                        if(nameR.equals("garage")){
                            myGame.getImgCurrentRoom().setImage("images/garageMonster.jpg");
                            cRoom.setDescription("You killed the father.");
                        }
                        if(nameR.equals("playRoom")){
                            myGame.getImgCurrentRoom().setImage("images/playroomMonster.jpg");
                            cRoom.setDescription("You killed the son.");
                        }
                        if(nameR.equals("kitchen")){
                            myGame.getImgCurrentRoom().setImage("images/kitchenMonster.jpg");
                            cRoom.setDescription("You killed the mother.");
                        }
                    }
                }
                win.refresh();
            }
        }
        );

        // Label creation for the gridLayout
        myLabel1 = new JLabel("");
        myLabel2 = new JLabel("");
        // Add the object in the panel
        add(myLabel1);
        add(north);
        add(up);

        add(west);
        if (nameR == "outside" || nameR == "hall" || nameR == "pantry" || nameR == "daughterRoom" || nameR == "office" || nameR == "laundryRoom"){
            add(search);
            System.out.println(nameR);
        } else if(myGame.getEnemy().getIsDead() == false){
            add(attack);
            }
            else add(search);
        add(east);

        add(down);
        add(south);
        add(myLabel2);
        
        // display the button in function of the currentRoom
        displayButton(win);
        setVisible(true);
    }

    /**
     * changes the possibility of clicking or not on a direction button
     */
    public void displayButton(TheWindows myWindow)
    {
        nameOfRoom nor = nameOfRoom.valueOf(myWindow.getGame().getPlayer().getRoom().getNameRoom());
        switch(nor)
        {
            case outside : 
                north.setEnabled(true);
                south.setEnabled(false);
                east.setEnabled(false);
                west.setEnabled(false);
                down.setEnabled(false);
                up.setEnabled(false);
                search.setEnabled(true);
                attack.setEnabled(false);
                break;
            case hall: 
                north.setEnabled(true);
                south.setEnabled(true);
                east.setEnabled(true);
                west.setEnabled(true);
                down.setEnabled(false);
                up.setEnabled(true);
                search.setEnabled(false);
                attack.setEnabled(false);
                break;
            case daughterRoom: 
                north.setEnabled(false);
                south.setEnabled(true);
                east.setEnabled(false);
                west.setEnabled(false);
                down.setEnabled(false);
                up.setEnabled(false);
                search.setEnabled(true);
                attack.setEnabled(false);
                break;
            case garage: 
                north.setEnabled(false);
                south.setEnabled(false);
                east.setEnabled(true);
                west.setEnabled(true);
                down.setEnabled(false);
                up.setEnabled(false);
                search.setEnabled(true);
                attack.setEnabled(true);         
                break;
            case pantry: 
                north.setEnabled(false);
                south.setEnabled(false);
                east.setEnabled(true);
                west.setEnabled(false);
                down.setEnabled(false);
                up.setEnabled(false);
                search.setEnabled(true);
                attack.setEnabled(false);
                break;
            case livingRoom: 
                north.setEnabled(false);
                south.setEnabled(false);
                east.setEnabled(false);
                west.setEnabled(true);
                down.setEnabled(false);
                up.setEnabled(false);
                search.setEnabled(true);
                attack.setEnabled(true);
                break;
            case playRoom: 
                north.setEnabled(true);
                south.setEnabled(false);
                east.setEnabled(true);
                west.setEnabled(true);
                down.setEnabled(true);
                up.setEnabled(false);
                search.setEnabled(true);
                attack.setEnabled(true);
                break;
            case kitchen: 
                north.setEnabled(false);
                south.setEnabled(false);
                east.setEnabled(false);
                west.setEnabled(true);
                down.setEnabled(false);
                up.setEnabled(false);
                search.setEnabled(true);
                attack.setEnabled(true);
                break;
            case laundryRoom: 
                north.setEnabled(false);
                south.setEnabled(false);
                east.setEnabled(true);
                west.setEnabled(false);
                down.setEnabled(false);
                up.setEnabled(true);
                search.setEnabled(true);
                attack.setEnabled(true);
                break;
            case office: 
                north.setEnabled(false);
                south.setEnabled(false);
                east.setEnabled(false);
                west.setEnabled(false);
                down.setEnabled(true);
                up.setEnabled(false);
                search.setEnabled(true);
                attack.setEnabled(false);
                break;
            case attic: 
                north.setEnabled(false);
                south.setEnabled(false);
                east.setEnabled(false);
                west.setEnabled(false);
                down.setEnabled(true);
                up.setEnabled(false);
                search.setEnabled(true);
                attack.setEnabled(true);
                break;
        }
    }
}
