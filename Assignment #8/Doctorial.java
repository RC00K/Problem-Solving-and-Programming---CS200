 /**
 * Doctorial
 * Doctorial class has the information and 
 * age of person with doctorial
 * @author (Ryder Cook)
 * @version (3/30/2020)
 */

public class Doctorial extends Master
{
    private int docAge;
    private String docTitle;
    
    public Doctorial()
    {
        super();
        docAge = 0;
    }
    
    public Doctorial(String docTitle, String initialName, int initialDocAge)
    {
        setName(initialName);
        setDocAge(initialDocAge);
        setTitle(docTitle);
    }
    
    //Set the doc number
    public void setDocAge(int newDocAge)
    {
        docAge = newDocAge;
    }
    
    //Get doc number
    public int getDocAge()
    {
        return docAge;
    }
    
    //Sets the doc title
    public void setTitle(String docTitle)
    {
        this.docTitle = docTitle;
    }
    
    //Gets and returns doc title
    public String getTitle()
    {
        return docTitle;
    }
    
    //Write student details
    public void writeOutput()
    {
        System.out.println("Name: " + getName());
        System.out.println("Student Age: " + docAge);
        System.out.println("Student Title: " + docTitle);
    }
    
    
    public String toString()
    {
        return "Name: " + getName() + "\nStudent Age: " + docAge + "Student Title: " + docTitle;
    }
}
