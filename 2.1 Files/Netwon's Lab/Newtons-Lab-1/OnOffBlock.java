import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class OnOffBlock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OnOffBlock extends Actor
{
    /**
     * Act - do whatever the OnOffBlock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean on;
    private boolean ignore;
    public void act()
    {
        detection();
    }

    private void detection()
    {

        if (ignore == false && isTouching(Body.class))
        {
            if (on == true)
            {
                on = false;
                ignore = true;
            }
            else
            {
                on = true;
                ignore = true;
            }    
        }
        if (!isTouching(Body.class))
        {
            ignore = false;
        }
        if (on)
        {
            for (int i = 0; i < 20; i++)
            {
                if (i == 9)
                {
                    setImage("block-light.png");
                    Greenfoot.playSound("4g.wav");
                }
                if (i == 19)
                {
                    setImage("block.png");
                    i = 0;
                }
            }
        }
    }
}
