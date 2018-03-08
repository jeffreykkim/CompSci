
/**
 * Write a description of class Averages here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Averages
{
    // instance variables - replace the example below with your own
    private static int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    private static int[][] copy;
    public static void main()
    {
        copy = new int[4][3];
        for (int i = 0; i < arr.length; i++)
        {
            copy[i] = ArrayCopier.cloneArray(arr[i]);
        }
        for (int i = 0; i < arr.length; i++)
        {
            int holder = 0;
            for (int n = 0; n < arr[i].length; n++)
            {
                holder += arr[i][n];
            }
            holder = holder/arr[i].length;
            copy[3][i] = holder;
        }
        System.out.println("Copied array values");
        System.out.println();
        for(int i = 0; i < copy.length; i++)
        {
            if(i == 3)
            {
                System.out.println("Average values for each row");
            }
            for (int n = 0; n < copy[i].length; n++)
            {
                System.out.print(String.valueOf(copy[i][n]) + "\t");
            }
            System.out.println();
        }
    }

}
