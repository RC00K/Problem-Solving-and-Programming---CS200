 /**
 * Fahrenheit to Celsius
 * Converts Fahrenheit to Celsius
 * @author (Ryder Cook)
 * @version (1/21/20)
 */
import java.util.Scanner;

public class Celsius
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a temperature in degrees Fahrenheit: ");
        
        int temp;
        temp = keyboard.nextInt();
        
        double DegreesF = temp;
        
        double DegreesC = ((5 * (DegreesF -32)) / 9);
        
        System.out.println(temp + " degrees Fahrenheit is " + DegreesC + " degrees Celsius.");
    }
}