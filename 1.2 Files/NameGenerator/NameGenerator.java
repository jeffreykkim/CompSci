
/**
 * Write a description of class NameGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class NameGenerator
{
    private static String[] questionArray;
    private static String triggerStatement;//Used to denote when the function should start asking for user input
    private static ArrayList<String> inputStorage;
    private static String firstNamePart1;
    private static String firstNamePart2;
    private static String newFirst;
    private static String lastNamePart1;
    private static String lastNamePart2;
    private static String newLast;
    private static Random rand;
    private static int halfLength;
    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        triggerStatement = "What's your first name?";
        inputStorage = new ArrayList<String>();
        rand = new Random();
        questionArray = new String[]
        {
            "This is the name generator!",
            "You input your name and this neat program will spitout a new name for you!",
            "Try it out now!",
            triggerStatement,
            "What's your last name?",
            "What's the city you were born in?",
            "What's the name of any previous school you've attended?",
            "What's the first name of a relative?",
            "What's the first name of a friend?"
        };
        main();
    }

    public static void main()
    {
        for(int i = 0; i < questionArray.length; i++)
        {
            System.out.println(questionArray[i]);
            if (i >= (findIndex(questionArray, triggerStatement)))
            {
                inputStorage.add(getInput());
            }
            
        }
        System.out.println("Your new name is " + genFirstName(inputStorage.get(0),inputStorage.get(1)) + " " + genLastName(inputStorage.get(2),inputStorage.get(3)));
        System.out.println("You are from " + genOrigin(inputStorage.get(4),inputStorage.get(5)));
    }

    public static String getInput()
    {
        Scanner input = new Scanner(System.in);
        return input.next();
    }
    
    public static int findIndex(String[] array, String t)
    {
        /*
         * Used to find the index of an object in a given list
         * Heavily based off the code shown in 
         * "https://www.w3resource.com/java-exercises/array/java-array-exercise-6.php"
         */
        if (array == null)
        {
            return -1;
        }
        int len = array.length;
        int i = 0;
        while (i < len)
        {
            if (array[i] == t)
            {
                return i;
            }
            else
            {
                i++;
            }
        }
        return -1; // if none if this applies, then return "null" or -1;
    }
    
    public static String genFirstName(String first, String last)
    {
        firstNamePart1 = first.substring(0,halfRange(first)[0]);
        firstNamePart2 = last.substring(halfRange(last)[1],last.length());
        newFirst = firstNamePart1 + firstNamePart2;
        return newFirst;
    }
    
    private static String genLastName(String city, String school)
    {
        lastNamePart1 = city.substring(0,halfRange(city)[0]);
        lastNamePart2 = school.substring(halfRange(school)[1],school.length());
        newLast = lastNamePart1 + lastNamePart2;
        return newLast;
    }
    
    private static int[] halfRange(String memes)
    {
        halfLength = memes.length()/2;
        int number1 = rand.nextInt(halfLength);
        int number2 = rand.nextInt(memes.length() - halfLength) + halfLength;
        int[] list = new int[]{number1,number2};
        return list;
    }
    
    private static String genOrigin(String relative,String friend)
    {
        return relative.substring(randNum(relative)) + friend.substring(randNum(friend));
    }
    
    private static int randNum(String input)
    {
        //https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
        int randomNum = ThreadLocalRandom.current().nextInt(0,input.length());
        return randomNum;
    }
    
}
