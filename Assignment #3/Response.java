/**
 * Response
 * This application will responed to use input.
 * @author (Ryder Cook)
 * @version (1/28/20)
 */
import java.util.*;

public class Response
{
    public static void main(String[] args)
    {
        System.out.println("Please Enter A Sentence");
        
        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        
        if(line.endsWith("?")&&line.length()%2==0)
        
        {
            System.out.println("Yes");
        }
        else if(line.endsWith("?")&&line.length()%2!=0)
        {
            System.out.println("No");
        }
        else if(line.endsWith("!"))
        {
            System.out.println("Wow");
        }
        else
        {
            System.out.println("You always say \"" + line + "\"");
        }
    }
}