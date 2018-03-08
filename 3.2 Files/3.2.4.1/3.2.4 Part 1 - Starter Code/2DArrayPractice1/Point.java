
/**
 * Write a description of class Point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Point
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    /**
     * Constructor for objects of class Point
     */
    public Point(int a, int b)
    {
        // initialise instance variables
        x = a;
        y = b;
    }

    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void printPoint()
    {
        System.out.println("(" + String.valueOf(x) + "," + String.valueOf(y) + ")");
    }
}
