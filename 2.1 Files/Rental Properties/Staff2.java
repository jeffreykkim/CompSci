
/**
 * Write a description of class Staff2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff2
{
    // instance variables - replace the example below with your own
    private static final int COUNTER = 15;
    /**
     * Constructor for objects of class Staff2
     */
    public static void printEmployees(Employee[] array)
    {
        System.out.println("Employee Record");
        for (int i =0; i < COUNTER; i++)
        {
            System.out.print("-");
        }
        System.out.print("\n");
        for (Employee e : array)
        {
            System.out.println("Employee #: \t" + e.getEmplNmbr());
            System.out.println("Full Name: \t" + e.getName());
            System.out.println("Status: \t" + String.valueOf(e.getStatus()));
            System.out.println("Salary: \t" + String.valueOf(e.getSalary()));
            
            for (int i =0; i < COUNTER; i++)
            {
                System.out.print("-");
            }
            System.out.print("\n");
        }
    }
}