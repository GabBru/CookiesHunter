import java.util.*;
/**
 * This class contains all the objects of the game and allows the passage of information between objects.
 *
 * @author Group 3
 * @version v0.2 2018dec
 */
public class Game
{
    // Instance variables
    private Player player1;
    private ArrayList<ImageRoom> listImgRoom = new ArrayList<>();
    private ArrayList<Enemy> listEnemy = new ArrayList<>();
    private Item myItem1, myItem2;
    private String answer;
    
    /**
     * Object constructor for the Game class
     */
    public Game()
    {
        // initialisation map with different rooms
        Room outside, hall, garage, livingRoom, daughterRoom, pantry, playRoom, kitchen, office, laundryRoom, attic;
        outside = new Room("outside","<html>Welcome to Cookies Hunter! <br> You are a very hungry monster (yes, this blue monster) which likes cookies. In the house in front of you, a magic Cookie is waiting for you... Prepare yourself to enter a dark and psychedelic game. You actualy are in the garden of the house. It is sober and well maintained. You can also feel a lot of magic in the air");
        hall = new Room("hall","<html>You arrive in the hall with 3 other doors. There is a sign on the door that faces north, the sign says: answer the riddle to enter in my bedroom!");
        garage = new Room("garage","<html>You arrive in the garage. The father is tinkering with his car. A smell of cookie separates from the smell of the motor and makes you want to attack him ...");
        livingRoom = new Room("livingRoom","<html>You arrive in the living room. The grampa is watching the TV and smells like a cookie. It makes you want to attack him ...");
        daughterRoom = new MagicRoom("daughterRoom","<html>You arrive in a bedroom, it is the bedroom of a little girl. it's very creepy. You can observe the many unicorns","Unicorn");
        pantry = new LockRoom("pantry","<html>You enter in a pantry, a servant is cooking a meal. Maybe you can talk to him");
        playRoom = new LockRoom("playRoom","<html>You arrive on the next floor, more precisely in a playroom. A little boy is playing quietly. It makes you want to attack him ! ");
        kitchen = new Room("kitchen","<html>You enter a spacious kitchen. A woman with an empty stare coming you. She is holding a spoon. Let's see who has the better spoon between you and her !");
        office = new Room("office","<html>You enter an office ... OMG THERE IS A BLACK HOWL IN THE MIDDLE OF THE ROOM !! And now, you can not leave the room because the door is blocked! What will happen if you try to jump into the hole?...");
        laundryRoom = new Room("laundryRoom","<html>You enter in a laundry. A very old and creepy woman is watching you...");
        attic = new MagicRoom("attic","<html>I am the death ! I am the end of world ! No man can defeat me !!! HAHAHAHAHAHA","Undetermined");
        
        //Add of the items
        daughterRoom.addItemRoom(new Item("Cookie", "This is a delicious cookie"));
        garage.addItemRoom(new Item("Cookie", "This is a delicious cookie"));
        livingRoom.addItemRoom(new Item("Denture", "Denture of Grand-father"));
        pantry.addItemRoom(new Item("Bottle of milk", "A baby bottle full of milk"));
        playRoom.addItemRoom(new Item("Cookie", "This is a delicious cookie"));
        kitchen.addItemRoom(new Item("Cookie", "This is a delicious cookie"));
        office.addItemRoom(new Item("Baby-bottle", "An empty baby-bottle"));
        laundryRoom.addItemRoom(new Item("Cookie", "This is a delicious cookie"));
        outside.addItemRoom(new Item("Key", "Allows to unlock a door"));
        daughterRoom.addItemRoom(new Item("Key", "Allows to unlock a door"));
        
        //Add of the exits
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
        
        //Creation of the rooms avec associated pictures
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
        imgGarage.setGif("images/father.gif");
        imgAttic.setGif("images/Baby.gif");
        imgPantry.setGif("images/cook.gif");
        imgLaundryRoom.setGif("images/grannyScary.gif");
        imgKitchen.setGif("images/mom.gif");
        imgPlayRoom.setGif("images/boy.gif");
        
        //Add of the list of room
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
        
        //Add of the Enemy list
        listEnemy.add(new Enemy("Grand-father", 0, livingRoom));
        listEnemy.add(new Enemy("Father", 1, garage));
        listEnemy.add(new Enemy("Brother", 2, playRoom));
        listEnemy.add(new Enemy("Mother", 3, kitchen));
        listEnemy.add(new Enemy("Grand-Mother", 4, laundryRoom));
        listEnemy.add(new Enemy("Baby", 4, attic));
        
        // ----- initial position of the player -----
        player1 = new Player("Monster", outside);
        
        //default answer
        answer=""; 
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
    
    public void setAnswer(String s){
        answer = s;
    }
    
    public String getAnswer(){
        return answer;
    }
}
