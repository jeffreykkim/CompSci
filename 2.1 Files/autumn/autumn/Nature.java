import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nature extends Actor
{
    protected int speed;
    /**
     * Act - do whatever the Nature wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Nature()
    {
        speed = Greenfoot.getRandomNumber(3) + 1;      // random speed: 1 to 3
        setRotation(Greenfoot.getRandomNumber(360));
    }

    public void act() 
    {
        movement();
        move(speed);
    }

    public void movement()
    {
        if (isAtEdge()) 
        {
            if (this instanceof Pear && getX() == getWorld().getWidth()-1)
            {
                setLocation(0, getY()); 
            }

            turn(Greenfoot.getRandomNumber(180));
        }
        if (Greenfoot.getRandomNumber(100) < 50) 
        {
            turn(Greenfoot.getRandomNumber(5) - 2);   // -2 to 2
        }
    }
}
