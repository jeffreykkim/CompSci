import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class ColorPatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ColorPatch extends Actor
{
    private Color palette;
    private Random numGen = new Random();
    private GreenfootImage image;
    /**
     * Act - do whatever the ColorPatch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ColorPatch(int width, int height)
    {
        image = new GreenfootImage(width,height);
        image.setColor(colorChange());
        image.fillRect(0,0,width,height);
        setImage(image);
    }
    public Color colorChange()
    {
        palette = new Color(numGen.nextInt(256),numGen.nextInt(256),numGen.nextInt(256),255);
        return palette;
    }
}
