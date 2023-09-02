/**
 * Ordered
 * This application will read three strings from the keyboard
 * and then display the string that would be second if they were in lexicographic order.
 * @author (Ryder Cook)
 * @version (1/28/2020)
 */
import java.util.Scanner;


public class Ordered
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Ordered");
        System.out.println("Please enter three strings and I will put them in lexicographic order ");
        System.out.println("and show the string that's in the middle.");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String firstString = keyboard.nextLine();
        
        System.out.print("Enter the second string: ");
        String secondString = keyboard.nextLine();
        
        System.out.print("Enter the third string: ");
        String thirdString = keyboard.nextLine();
        
        System.out.print("The string in the middle in lexicographic order is: ");
        if(firstString.compareToIgnoreCase (secondString) > 0 
                && 
           firstString.compareToIgnoreCase (thirdString) < 0)
           {
               System.out.print(firstString);
           }
           else if(firstString.compareToIgnoreCase (thirdString) > 0 
                && firstString.compareToIgnoreCase (secondString) < 0) {
                    System.out.print(firstString);
                }
                
        if(secondString.compareToIgnoreCase (firstString) > 0 
                && 
           secondString.compareToIgnoreCase (thirdString) < 0)
           {
               System.out.print(secondString);
           }
           else if(secondString.compareToIgnoreCase (thirdString) > 0 
                && secondString.compareToIgnoreCase (firstString) < 0) {
                    System.out.print(secondString);
                }  
        
        if(thirdString.compareToIgnoreCase (firstString) > 0 
                && 
           thirdString.compareToIgnoreCase (secondString) < 0)
           {
               System.out.print(thirdString);
           }
           else if(thirdString.compareToIgnoreCase (secondString) > 0 
                && thirdString.compareToIgnoreCase (firstString) < 0) {
                    System.out.print(thirdString);
                }  
    }
}