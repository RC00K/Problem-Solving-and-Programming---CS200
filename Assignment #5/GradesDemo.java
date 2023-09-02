/**
 * GradesDemo
 * Runs grading program
 * @author (Ryder Cook)
 * @version (2/11/2020)
 */
import java.util.Scanner;

public class GradesDemo
{
    public static void main(String[] args)
    {
        Grades grade1 = new Grades();
        
        grade1.studentdetails();
        
        grade1.finalgrade();
        
        grade1.lettergrade();
        
        grade1.displaystudentdetails();
    }
}
