/**
 * Positive
 * Positive numbers
 * @author (Ryder Cook)
 * @version (1/23/2020)
 */
import java.util.*;

public class Positive
{
public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int number;
        
        System.out.println("This program tells the user the value of an integer");
        System.out.println("Enter the integer: ");
        number = keyboard.nextInt();
        
        if(number < 0)
            System.out.println("Your number is negative.");
        else if(number ==0)
            System.out.println("Your number is zero.");
        else
            System.out.println("Your number is positive.");
        
    }
}

