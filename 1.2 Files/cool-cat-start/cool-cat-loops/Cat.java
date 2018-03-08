import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A cat. Can do some things cats do. Or not.
 * 
 * @author Michael Kolling
 * @author Denise Lodge
 * @author Rebecca Lee
 * @author Mihaela Sabin
 * @version 2.0 - Sep 30, 2010
 */
public class Cat  extends Actor
{
    private String [] spinList;
    private String [] catPlay;
    
    /**
     * Instantiate the cat object and arrays.
     */
    public Cat()
    {
        spinList = new String[]{"spin-1.png","spin-2.png","spin-3.png",
            "spin-3-piano.png","spin-4-piano.png","spin-5-piano.png"};
        catPlay = new String[]{"cat-play-3-piano.png","cat-play-4B-piano.png"};
    }

    /**
     * Walk a bit to the left. 'distance' determines how far to walk. Use small numbers (1 to 10).
     */
    private void walkLeft(int distance)
    {
        walk(distance, -10, "cat-walk.png", "cat-walk-2.png");
    }

    /**
     * Walk a bit to the right. 'distance' determines how far to walk. Use small numbers (1 to 10).
     */
    private void walkRight(int distance)
    {
        walk(distance, 10, "cat-walk-right.png", "cat-walk-right-2.png");
    }

    /**
     * Internal walk method. Walk a given distance into a given direction, using given images.
     */
    private void walk(int distance, int direction, String img1, String img2)
    {
        for (int i=0; i<distance; i++) 
        {
            setImage(img1);
            this.wait(4);
            setLocation(getX() + direction, getY());
            setImage(img2);
            this.wait(4);
            setLocation(getX() + direction, getY());
        }
        setImage("cat.png");
    }       

    /**
     * I want the cat to play
     */
    public void playPiano()
    {        
        this.walkRight(8);
        Greenfoot.playSound("snoopy.wav");
        this.wait(10); 
        spinAwayToPlay(true);
        twoPlayMoves(8);
        Greenfoot.playSound("snoopy.wav");
        twoPlayMoves(9);
        spinAwayToPlay(false);
        setImage("cat.png");        
    }   

    /**
     * Abstraction method of playing.
     */
    private void twoPlayMoves(int howMany)
    {
        for (int i = 0; i < howMany; i++)
        {
            setImage(catPlay[0]);
            this.wait(6);   
            setImage(catPlay[1]);
            this.wait(6);
        }  
    }

    /**
     * Whether to spin towards or away when given a boolean.
     */
    private void spinAwayToPlay(boolean condition)
    {
        if (condition)
        {
            for (int i = 0; i < spinList.length; i++)
            {
                setImage(spinList[i]);
                this.wait(6);
            }
        }
        if (!condition)
        {
            for (int i = spinList.length - 1; i > -1; i--)
            {
                setImage(spinList[i]);
                this.wait(6);
            }
        }
    }

    /**
     * Wait for a given time.
     */
    public void wait(int time)
    {
        Greenfoot.delay(time);
    }   
}

