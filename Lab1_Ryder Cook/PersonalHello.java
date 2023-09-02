/**
 * PersonalHello
 * Hello World
 * @author (Ryder Cook)
 * @version (1/14/2020)
 */
import java.util.*;
public class PersonalHello
{
    public static void main(String[] args)
    {
        String name;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is your name?");
        name = keyboard.nextLine();
        
        System.out.println("Welcome to Computer Programming!");
        System.out.println(name + "!");
    }
}
