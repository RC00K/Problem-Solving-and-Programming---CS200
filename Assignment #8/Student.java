/**
 * Student
 * Student extends with super class person and access its properties 
 * @author (Ryder Cook)
 * @version (3/30/2020)
 */

public class Student extends Person
{
    private int studentNumber;
    
    public Student()
    {
        super();
        studentNumber = 0;
    }
    
    public Student(String initialName, int initialStudentNumber)
    {
        super(initialName);
        setStudentNumber(initialStudentNumber);
    }
    
    //Set the student number
    public void setStudentNumber(int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }
    
    //Get student number
    public int getStudentNumber()
    {
        return studentNumber;
    }
    
    //Write student details
    public void writeOutput()
    {
        System.out.println("Name: " + getName());
        System.out.println("Student Number: " + studentNumber);
    }
    
    
    public String toString()
    {
        return "Name: " + getName() + "\nStudent Number: " + studentNumber;
    }
}
