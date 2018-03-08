import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author 
 * @version 
*/
public class Lining extends Actor
{
    /**
     * Act - nothing to do.
     */
    Lining lining;
    public void act() 
    {
        animation();
    }
    private void animation()
    {
        setLocation(getX()-1, getY());
        if (getX() == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
