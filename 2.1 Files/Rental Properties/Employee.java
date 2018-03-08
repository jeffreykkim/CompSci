
/**
 * Enumeration class Employee - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class Employee
{
    public enum EmploymentStatus
    {
        FULLTIME,PARTTIME,UNKNOWNS;
    }
    private int emplNmbr;
    private String name;
    private EmploymentStatus status;
    private double salary;
    
    public Employee(int em, String n, EmploymentStatus stat, double sal)
    {
        emplNmbr = em;
        name = n;
        status = stat;
        sal = sal;
    }
    public void setEmplNumbr(int i)
    {
        emplNmbr = i;
    }
    
    public void setName(String s)
    {
        name = s;
    }
    
    public void setStatus(EmploymentStatus s)
    {
        status = s;
    }
    
    public void setSalary(double d)
    {
        salary = d;
    }
    
    public int getEmplNmbr()
    {
        return emplNmbr;
    }
    
    public String getName()
    {
        return name;
    }
    
    public EmploymentStatus getStatus()
    {
        return status;
    }
    
    public double getSalary()
    {
        return salary;
    }
}
