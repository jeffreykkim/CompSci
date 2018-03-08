import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage background = new GreenfootImage("images/background.jpg");
        background.scale(this.getWidth(),this.getHeight());    
        setBackground(background);
        for (int i = 0; i < 37; i++)
        {
            for (int n = 0; n < 6; n++)
            {
                addObject(new ColorPatch(600/6,400/36),(600/6)*n + 600/12,(400/36)*i);
            }
        }
    }
}
