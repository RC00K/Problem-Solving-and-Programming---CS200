/**
 * CompareStrings
 * Compare Strings
 * @author (Ryder Cook)
 * @version (1/30/2020)
 */
import java.util.*;

public class CompareStrings
{
   public static void main(String args[])
   {
       Scanner keyboard = new Scanner(System.in);
       
       String firstString, secondString, thirdString;
       
       System.out.println("Enter three strings and I will put them in order.");
       System.out.println("Enter the first line. ");
       firstString = keyboard.nextLine();
       
       System.out.println("Enter the second line. ");
       secondString = keyboard.nextLine();
       
       System.out.println("Enter the third line. ");
       thirdString = keyboard.nextLine();
      
       if((firstString.compareTo(secondString)<0) && (firstString.compareTo(thirdString)<0))
       {
           System.out.println("\n" + firstString);
           if(secondString.compareTo(thirdString)<0)
           {
               System.out.println(secondString);
               System.out.println(thirdString);
           }
           else
           {
               System.out.println(thirdString);
               System.out.println(secondString);
           }
       }
       else if((secondString.compareTo(firstString)<0) && (secondString.compareTo(thirdString)<0))
       {
           System.out.println("\n" + secondString);
           if(secondString.compareTo(thirdString)<0)
           {
               System.out.println(firstString);
               System.out.println(thirdString);
           }
           else
           {
               System.out.println(thirdString);
               System.out.println(firstString);
           }
        }
       
        else
       {
           System.out.println("\n" + thirdString);
           if(secondString.compareTo(secondString)<0)
           {
               System.out.println(firstString);
               System.out.println(secondString);
           }
           else
           {
               System.out.println(secondString);
               System.out.println(firstString);
           }
        }
   }
}
