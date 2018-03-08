import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
/**
 * Write a description of class DepartmentStore here.
 * @param nill
 * @author Jeffrey Kim
 * @version 1.0
 */
public class DepartmentStore
{
    private static final int COUNTER = 23;
    private static int[][] itemNumbers = new int[2][5];
    private static String[][] itemNames = new String[][]
        {
            {"Dress", "Sandals", "T-Shirt", "Shorts", "Jeans"},
            {"Graphic T-shirt", "Shorts", "Shoes", "Jacket", "Chinos"}
        };
    private static double[][] itemPrices = new double[2][5];
    private static String[] header = new String[]{"Item#", "Item Name", "Item Price"};
    public static void initLists()
    {
        /** 
         * returns a 2x5 2D array of 6 digit numbers using random integers
         * reference used for random method: 
         * https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
         */
        for (int i = 0; i < itemNumbers.length; i++)
        {
            for (int n = 0; n < itemNumbers[i].length; n++)
            {
                itemNumbers[i][n] = ThreadLocalRandom.current().nextInt(100000,1000000);
            }
        }
        for (int i = 0; i< itemPrices.length; i++)
        {
            for (int n = 0; n < itemPrices[i].length; n++)
            {
                //uses random int to make a price range of $10 to $35 without extra decimals
                itemPrices[i][n] = (double)ThreadLocalRandom.current().nextInt(1000,3500)/100;
                
            }

        }
    }

    public static void printSingleElement(String[][] array,int index, int index2)
    {
        System.out.println(array[index][index2]);
    }
    
    public static void printSingleElement(double[][] array, int index, int index2)
    {
        System.out.println(array[index][index2]);
    }
    
    public static void printSingleElement(int[][] array, int index , int index2)
    {
        System.out.println(array[index][index2]);
    }
    
    public static void printAllElements()
    {
        System.out.println("Department Store Iventory");
        for (int i = 0; i < COUNTER; i++)
        {
            System.out.print("=");
        }
        System.out.print("\n");
        for (String i : header)
        {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
        for (int i = 0; i < COUNTER; i++)
        {
           System.out.print("-");
        }
        System.out.print("\n");
        for (int i = 0; i < itemNumbers.length; i++)
        {
            for (int n = 0; n < itemNumbers[i].length; n++)
            {
                System.out.print(String.valueOf(itemNumbers[i][n]));
                System.out.print("\t");
                System.out.print(String.valueOf(itemNames[i][n]));
                System.out.print("\t");
                System.out.print(String.valueOf(itemPrices[i][n]));
                System.out.print("\n");
            }
        }
    }
}

