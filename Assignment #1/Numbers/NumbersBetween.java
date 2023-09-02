/**
 * NumbersBetween
 * Numbers Between
 * @author (Ryder Cook)
 * @version (1/15/2020)
 */
import java.util.*;
public class NumbersBetween
{
    public static void main(String[] args)
    {
        String name;
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        
        //Asks user to enter small #
        System.out.println("Enter first integer - SMALL NUMBER");
        int firstInteger = keyboard.nextInt();
        
        //Asks user to enter large #
        System.out.println("Enter second integer - LARGE NUMBER");
        int secondInteger = keyboard.nextInt();
        
        //Outputs the #s between the smaller # and larger #
        System.out.println("The numbers between " + firstInteger + " and " + secondInteger + " are");
        for(int numbers = firstInteger; numbers <= secondInteger; numbers++)
        {
            System.out.println(numbers);
        }
    }
}