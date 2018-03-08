import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author 
 * @version 
 */
public class Bacteria extends Actor
{
    /**
     * 
     */
    private int speed;
    public Bacteria()
    {
    }

    /**
     * 
     */
    public void act() 
    {
        setLocation(getX()-2, getY());
        turn(1);
        speed = Greenfoot.getRandomNumber(3);
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
            Bloodstream.setScore(-15);
        }
    }
    
    
}
