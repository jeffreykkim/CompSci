import greenfoot.*;

/**
 * Write a description of class WorldTracker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldTracker  
{
    // instance variables - replace the example below with your own
    private int x;
    private static World previousWorld;
    private static World inventory;
    /**
     * Constructor for objects of class WorldTracker
     */
    public WorldTracker()
    {
    }

    public static void setPreviousWorld(World world)
    {
        previousWorld = world;
    }
    
    public static World getPreviousWorld()
    {
        return previousWorld;
    }
    
    public static void setInventory(World world)
    {
        inventory = world;
    }
    
    public static World getInventory()
    {
        return inventory;
    }
}
