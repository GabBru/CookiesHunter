
/**
 * Class imageRoom associates an image with a room.
 *
 * @author : Marie Bogusz
 * @version (1)
 */
public class ImageRoom
{
    // instance variables - replace the example below with your own
    private String image;
    private Room aRoom;
    private String gif = "null";

    /**
     * Constructor for objects of class yilhdtyfy
     */
    public ImageRoom(String image, Room aRoom)
    {
        this.image = image;
        this.aRoom = aRoom;
    }

    /**
     * changes the image associated at the room.
     */
    public void setImage(String image)
    {
        this.image = image;
    }
    
     /**
     * changes the gif associated at the room.
     */
    public void setGif(String gif)
    {
        this.gif = gif;
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
    
    /**
     * Delete gif
    */
    public void deleteGif()
    {
        this.gif = "null";
    }
}
