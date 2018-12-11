import java.util.*;
/**
 * Décrivez votre classe Game ici.
 *
 * @author Martin Pettinotti
 * @version v0.1 dec2018
 */
public class Game
{
    private Player player1;
    private ArrayList<ImageRoom> listImgRoom = new ArrayList<>();
    
    /**
     * Constructeur d'objets de classe Game
     */
    public Game(Player newPlayer)
    {
        // initialisation de la map avec les différentes pièces
        player1 = newPlayer;
        Room outside, hall, garage, livingroom, daughterRoom, pantry, playroom, kitchen, office, laundryRoom, attic;
        outside = new Room("une description non bidon1");       
        hall = new Room("une description non bidon2");
        garage = new Room("une description non bidon3");
        livingroom = new Room("une description non bidon4");
        daughterRoom = new MagicRoom("une description non bidon5","Unicorn");
        pantry = new LockRoom("une description non bidon6");
        playroom = new LockRoom("une description non bidon7");
        kitchen = new Room("une description non bidon8");
        office = new Room("une description non bidon9");
        laundryRoom = new Room("une description non bidon10");
        attic = new MagicRoom("une description non bidon11","Non determiné");
        
        // Ajout des sorties
        outside.setExit("North",hall);
        hall.setExit("South",outside);
        hall.setExit("West",garage);
        hall.setExit("East",livingroom);
        hall.setExit("North",daughterRoom);
        hall.setExit("Up",playroom);
        daughterRoom.setExit("South",hall);
        garage.setExit("East",hall);
        garage.setExit("West",pantry);
        pantry.setExit("East",garage);
        livingroom.setExit("East",hall);
        playroom.setExit("Down",hall);
        playroom.setExit("North",office);
        playroom.setExit("East",kitchen);
        playroom.setExit("West",laundryRoom);
        kitchen.setExit("East",playroom);
        laundryRoom.setExit("West",playroom);
        laundryRoom.setExit("Up",attic);
        office.setExit("Down",outside);
        attic.setExit("Down",laundryRoom);
        
        //Placement initial du joueur
        player1.setCurrentRoom(outside);
        
        //Creation des room avec image associee
        ImageRoom imgOutside, imgHall, imgGarage, imgLivingroom, imgDaughterRoom, imgPantry, imgPlayroom, imgKitchen, imgOffice, imgLaundryRoom, imgAttic;
        imgOutside = new ImageRoom("images/Garden_characters.jpg",outside);
        imgHall = new ImageRoom("images/hall_monster.jpg
