import greenfoot.*;
import java.util.*;
/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Block extends Actor
{
    private int delta = 2;
    List<Leaf> leafList;
    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
        appleRotate();
    }

    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
    }

    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            delta = -delta;// reverse direction
            World world = getWorld();
            world.addObject(new Leaf(),getX(),getY());
        }
    }

    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        if (Greenfoot.mouseClicked(null)) 
        {
            leafList = getWorld().getObjects(Leaf.class);
            for (int i =0; i < leafList.size(); i++)
            {
                if (leafList.get(i).getX() < getWorld().getWidth())
                {
                    leafList.get(i).changeImage();
                }
            }
        }
    }

    private void appleRotate()
    {
        getOneIntersectingObject(Apple.class).turn(-90);
    }

    
}
