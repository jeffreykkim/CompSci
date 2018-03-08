import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab2 extends Crab
{
    /**
     * Act - do whatever the Crab2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAndTurn();
        eat();
        switchImage();
        boundControl();
    }    
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(3);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            move(4);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            move(-4);
        }
    }
}
