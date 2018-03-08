import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.util.Arrays;
/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Make the piano.
     */
    private int i;
    private int whiteKeyWidth;
    private String[] whiteKeys;
    private String[] whiteNotes;
    private String fileExtension;
    public Piano() 
    {
        super(800, 340, 1);
        makeKeys();
        
    }

    private void makeKeys()
    {
        i = 0;
        whiteKeyWidth = WhiteKey.getWhiteKeyWidth();
        fileExtension = ".wav";
        whiteKeys = new String[]{"a","s","d","f","g","h","j","k","l",";","'"};
        whiteNotes = new String[]{"3c" , "3d" , "3e", "3f" , "3g" , "3a" , "3b" , "4c" , "4d" , "4e" , "4f"}; 
        while (i < whiteKeys.length)
        {
            whiteNotes[i] = (whiteNotes[i] + fileExtension);
            addObject(new WhiteKey(whiteKeys[i],"sounds/" + whiteNotes[i]),(whiteKeyWidth * i) + (whiteKeyWidth/2) + ((getWidth() - ( 63*(whiteKeys.length)))/2),getHeight()/2);
            i++;
        }
    }
}