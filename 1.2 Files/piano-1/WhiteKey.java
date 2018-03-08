import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class WhiteKey extends Actor
{
    /**
     * Create a new key.
     */
    protected String key;
    protected String sound;
    protected String keyName;
    protected boolean isDown;
    public WhiteKey(String keyName, String soundName)
    {
        sound = soundName;
        key = keyName;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if (!isDown && Greenfoot.isKeyDown(key))
        {
            setImage("images/white-key-down.png");
            isDown = true;
            play(sound);
        }
        if (isDown && !Greenfoot.isKeyDown(key))
        {
            isDown = false;
            setImage("images/white-key.png");
        }
    }

    private void play(String soundname)
    {
        Greenfoot.playSound(soundname);
    }
    public static int getWhiteKeyWidth()
    {
        return 63;
    }
}

