import java.util.*;
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
    // instance variables - replace the example below with your own
    private int x;
    private static double totalCost;
    private static int numSongs;
    private static int totalRatings;
    private static int averageCost;
    private static ArrayList<Song> songList;
    private static ArrayList<String> infoList;
    public static void main(String[] args)
    {
        songList = new ArrayList<Song>();
        infoList = new ArrayList<String>();
        System.out.println("Welcome to your Media Library");
        //instantiate objects
        Song song1 = new Song("Johnny B. Goode", 1.99, 4);
        Song song2 = new Song("David Boiu", 1.50, 5);
        Song song3 = new Song("Meme Kand", 1.99, 5);
        Book book1 = new Book();
        Movie movie1 = new Movie();
        //add to list
        song1.addToList();
        song2.addToList();
        song3.addToList();
        //print out object data
        System.out.println(song1);
        System.out.println(book1);
        System.out.println(movie1);
        //print variables
        System.out.println(song1.getTitle());
        System.out.println(String.valueOf(song1.getRating()));
        System.out.println(String.valueOf(song1.getPrice()));
        //print info
        System.out.println("Total cost of songs: " + String.valueOf(getTotalCost())+
            "\nAverage cost of songs: " + String.valueOf(getAverageCost()));
        System.out.println("Average rating of songs: " +String.valueOf(getAverageRating()));
        System.out.println("Hours :" +String.valueOf(movie1.getDuration()));
        //write to text file
        for (int i = 0; i < songList.size(); i++)
        {
            infoList.clear();
            infoList.add(songList.get(i).getTitle());
            infoList.add(String.valueOf(songList.get(i).getRating()));
            infoList.add(String.valueOf(songList.get(i).getPrice()));
            MediaFile.writeString(infoList);
        }
        MediaFile.saveAndClose();
    }

    public static void addTotalCost(double t)
    {
        totalCost += t;
    }

    public static double getTotalCost()
    {
        return totalCost;
    }

    public static void addNumSongs()
    {
        numSongs++;
    }

    public static int getNumSongs()
    {
        return numSongs;
    }

    public static void setTotalRatings(int t)
    {
        totalRatings += t;
    }

    public static int getTotalRatings()
    {
        return totalRatings;
    }

    public static double getAverageCost()
    {
        return (getTotalCost()/getNumSongs());
    }

    public static double getAverageRating()
    {
        return (getTotalRatings()/getNumSongs());
    }

    public static void addSongList(Song object)
    {
        songList.add(object);
    }
}
