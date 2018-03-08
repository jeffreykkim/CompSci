import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author 
 * @version 
 */

public class WhiteCell extends Actor
{
    /**
     * 
     */
    private boolean alreadyExecuted;
    public void act() 
    {
        checkKeyPress();
        checkCollision();
    }

    /**
     * 
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-4);
        }

        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+4);
        }
    }

    private void checkCollision()
    {
        if (isTouching(Bacteria.class))
        {
            removeTouching(Bacteria.class);
            Greenfoot.playSound("sounds/slurp.wav");
            Bloodstream.setScore(20);
        }
        if (isTouching(Virus.class))
        {
            removeTouching(Virus.class);
            Greenfoot.playSound("sounds/oof.wav");
            Bloodstream.setScore(-100);
        }
    }
}
