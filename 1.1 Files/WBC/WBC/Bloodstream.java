import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author 
 * @version 
 */
public class Bloodstream extends World
{

    /**
     * 
     */
    private String textScore;
    private String textTime;
    private static int score;
    private int time;
    public Bloodstream()
    {    
        super(780, 360, 1); 
        score = 0;
        time = 2000;
        prepare();
    }

    /**
     * 
     */
    public void act()
    {
        spawnVirus();
        displayScore();
        countTime();
        showTime();
        textTime = Integer.toString(time);
        textScore = Integer.toString(getScore());
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Lining(), 779, (Greenfoot.getRandomNumber(2)*360));
        }
        if (Greenfoot.getRandomNumber(100) <3)
        {
            addObject(new Bacteria(), 779, Greenfoot.getRandomNumber(360));
        }
        if (Greenfoot.getRandomNumber(100) <5)
        {
            addObject(new RedCell(),779, Greenfoot.getRandomNumber(360));
        }
        if (score < 0 || time == 0)
        {
           showEndMessage();
        }
    }

    /**
     * 
     * 
     */
    private void prepare()
    {
        WhiteCell whitecell = new WhiteCell();
        addObject(whitecell, 100, 179);
        Lining lining = new Lining();
        addObject(lining, 126, 1);
        Lining lining2 = new Lining();
        addObject(lining2, 342, 5);
        Lining lining3 = new Lining();
        addObject(lining3, 589, 2);
        Lining lining4 = new Lining();
        addObject(lining4, 695, 5);
        Lining lining5 = new Lining();
        addObject(lining5, 114, 359);
        Lining lining6 = new Lining();
        Lining lining7 = new Lining();
        addObject(lining7, 295, 353);
        Lining lining8 = new Lining();
        Lining lining9 = new Lining();
        Lining lining10 = new Lining();
        addObject(lining10, 480, 358);
        Lining lining11 = new Lining();
        addObject(lining11, 596, 359);
        Lining lining12 = new Lining();
        addObject(lining12, 740, 354);
        Border border = new Border();
        addObject(border, 0, 180);
        Border border2 = new Border();
        addObject(border2, 770,180);
        setPaintOrder(Border.class,WhiteCell.class,Lining.class);
    }

    private void spawnVirus()
    {
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Virus(),779,Greenfoot.getRandomNumber(360));
        }
    }

    private void spawnRedCell()
    {
        if (Greenfoot.getRandomNumber(100) < 6)
        {
            addObject(new RedCell(),779,Greenfoot.getRandomNumber(360));
        }
    }

    private void displayScore()
    {

        showText("Score: " + textScore,80,25);
    }

    public static void setScore(int value)
    {
        score = score + value;
    }

    public static int getScore()
    {
        return score;
    }

    private void countTime()
    {
        time--;
        if (time == 0)
        {
            time = 0;
        }
    }

    private void showTime()
    {
        showText("Timer: " + textTime,80,45);
    }

    private void showEndMessage()
    {
        if (time == 0)
        {
            showText("You won!\n Your score:" + textScore, getWidth()/2, getHeight()/2);
        }
        if (score < 0)
        {
            showText("You lost!\n Your score:" + textScore, getWidth()/2, getHeight()/2);
        }
        Greenfoot.stop();
    }
}   
