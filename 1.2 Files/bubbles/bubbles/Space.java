import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A bit of empty space for bubbles to float in.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    /**
     * Create Space. Make it black.
     */
    public Space()
    {
        super(900, 600, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        setup();
        setupLine();
    }

    private void setup()
    {
        for (int i = 0; i < 18; i++)
        {
            addObject(new Bubble(190-(10*i),0+(20*i)),(getWidth()/2),(getHeight()/2));
        }
    }

    private void setupLine()
    {
        for (int i = 0; i < 21; i++)
        {
            addObject(new Bubble(),(getWidth()/20)*i,(getHeight()/20)*i);
        }
    }
}
