import java.util.*;
/**
 * D�crivez votre classe Game ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class Game
{
    // variables d'instance - remplacez l'exemple qui suit par le v�tre
    private Player player1;
    private ArrayList<ImageRoom> listImgRoom = new ArrayList<>();
    private ArrayList<Ennemy> listEnnemy = new ArrayList<>();
    
    /**
     * Constructeur d'objets de classe Game
     */
    public Game(Player newPlayer)
    {
        // initialisation de la map avec les diff�rentes pi�ces
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
        attic = new MagicRoom("une description non bidon11","Undetermined");
        
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
        //imgOutside.setGif("images/unicrorn.gif");
        imgHall = new ImageRoom("images/hall_monster.jpg ",hall);
        imgGarage = new ImageRoom("images/Garage_characters.jpg",garage);
        imgLivingroom = new ImageRoom("images/Livingroom_characters.jpg ",livingroom);
        imgDaughterRoom = new ImageRoom("images/Bedroom_characters.jpg ",daughterRoom);
        imgPantry = new ImageRoom("images/Pantry_characters.jpg ",pantry);
        imgPlayroom = new ImageRoom("images/Playroom_characters.jpg ",playroom);
        imgKitchen = new ImageRoom("images/Kitchen_characters.jpg ",kitchen);
        imgOffice = new ImageRoom("images/Office_monster.jpg ",office);
        imgLaundryRoom = new ImageRoom("images/Laundry_room_characters.jpg ",laundryRoom);
        imgAttic = new ImageRoom("images/Attic_characters.jpg ",attic);
        
        //Ajout � la liste 
        listImgRoom.add(imgOutside);
        listImgRoom.add(imgHall);
        listImgRoom.add(imgGarage);
        listImgRoom.add(imgLivingroom);
        listImgRoom.add(imgDaughterRoom);
        listImgRoom.add(imgPantry);
        listImgRoom.add(imgPlayroom);
        listImgRoom.add(imgKitchen);
        listImgRoom.add(imgOffice);
        listImgRoom.add(imgLaundryRoom);
        listImgRoom.add(imgAttic);
    }
    
    public ImageRoom getImgCurrentRoom(){
        for(ImageRoom i : listImgRoom){
            if (i.getRoom() == player1.getRoom()) return i;
        }
        return null;
    }
    
    public Player getPlayer(){
        return player1;
    }
    
    
}
