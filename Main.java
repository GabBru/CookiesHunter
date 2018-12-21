/**
 * This class is the main class of the program which allows to launch the game directly.
 *
 * @author Groupe3 : Martin Pettinotti, Amandine Poullot, Gabriel Brunet, Antoine Pierson, Marie Bogusz, Thibaud Gil, Diama Fall, Kilian Felesmino.
 * @version v0.2 2018dec
 */
public class Main
{
    public static void main()
    {
        try{
            TheWindows myWindows = new TheWindows();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
