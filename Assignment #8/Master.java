 /**
 * Master
 * Master class has information pertaining to student
 * and shows the level of the degree
 * @author (Ryder Cook)
 * @version (3/30/2020)
 */

public class Master extends Student
{
    private int level;
    
    public Master()
    {
        super();
        level = 2;
    }
    
    //Initial level of student
    public Master(String initialName, 
    int initialStudentNumber, int initialLevel)
    {
        super(initialName, initialStudentNumber);
        //Checks 1 <= initialLevel <= 4
        setLevel(initialLevel);
    }
    
    //Sets the level
    public void setLevel(int newLevel)
    {
        if((1 <= newLevel) && (newLevel <= 4))
            level = newLevel;
        else
        {
            System.out.println("Illegal Level!");
            System.exit(0);
        }
    }
    
    //Gets and returns level
    public int getLevel()
    {
        return level;
    }
    
    //Outputs the student level
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Student Level: " + level);
    }
}
