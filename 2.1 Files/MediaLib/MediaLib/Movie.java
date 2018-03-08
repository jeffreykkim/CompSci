
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie extends Media
{
    private int duration;
    public Movie()
    {
        rating = 0;
        title = "";
    }

    public void setDuration(int t)
    {
        duration = t;
    }

    public int getDuration()
    {
        return duration;
    }
}
