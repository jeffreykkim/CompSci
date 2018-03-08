
/**
 * Write a description of class RentalProperty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RentalProperty
{
    // instance variables - replace the example below with your own
    private  int counter = 15;
    private  String[] headers;
    private  int[] propertyNumbers;
    private  PropertyType[] types;
    private  int[] bedrooms;
    private  double[] bathrooms;
    private  double[] monthlyRent;
    /**
     * Constructor for objects of class RentalProperty
     */
    public RentalProperty()
    {
        headers = new String[] {"Prop #", "Property Type",
            "Beds", "Baths", "Monthly Rent"};
        propertyNumbers = new int[] {111111,222222,333333,444444,
            555555,666666,777777,888888};
        types = new PropertyType[] {PropertyType.APARTMENT, PropertyType.SINGLEFAMILY, 
            PropertyType.TOWNHOUSE, PropertyType.UNKNOWNS,
            PropertyType.APARTMENT,PropertyType.TOWNHOUSE,
            PropertyType.SINGLEFAMILY,PropertyType.UNKNOWNS};
        bedrooms = new int[] {1,2,3,4,5,6,7,8};
        bathrooms = new double[] {0.25,0.5,0.75,1,
            1.25,1.5,1.75,2};
        monthlyRent = new double[] {1000.00,2345.00,1647.50,2000.00,
            975.00,1243.00,6123.00,3201.00};
    }   
    public void showListing()
    {
        System.out.println("Properties Listing");
        for (int i = 0; i < counter; i++)
        {
            System.out.print("=");
        }
        System.out.print("\n");
        for (int i = 0; i < headers.length; i++)
        {
            System.out.print(headers[i] + "\t");
        }
        System.out.print("\n");
        for (int i =0; i < counter; i++)
        {
            System.out.print("-");
        }
        System.out.print("\n");
        for (int i = 0; i < 8; i++)
        {
            System.out.println(propertyNumbers[i] + "\t" + String.valueOf(types[i])
            + "\t" + bedrooms[i] + "\t" + bathrooms[i] + "\t" + monthlyRent[i]);
        }
        for (int i = 0; i < counter; i++)
        {
            System.out.print("=");
        }
    }
}
