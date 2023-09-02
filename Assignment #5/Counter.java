/**
 * Counter Version #1
 * This program will count numbers.
 * @author (Ryder Cook)
 * @version (2/11/2020)
 */

import java.util.Scanner;

public class Counter
{
    public int count;
    
    Scanner input = new Scanner(System.in);
    
    public Counter()
    {
        count = 0;
    }
    
    public void currentcount(int count)
    {
        System.out.println("Current Count " + count);
    }
    
    public void read()
    {
        System.out.println("This program will count positive whole numbers.");
        
        System.out.println("The program will exit if a non positive whole number is entered.");
        while(true)
        {
        System.out.println("Enter Number: ");
        
        int num = input.nextInt();
        
            if(num > 0)
            {   
                count++;
                currentcount(count);
            }else
            {
                System.out.println("That was not a positive whole number.");
                System.out.println("Good Bye!");
                break;
            }
        }
    }    
}
