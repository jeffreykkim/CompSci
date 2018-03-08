
/**
 * A class designed to test positional values to see if they represent a line
 *
 * @author 
 * @version 
 */
public class XYValues
{
    public static int[][] table1 = {{-2,-1,0,1,2},{-10,-7,-4,-1,2}};
    public static int[][] table2 = {{0,1,2,3,4},{16,13,10,7,4}};
    public static int[][] table3 = {{0,1,2,3,4},{0,1,2,3,4}};
    public static int m;
    public static int c;
    public static String eqn;
    /**
     * Prints the array 'rows' as 'columns'
     *
     * @param int[][] arr - a 2D int array
     */
    public static void printPoints(int[][] arr)
    {
        System.out.print("x\ty\n");
        for(int i = 0; i < arr[0].length; i++)
        {
            for(int n = 0; n < arr.length; n++)
            {
                System.out.print(String.valueOf(arr[n][i]) + "\t");
            }
            System.out.println();
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param arr - 2D int array; values representing points on a line
     * @return eqn - A String representing the equation of the line 
     * represented by the points in the array in the for y = mx + b
     */
    public static String printEqn(int[][] arr)
    {
        m = ((arr[1][1] - arr[1][0])/(arr[0][1] - arr[0][0]));
        c = (m*arr[0][0]*-1)+arr[1][0];
        eqn = "y = " + String.valueOf(m) + "x + " + String.valueOf(c);
        return eqn;
    }
    
    public static String printEqn()
    {
        return printEqn(table3);
    }
}
