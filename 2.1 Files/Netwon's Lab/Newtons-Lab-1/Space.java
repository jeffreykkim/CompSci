import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Space. The final frontier. 
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    /**
     * Create space.
     */

    public ArrayList<String> soundFiles;
    public final String fileExtension = ".wav";
    public final String[] noteLetters = new String[]{"a","b","c","d","e","f","g"};
    private int spawnNumber;
    public Space()
    {    
        super(960, 620, 1);
        spawnNumber = irandom(10)+1;
        soundFiles = new ArrayList<String>();
        for (int i = 2; i < 4; i++)
        {
            for (int o = 0; o < noteLetters.length; o ++)
            {
                soundFiles.add(Integer.toString(i)+ noteLetters[o]);
            }
        }
        createObstacles();
        createBodies();

    }

    /**
     * Set up the universe with a sun and a planet.
     */
    public void sunAndPlanet()
    {
        removeAllObjects();
        addObject (new Body (50, 240.0, new Vector(270, 0.03), new Color(255, 216, 0)), 460, 270);
        addObject (new Body (20, 4.2, new Vector(90, 2.2), new Color(0, 124, 196)), 695, 260);
    }

    /**
     * Set up the universe with a sun and two planets.
     */
    public void sunAndTwoPlanets()
    {
        removeAllObjects();
        addObject (new Body (50, 240.0, new Vector(270, 0.0), new Color(255, 216, 0)), 460, 310);
        addObject (new Body (20, 4.2, new Vector(90, 2.2), new Color(0, 124, 196)), 695, 300);
        addObject (new Body (24, 4.6, new Vector(270, 1.8), new Color(248, 160, 86)), 180, 290);
    }

    /**
     * Set up the universe with a sun, a planet, and a moon.
     */
    public void sunPlanetMoon()
    {
        removeAllObjects();
        addObject (new Body (50, 240.0, new Vector(270, 0.0), new Color(255, 216, 0)), 460, 270);
        addObject (new Body (20, 4.2, new Vector(90, 2.2), new Color(0, 124, 196)), 720, 260);
        addObject (new Body (5, 0.8, new Vector(90, 3.25), new Color(240, 220, 96)), 748, 260);
    }

    /**
     * Remove all objects currently in the world.
     */
    private void removeAllObjects()
    {
        removeObjects (getObjects(Actor.class));
    }

    private void createObstacles()
    {
        for (int i = 0; i < (spawnNumber); i++)
        {
            if ((i+1)%2 == 0)
            {
                addObject(new Obstacle(soundFiles.get(i) + fileExtension), (getWidth()/(spawnNumber+1)*(i+1)), getHeight()/2);
            }
            else
            {
                addObject(new OnOffBlock(),(getWidth()/(spawnNumber+1)*(i+1)), getHeight()/2);
            }
        }
    }

    private void createBodies()
    {
        for (int i = 0; i < 5; i++)
        {
            addObject(new Body(irandom(200)+10,irandom(200)+10,new Vector(irandom(361),irandom(10)),new Color(irandom(256),irandom(256),irandom(256))),irandom(getWidth()),irandom(getHeight()));
        }
    }

    /**
     * Shortened method name of Greenfoot.getRandomNumber()
     */
    private int irandom(int limit)
    {
        return Greenfoot.getRandomNumber(limit);
    }

}
