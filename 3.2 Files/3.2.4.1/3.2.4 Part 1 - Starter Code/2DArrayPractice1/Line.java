
/**
 * Write a description of class Line here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Line
{
    private Point[] list;
    private String eqn;
    private int m;
    private int c;
    /**
     * Constructor for objects of class Line
     */
    public Line(Point[] arr)
    {
        // initialise instance variables
        list = arr;
    }

    public void printPoints()
    {
        for (Point vari : list)
        {
            vari.printPoint();
        }
    }
    
    public String printeqn()
    {
        m = (list[1].getY() - list[0].getY())/(list[1].getX() - list[0].getX());
        c = (m*list[0].getX()*-1)+list[0].getY();
        eqn = "y = " + String.valueOf(m) + "x + " + String.valueOf(c);
        return eqn;
    }
}
