import greenfoot.*;
import java.util.*;
/**
 * A floating leaf that blows across the screen.
 *
 * @author Michael Kölling
 * @version 1.0
 */
public class Leaf extends Nature
{
    
    GreenfootImage img1 = new GreenfootImage("leaf-green.png");
    GreenfootImage img2 = new GreenfootImage("leaf-brown.png");
    
    /**
     * Create the leaf.
     */
    public Leaf()
    {
        setImage(img1);
    }
    public void act() 
    {
        super.act();
        checkBlock();
    }
    /**
     * Change the image to another leaf image. This toggles back and
     * forth between two images.
     */
    public void changeImage()
    {
        if (getImage() == img1) 
        {
            setImage(img2);
        }
        else {
            setImage(img1);
        }
    }
     private void checkBlock()
    {
        if (isTouching(Block.class))
        {
            turn(Greenfoot.getRandomNumber(181)-90);
        }
    }
}
