import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MyActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyActor extends Actor
{
    private static GreenfootImage frame0;
    private static GreenfootImage frame1;
    private static GreenfootImage frame2;
    private static GreenfootImage[] imageList;
    private static MouseInfo mouse;
    private static int timer;
    private static int counter;
    /**
     * Act - do whatever the MyActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MyActor()
    {
        frame0 = new GreenfootImage("images/Actor/frame0.png");
        frame1 = new GreenfootImage("images/Actor/frame1.png");
        frame2 = new GreenfootImage("images/Actor/frame2.png");
        imageList = new GreenfootImage[] {frame0,frame1,frame2};

        for(GreenfootImage image : imageList)//downscales iamges
        {
            image.scale(500/5,238/5);
        }
        setImage(frame0);
        timer = 0;
        counter = 0;
    }

    public void act() 
    {
        switchImage();
        moving();
    }

    private void switchImage()
    {
        timer++;
        if (timer % 10 == 0)
        {
            counter++;
            if (counter > imageList.length - 1)
            {
                counter = 0;
            }
            setImage(imageList[counter]);
        }
    }

    private void moving()
    {
        mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseDragged(this))
        {
            setLocation(mouse.getX(),mouse.getY());
        }
    }
}
