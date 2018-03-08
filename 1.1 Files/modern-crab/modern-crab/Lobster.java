import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image1 = new GreenfootImage("image/lobster.png");
    public Lobster()
    {
        setImage(image1);
    }

    public void act() 
    {
        moveAround();
        eat();
        deathByClicks();
    }

    public void deathByClicks()
    {
        Actor lobster = this;
        World world = getWorld();
        if (Greenfoot.mouseClicked(lobster))
        {
            world.removeObject(lobster);
        }
    }

    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);// Add your action code here.
        }   
        if (isAtEdge())
        {
            turnTowards((getWorld().getHeight()/2),(getWorld().getWidth()/2));
        }
    }

    public void eat()
    {
        if (isTouching(Crab.class))
        {
            removeTouching(Crab.class);
            Greenfoot.playSound("sound/eating.wav");
            Greenfoot.playSound("sound/au.wav");
            Greenfoot.stop();
        }
    }
}  

