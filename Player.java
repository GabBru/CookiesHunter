
/**
 * Class imageRoom associates an image and a Gif with a room.
 * A room necessarily has a room image but does not necessarily have a Gif.
 *
 * @author : Marie Bogusz
 * @version (1)
 */
public class ImageRoom
{
    private String image; // The image variable is the name of the room image
    private Room aRoom; // The aRoom variable is the room
    private String gif = null; // The gif variable is the name of the room gif 
    
    /**
     * Constructor of ImageRoom class.
     * A room necessarily has a room image but does not necessarily have a Gif.
     */
    public ImageRoom(String image, Room aRoom)
    {
        this.image = image;
        this.aRoom = aRoom;
    }

    /**
     * SetImage allows to changes the room image associated at the room.
     */
    public void setImage(String ima)
    {
        this.image = ima;
    }
    
     /**
     * setGif allows you changes the gif associated at the room.
     */
    public void setGif(String gi)
    {
        this.gif = gi;
    }
    
     /**
     * @return Return the room.
     */
    public Room getImgRoom()
    {
        return aRoom;
    }
    
    /**
     * @return Return the image associated at the room.
     */
    public String getImage()
    {
        return image;
    }
    
    /**
     * @return Return the gif associated at the room.
    */
    public String getGif()
    {
        return gif;
    }
}
