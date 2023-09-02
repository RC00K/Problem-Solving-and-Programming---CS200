
/**
 * StringDemo
 * Displays length of string
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class StringDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String input;
        
        System.out.print("Enter a string: ");
        input = keyboard.next();
        
        System.out.println("You entered: " + input);
        
        int num1 = input.length();
        System.out.println("The length of the string was " + num1 + " Character long.");
    }
}
