import java.util.*;
/**
 * Décrivez votre classe Game ici.
 *
 * @author Group 3
 * @version v0.1 2018nov
 */
public class Game
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Player player1;
    private ArrayList<ImageRoom> listImgRoom = new ArrayList<>();
    private ArrayList<Ennemy> listEnnemy = new ArrayList<>();
    
    //Instance
    private Item myItem1, myItem2;
    
    /**
     * Constructeur d'objets de classe Game
     */
    public Game(String newNamePlayer)
    {
        //A la fin remettre "Player newPlayer"
        
        // initialisation map with different rooms
        
        Room outside, hall, garage, livingroom, daughterRoom, pantry, playroom, kitchen, office, laundryRoom, attic;
        outside = new Room("Welcome to Cookies Hunter! You are a creepy monster (yes this blue monster), you are hungry. In this building, a magic Cookie waits. Prepare to enter a modern and psychedelic dark souls. You arrive in the garden. it is sober and well maintained, so you see the dark manor where lies the magic cookies.");       
        hall = new Room("You arrive in the hall. You have an important several choices: right door,door in front of you, left door and the stairs. Be careful, each of your choices is important. If you do not attention, an untimely death awaits you.");
        garage = new Room("You arrive in the garage. the father remark you and attacks you with a wrench. Defend yourself !!!");
        livingroom = new Room("You arrive in the living room. The grampa attack you. Defend yourself !!!");
        daughterRoom = new MagicRoom("You arrive in a room, it is the room of the little girl. it's very creepy.","Unicorn");
        pantry = new LockRoom("You enter the pantry room, a servant greets you.");
        playroom = new LockRoom("You arrive on the next floor, more precisely in the playroom. A little boy awaits you there. be careful ! he attacks you !");
        kitchen = new Room("You enter a spacious kitchen. a woman with an empty stare coming you. She is holding a knife and is aiming at your throat !!! defend yourself !!!");
        office = new Room("You enter an office ...You are stuck, there is no exit. OMG … BAM, a trap is triggered and you are sucking in a temporary space portal.");
        laundryRoom = new Room("You enter in a laundry room. A very old and creepy woman waiting for you...");
        attic = new MagicRoom("I am the death ! I am the end of world ! No man can defeat me !!! HAHAHAHAHAHA","Undetermined");
        
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
        
        //Creation des room avec image associee
        ImageRoom imgOutside, imgHall, imgGarage, imgLivingroom, imgDaughterRoom, imgPantry, imgPlayroom, imgKitchen, imgOffice, imgLaundryRoom, imgAttic;
        imgOutside = new ImageRoom("images/gardenCharacters.jpg",outside);
        //imgOutside.setGif("images/unicrorn.gif");
        imgHall = new ImageRoom("images/hallMonster.jpg",hall);
        imgGarage = new ImageRoom("images/garageCharacters.jpg",garage);
        imgLivingroom = new ImageRoom("images/livingroomCharacters.jpg",livingroom);
        imgDaughterRoom = new ImageRoom("images/bedroomCharacters.jpg",daughterRoom);
        imgPantry = new ImageRoom("images/pantryCharacters.jpg",pantry);
        imgPlayroom = new ImageRoom("images/playroomCharacters.jpg",playroom);
        imgKitchen = new ImageRoom("images/kitchenCharacters.jpg",kitchen);
        imgOffice = new ImageRoom("images/officeMonster.jpg",office);
        imgLaundryRoom = new ImageRoom("images/laundryRoomCharacters.jpg",laundryRoom);
        imgAttic = new ImageRoom("images/atticCharacters.jpg",attic);
        
        //Ajout à la liste 
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
        
        // ----- Placement initial du joueur -----
        //player1.setCurrentRoom(outside);
        player1 = new Player(newNamePlayer, outside);
        myItem1 = new Item("Cookie", "C'est un délicieux cookie");
        myItem2 = new Item("Denture", "J'ai plus de dents ...");
        player1.addInventory(myItem1);
        player1.addInventory(myItem2);
    }
    
    public ImageRoom getImgCurrentRoom(){
        for(ImageRoom i : listImgRoom){
            if (i.getImgRoom() == player1.getRoom()) return i;
        }
        return null;
    }
    
    public Player getPlayer(){
        return player1;
    }
}
