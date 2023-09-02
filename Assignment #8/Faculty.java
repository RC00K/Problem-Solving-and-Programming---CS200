
/**
 * Faculty
 * This is my faculty class and it stores faculty information
 * @author (Ryder Cook)
 * @version (3/30/2020)
 */
public class Faculty extends Employee
{
    private String facultyTitle;
    
    public Faculty()
    {
        super();
        facultyTitle = "Not Set";
    }
    
    public Faculty(int employeeID, String employeeName, String employeeDep, String facultyTitle)
    {
        super(employeeID, employeeName, employeeDep);
        setTitle(facultyTitle);
    }
    
    //Sets the faculty title
    public void setTitle(String facultyTitle)
    {
        this.facultyTitle = facultyTitle;
    }
    
    //Gets and returns faculty title
    public String getTitle()
    {
        return facultyTitle;
    }
    
    //Outputs the faculty title
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Employee Title: " + facultyTitle);
    }
    
    //Returns the string for employee title
    public String toString()
    {
        return super.toString() + "\nEmployee Title: " + getTitle();
    }
}
