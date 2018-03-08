import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.IOException; 
import java.util.*;
/**
 * Write a description of class Invetory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inventory extends World
{

    /**
     * Constructor for objects of class Invetory.
     * 
     */
    private static GreenfootImage background;
    private static List dialogList = new ArrayList();
    public Inventory() throws IOException, InterruptedException
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        background = getBackground();
        background.setColor(new Color(139,69,19));
        background.fill();
        background.setColor(Color.BLACK);
        for (int y = 0; y < 3; y++)
        {
            for (int x = 0; x < 3; x++)
            {
                background.drawRect(((getWidth()/3)+(getWidth()*2*x/9)),((getHeight()/3)+(getHeight()*2*y/9)),getWidth()*2/9,getHeight()*2/9);
            }
        }
        background.drawRect(getWidth()/3,getHeight()*2/3,getWidth()*2/3,getHeight()/3);
        background.drawRect(getWidth()/27,getHeight()/9,getWidth()*7/27,getHeight()*7/9);
        dialogList.clear();
        List<String> dialogList = Dialog.getText("dialog/intro.txt");
        for (int i = 0; i < dialogList.size(); i++)
        {
            Greenfoot.ask(dialogList.get(i));
        }
        Greenfoot.start();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("escape"))
        {
            Greenfoot.setWorld(WorldTracker.getPreviousWorld());
            WorldTracker.setInventory(this);
        }
    }
}
