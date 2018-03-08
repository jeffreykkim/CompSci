import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //initiallizes instance variables with void
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    public Crab()
    {
        /* Crab constructor method
         *when the number of worms eaten by the crab is 10 or more, play the
         *victory sound file and stop the game.
         */
        setImage(image1);//sets image to the first frame when instanteated 
        wormsEaten = 0;
        if (wormsEaten >= 10)
        {
            Greenfoot.playSound("sound/fanfare.wav");
            Greenfoot.stop();
        }

    }

    public void act()
    {
        // act constructor method, runs the listed methods continuously
        moveAndTurn();
        eat();
        boundControl();
        switchImage();
    }

    public void switchImage()
    {
        /* images are now given a file when the method is called to increase efficency
         * if the image is image1, set it to image2, or else change it to image 1
         */
        image1 = new GreenfootImage("image/crab.png");
        image2 = new GreenfootImage("image/crab2.png");
        if (getImage() == image1)
        {
            setImage(image2);
        }
        else 
        {
            setImage(image1);
        }
    }

    public void boundControl()
    {
        /* if the crab is touching the edge of the world
         * removes the crab and palces a lobster in the crabs position
         */
        if (isAtEdge() == true)
        {
            Actor crab = this;
            Actor lobster = new Lobster();
            World world = getWorld();
            int currentX = getX();
            int currentY = getY();
            world.removeObject(crab);
            world.addObject(lobster,currentX,currentY);
        }
    }

    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            move(4);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-4);
        }
    }    

    public void eat()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Worm worm = new Worm();
            World world = getWorld();
            world.addObject(worm, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
            Greenfoot.playSound("sound/slurp.wav");
            wormsEaten ++;
        }
    }    
}
