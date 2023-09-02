 /**
 * Employee
 * This is the information that is stored for employees
 * @author (Ryder Cook)
 * @version (3/30/2020)
 */

public class Employee extends Person
{
    private int employeeID;
    private String employeeDep;
    
    public Employee()
    {
        super();
        employeeID = 0;
        employeeDep = "Not Set";
    }
    
    public Employee(int employeeID, String employeeName, String employeeDep)
    {
        super(employeeName);
        setEmployeeID(employeeID);
        setEmployeeDep(employeeDep);
    }
    
    //Sets the employee ID
    private void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }
    
    //Sets the employee department
    private void setEmployeeDep(String employeeDep)
    {
        this.employeeDep = employeeDep;
    }
    
    //Gets the employee ID
    private int getEmployeeID()
    {
        return employeeID;
    }
    
    //Gets the employee department
    private String getEmployeeDep()
    {
        return employeeDep;
    }
    
    //String for employee information
    public String toString()
    {
        return "Employee Name: " + getName() + "\nEmployee ID: " + getEmployeeID() + "\nEmployee Department: " + getEmployeeDep();
    }
   
   //Outputs the employee ID and Department 
    public void writeOutput()
    {
        System.out.println("Employee ID: " + employeeID);
        super.writeOutput();
        System.out.println("Employee Department: " + employeeDep);
    }
}
