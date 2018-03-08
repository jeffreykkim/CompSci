import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor

{
    private int speed;
    /**
     * Sets the speed and rotation to default values when created.
     */
    public Hero()
    {
        speed = 2;//controls how fast char is moving thru map.
        setRotation(0);//sets sprites to face regularly;
    }
    
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
    }

    /**
     * Controls movement using arrow keys.
     * Press space to interact with NPC or other objects
     * Press x to open your inventory
     */
    private void movement()
    {
        if (Greenfoot.isKeyDown("down"))
        {
            //change sprite to down
            setLocation(getX(),getY()+2);//moves down; didnt use move() because needs to be faceing(rotation)
        }
        if (Greenfoot.isKeyDown("up"))
        {
            //change sprite to up
            setLocation(getX(),getY()-2);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            //change sprite to left
            setLocation(getX()-2,getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            //change sprite to right
            setLocation(getX()+2,getY());
        }
        if (Greenfoot.isKeyDown("space"))
        {
           //initialize dialouge.
           //if object next to you, initialize dialouge.
           // have a list of interactable objects, compare to getIntersectingObject() after
           //casting to string, and if match play appropriate dialouge
        }
        if (Greenfoot.isKeyDown("x"))
        {
            //open inventory
            //pauses game and creates new object in which you can select stuff.
        }
    }
    
    /**
     * Returns the speed's current value
     */
    public int getSpeed()
    {
        return speed;
    }
    
    /**
     * Changes speed to new value.
     */
    public void setSpeed(int newVal)
    {
        speed = newVal;
    }
    
}
