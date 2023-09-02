/**
 * Staff
 * Staff class gets properties from its super class employee
 * @author (Ryder Cook)
 * @version (3/30/2020)
 */

public class Staff extends Employee
{
    private int paygrade;
    
    public Staff()
    {
        //Calls super class default constructor
        super();
    }
    
    public Staff(int employeeID, String employeeName, String employeeDep, int paygrade)
    {
        //Calls super class three argument constructor
        super(employeeID, employeeName, employeeDep);
        
        //Call setGrade method
        setGrade(paygrade);
    }
    
    //Sets pay grade
    public void setGrade(int paygrade)
    {
        if((paygrade >= 1) && (paygrade <= 20))
            this.paygrade = paygrade;
        else
            System.out.println("Illegal Paygrade");
    }
    
    //Gets grade and returns paygrade
    public int getGrade()
    {
        return paygrade;
    }
    
    //Outputs the paygrade
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Pay Grade: " + paygrade);
    }
    
    //Returns a string for paygrade
    public String toString()
    {
        return super.toString() + "\nPay Grade: " + getGrade();
    }
}
