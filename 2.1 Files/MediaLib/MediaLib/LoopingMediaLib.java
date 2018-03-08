
/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    // instance variables - replace the example below with your own
    private static String songInfo;
    /**
     * Constructor for objects of class LoopingMediaLib
     */
    public static void main()
    {
        for (int i = 0; i < MediaLib.getNumSongs(); i++)
        {
            songInfo = MediaFile.readString();
            try
            {
                if (!songInfo.equals("null"))
                {
                    System.out.println("Author: " + songInfo.substring(0,songInfo.indexOf("|")));
                    songInfo = songInfo.substring(songInfo.indexOf("|")+1,songInfo.length());
                    System.out.println("Rating: " + songInfo.substring(0,songInfo.indexOf("|")));
                    songInfo = songInfo.substring(songInfo.indexOf("|")+1,songInfo.length() - 1);
                    System.out.println("Price: $" +songInfo);
                }
            }
            catch(NullPointerException e)
            {
            }
        }
    }

}
