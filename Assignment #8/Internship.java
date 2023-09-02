/**
 * Internship
 * This class stores the information for interns
 * @author (Ryder Cook)
 * @version (3/30/2020)
 */
public class Internship extends Faculty
{
    private int studentAge;
    private String studentTitle;
    
    public Internship()
    {
        super();
        studentAge = 0;
    }
    
    public Internship(String studentTitle, String initialName, int initialStudentAge)
    {
        setName(initialName);
        setStudentAge(initialStudentAge);
        setTitle(studentTitle);
    }
    
    //Set the student number
    public void setStudentAge(int newStudentAge)
    {
        studentAge = newStudentAge;
    }
    
    //Get student number
    public int getStudentAge()
    {
        return studentAge;
    }
    
    //Sets the student title
    public void setTitle(String studentTitle)
    {
        this.studentTitle = studentTitle;
    }
    
    //Gets and returns student title
    public String getTitle()
    {
        return studentTitle;
    }
    
    //Write student details
    public void writeOutput()
    {
        System.out.println("Name: " + getName());
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Title: " + studentTitle);
    }
    
    
    public String toString()
    {
        return "Name: " + getName() + "\nStudent Age: " + studentAge + "Student Title: " + studentTitle;
    }
}
