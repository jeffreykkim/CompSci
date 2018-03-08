
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song extends Media
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        MediaLib.addNumSongs();
    }

    public Song(String title, double price)
    {
        MediaLib.addNumSongs();
        this.title = title;
        this.price = price;
        MediaLib.addTotalCost(price);
    }

    public Song(String title, double price, int rating)
    {
        MediaLib.addNumSongs();
        this.title = title;
        this.price = price;
        this.rating = rating;
        MediaLib.addTotalCost(price);
    }
    
    public void addToList()
    {
        MediaLib.addSongList(this);
    }
}
