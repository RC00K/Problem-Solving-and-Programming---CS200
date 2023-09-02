/**
 * Response2
 * This application will responed to use input.
 * @author (Ryder Cook)
 * @version (1/28/20)
 */
import java.util.Scanner;

public class Response2
{
    public static void main(String[] args)
    {
        String line;
        String answer;
        
        Scanner scanner = new Scanner(System.in);
        
        do
        {
            System.out.print("Please Enter A Sentence: ");
            
            line = scanner.nextLine();
            
            if(line.endsWith("?") && line.length()%2 == 0)
            {
                System.out.println("Yes");
            }
            else if(line.endsWith("?") && line.length()%2 != 0)
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
            
            System.out.println("Would you like to continue?");
            System.out.println("Enter yes or no");
            
            answer = scanner.nextLine();
        }while(answer.equalsIgnoreCase("yes"));
    }
}