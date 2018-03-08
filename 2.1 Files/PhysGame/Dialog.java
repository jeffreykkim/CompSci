import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.io.BufferedReader; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStream; 
import java.io.InputStreamReader; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Paths;
/**
 * Write a description of class Dialog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialog
{
    /**
     * Below are resources used to help create this method.
     * https://stackoverflow.com/questions/731365/reading-and-displaying-data-from-a-txt-file
     * https://stackoverflow.com/questions/22878833/error-unreported-exception-java-io-filenotfoundexception-must-be-caught-or-dec
     * http://javarevisited.blogspot.com/2015/09/how-to-read-file-into-string-in-java-7.html
     * https://docs.oracle.com/javase/8/docs/api/java/util/List.html
     */

    private static List dialogList = new ArrayList();
    public Dialog()
    {
        
    }

    public static List<String> getText(String filePath) throws IOException
    {
        return Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
    }

   
}
