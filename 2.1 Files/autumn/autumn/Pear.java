import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pear1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pear extends Nature
{
    /**
     * Act - do whatever the Pear1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pear() 
    {
        setImage("pear.png");
    }

    public void act()
    {
        super.movement();
        wrapping();
        pushing();
    }

    private void wrapping()
    {
        if (getX() == getWorld().getWidth()-1)
        {
            setLocation(0,getY());
        }
    }

    private void pushing()
    {
        if (isTouching(Block.class))
        {
            setRotation(0);
            move(2);
        }
        else
        {
            move(speed);
        }
    }
}
