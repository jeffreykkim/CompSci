
/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff
{
    // instance variables - replace the example below with your own
    private static final int COUNTER = 15;
    private static Employee[] employees;
    private static Employee empl1;
    private static Employee empl2;
    private static Employee empl3;

    public static void main(String[] args)
    {
        System.out.println("Employee Record");
        for (int i =0; i < COUNTER; i++)
        {
            System.out.print("-");
        }
        System.out.print("\n");
        for (Employee e : employees)
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
    
    public static Employee[] makeList()
    {
        empl1 = new Employee(23453, "Jennifer Almonds", Employee.EmploymentStatus.FULLTIME, 22.25);
        empl2 = new Employee(46523, "Bennison Apple", Employee.EmploymentStatus.PARTTIME, 22.25);
        empl3 = new Employee(17583, "Joseph Hazelnut", Employee.EmploymentStatus.UNKNOWNS, 22.25);
        employees = new Employee[] {empl1,empl2,empl3};
        return employees;
    }
}
