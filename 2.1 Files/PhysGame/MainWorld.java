import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.IOException; 
import java.util.*;
import java.lang.*;
import java.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private static GreenfootImage textFrame;
    private static List dialogList = new ArrayList();
    private static boolean paused;
    private World Inventory = new Inventory();
    
    public MainWorld() throws IOException, InterruptedException

    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new NPC(), getWidth()/2, getHeight()/2);
        addObject(new Hero(),getWidth()/2, getHeight()-10);// spawns hero at middle bottom
        dialogList.clear();
        List<String> dialogList = Dialog.getText("dialog/intro.txt");
        for (int i = 0; i < dialogList.size(); i++)
        {
            Greenfoot.ask(dialogList.get(i));
        }
        Greenfoot.start();
        System.out.println(1.0/3);
    }

    public void act() 
    {
        if (Greenfoot.isKeyDown("x"))
        {
            try
            { 
                Greenfoot.setWorld(WorldTracker.getInventory());
            }
            catch (NullPointerException e)
            {
                try
                {
                    Greenfoot.setWorld(new Inventory());
                }
                catch (IOException | InterruptedException v)
                {
                }
            }
            WorldTracker.setPreviousWorld(this);
        }
    }
}
