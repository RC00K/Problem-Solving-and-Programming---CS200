/**
 * Square
 * Squares a value
 * @author (Ryder Cook)
 * @version (1/21/20)
 */
import java.util.*;

public class Square
{
   public static void main(String[] args)
    {
        System.out.println("This program will show the results of the square.");
        
        Scanner keyboard = new Scanner(System.in);
        int num1;
        int sum;
        
        System.out.println("Please enter an integer value: ");
        
        num1 = keyboard.nextInt();
        sum = num1 * num1;
        
        System.out.println("Your number " + num1 + " Squared is " + sum);
        
    }
}
