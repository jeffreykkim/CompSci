import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    /**
     * Act - do whatever the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected boolean isTouched = false;
    private String sounds;
    public Obstacle(String soundfile)
    {
        sounds = soundfile;
    }

    public void act() 
    {
        detection(sounds);
    } 

    private void playSound(String soundfile)
    {
        Greenfoot.playSound(soundfile);
    }

    private void detection(String sounds)
    {
        if (isTouched && isTouching(Body.class))
        {
            isTouched = false;
            setImage("block-light.png");
            playSound(sounds);
            changeColor();
        }

        if (!isTouched && !isTouching(Body.class))
        {
            isTouched = true;
            setImage("block.png");

        }
    }

    protected void changeColor()
    {
        GreenfootImage objImage = getOneIntersectingObject(Body.class).getImage();
        objImage.setColor(new Color(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)));
        objImage.fillOval(0,0,objImage.getWidth()-1,objImage.getHeight()-1);
    }
}
