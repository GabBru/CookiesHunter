import java.util.*;
/**
 * Decrivez votre classe Game ici.
 *
 * @author Group 3
 * @version v0.2 2018dec
 */
public class Game
{
    // variables d'instance - remplacez l'exemple qui suit par le vÃ´tre
    private Player player1;
    private ArrayList<ImageRoom> listImgRoom = new ArrayList<>();
    private ArrayList<Enemy> listEnemy = new ArrayList<>();
    private ArrayList<Npc> listNpc = new ArrayList<>();
    
    //Instance
    private Item myItem1, myItem2;
    
    /**
     * Constructeur d'objets de classe Game
     */
    public Game()
    {
        //A la fin remettre "Player newPlayer"
        
        // initialisation map with different rooms
        
        Room outside, hall, garage, livingRoom, daughterRoom, pantry, playRoom, kitchen, office, laundryRoom, attic;
        outside = new Room("outside","<html>Welcome to Cookies Hunter! <br> You are a creepy monster (yes this blue monster), you are hungry. In this building, a magic Cookie waits. Prepare to enter a modern and psychedelic dark souls. You arrive in the garden. it is sober and well maintained, so you see the dark manor where lies the magic cookies.");
        hall = new Room("hall","<html>You arrive in the hall. You have an important several choices: right door,door in front of you, left door and the stairs. Be careful, each of your choices is important. If you do not attention, an untimely death awaits you.");
        garage = new Room("garage","<html>You arrive in the garage. the father remark you and attacks you with a wrench. Defend yourself !!!");
        livingRoom = new Room("livingRoom","<html>You arrive in the living room. The grampa attack you. Defend yourself !!!");
        daughterRoom = new MagicRoom("daughterRoom","<html>You arrive in a room, it is the room of the little girl. it's very creepy.","Unicorn");
        pantry = new LockRoom("pantry","<html>You enter the pantry room, a servant greets you.");
        playRoom = new LockRoom("playRoom","<html>You arrive on the next floor, more precisely in the playroom. A little boy awaits you there. be careful ! he attacks you !");
        kitchen = new Room("kitchen","<html>You enter a spacious kitchen. a woman with an empty stare coming you. She is holding a knife and is aiming at your throat !!! defend yourself !!!");
        office = new Room("office","<html>You enter an office ...You are stuck, there is no exit. OMG Ã¢â‚¬Â¦ BAM, a trap is triggered and you are sucking in a temporary space portal.");
        laundryRoom = new Room("laundryRoom","<html>You enter in a laundry room. A very old and creepy woman waiting for you...");
        attic = new MagicRoom("attic","<html>I am the death ! I am the end of world ! No man can defeat me !!! HAHAHAHAHAHA","Undetermined");
        
        //Ajout des Items
        daughterRoom.addItemRoom(new Item("Cookie", "C'est un dÃ©licieux cookie"));
        garage.addItemRoom(new Item("Cookie", "C'est un dÃ©licieux cookie"));
        livingRoom.addItemRoom(new Item("Denture", "Denture of Grand-father"));
        pantry.addItemRoom(new Item("Milk", "Milk must be in a baby bottle"));
        playRoom.addItemRoom(new Item("Cookie", "C'est un dÃ©licieux cookie"));
        kitchen.addItemRoom(new Item("Cookie", "C'est un dÃ©licieux cookie"));
        office.addItemRoom(new Item("Bottle of milk", "A baby bottle must be milk"));
        laundryRoom.addItemRoom(new Item("Cookie", "C'est un dÃ©licieux cookie"));
        outside.addItemRoom(new Item("Key", "Permet d'ouvrir une porte ferm�e � cl�"));
        daughterRoom.addItemRoom(new Item("Key", "Permet d'ouvrir une porte ferm�e � cl�"));
        
        
        // Ajout des sorties
        outside.setExit("North",hall);
        hall.setExit("South",outside);
        hall.setExit("West",garage);
        hall.setExit("East",livingRoom);
        hall.setExit("North",daughterRoom);
        hall.setExit("Up",playRoom);
        daughterRoom.setExit("South",hall);
        garage.setExit("East",hall);
        garage.setExit("West",pantry);
        pantry.setExit("East",garage);
        livingRoom.setExit("West",hall);
        playRoom.setExit("Down",hall);
        playRoom.setExit("North",office);
        playRoom.setExit("East",kitchen);
        playRoom.setExit("West",laundryRoom);
        kitchen.setExit("West",playRoom);
        laundryRoom.setExit("East",playRoom);
        laundryRoom.setExit("Up",attic);
        office.setExit("Down",outside);
        attic.setExit("Down",laundryRoom);
        
        //Creation des room avec image associee
        ImageRoom imgOutside, imgHall, imgGarage, imgLivingRoom, imgDaughterRoom, imgPantry, imgPlayRoom, imgKitchen, imgOffice, imgLaundryRoom, imgAttic;
        imgOutside = new ImageRoom("images/gardenCharacters.jpg",outside);
        
        imgHall = new ImageRoom("images/hallMonster.jpg",hall);
        imgGarage = new ImageRoom("images/garageCharacters.jpg",garage);
        imgLivingRoom = new ImageRoom("images/livingroomCharacters.jpg",livingRoom);
        imgDaughterRoom = new ImageRoom("images/bedroomCharacters.jpg",daughterRoom);
        imgPantry = new ImageRoom("images/pantryCharacters.jpg",pantry);
        imgPlayRoom = new ImageRoom("images/playroomCharacters.jpg",playRoom);
        imgKitchen = new ImageRoom("images/kitchenCharacters.jpg",kitchen);
        imgOffice = new ImageRoom("images/officeMonster.jpg",office);
        imgLaundryRoom = new ImageRoom("images/laundryRoomCharacters.jpg",laundryRoom);
        imgAttic = new ImageRoom("images/atticCharacters.jpg",attic);
        
        imgOffice.setGif("images/orig.gif");
        
        //Ajout Ãƒ la liste
        listImgRoom.add(imgOutside);
        listImgRoom.add(imgHall);
        listImgRoom.add(imgGarage);
        listImgRoom.add(imgLivingRoom);
        listImgRoom.add(imgDaughterRoom);
        listImgRoom.add(imgPantry);
        listImgRoom.add(imgPlayRoom);
        listImgRoom.add(imgKitchen);
        listImgRoom.add(imgOffice);
        listImgRoom.add(imgLaundryRoom);
        listImgRoom.add(imgAttic);
        
        //Ajout Liste Ennemy
        listEnemy.add(new Enemy("Grand-father", 0, livingRoom));
        listEnemy.add(new Enemy("Father", 1, garage));
        listEnemy.add(new Enemy("Brother", 2, playRoom));
        listEnemy.add(new Enemy("Mother", 3, kitchen));
        listEnemy.add(new Enemy("Grand-Mother", 4, laundryRoom));
        listEnemy.add(new Enemy("Baby", 4, attic));
        
        //Ajout Liste Npc
        listNpc.add(new Npc("Daughter"));
        listNpc.add(new Npc("Cook"));
        listNpc.add(new Npc("Unicorn"));
        
        // ----- Placement initial du joueur -----
        player1 = new Player("Monster", outside);
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
    
    public Enemy getEnemy(){
        for(Enemy i : listEnemy){
            if (i.getEnemyRoom() == player1.getRoom()) return i;
        }
        return null; 
    }
    
    public ArrayList<Enemy> getListEnemy(){
        return listEnemy;
    }
}
