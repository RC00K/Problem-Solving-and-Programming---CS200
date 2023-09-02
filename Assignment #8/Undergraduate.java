 /**
 * Undergraduate
 * Undergraduate class has information pertaining to student
 * and shows the level of the degree
 * @author (Ryder Cook)
 * @version (3/30/2020)
 */

public class Undergraduate extends Student
{
    private int level;
    
    public Undergraduate()
    {
        super();
        level = 1;
    }
    
    public Undergraduate(String initialName, 
    int initialStudentNumber, int initialLevel)
    {
        super(initialName, initialStudentNumber);
        //Checks 1 <= initialLevel <= 4
        setLevel(initialLevel);
    }
    
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
    
    public int getLevel()
    {
        return level;
    }
    
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Student Level: " + level);
    }
}
