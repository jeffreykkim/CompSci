
/**
 * Write a description of class Media here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Media
{
    // instance variables - replace the example below with your own
    protected int rating;
    protected String title;
    protected double price;
    protected boolean favorite;
    /**
     * Constructor for objects of class Media
     */
    public void main()
    {
        rating = 0;
        title = "";
        price = 0.0;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String t)
    {
        title = t;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int t)
    {
        rating = t;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double t)
    {
        price = t;
    }

    public void addToFavorites()
    {
        favorite = true;   
    }
}
