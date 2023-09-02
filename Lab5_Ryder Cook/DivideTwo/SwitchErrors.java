/**
 * SwitchErrors
 * Switch Errors
 * @author (Ryder Cook)
 * @version (1/23/2020)
 */
import java.util.*;

public class SwitchErrors
    {
        public static void main(String[] args)
        {
               Scanner keyboard = new Scanner(System.in);
               System.out.println("Key: 1=blue, 2=red, 3=green");
               System.out.print("Enter a number and I'll return ");
               System.out.print(" the corresponding color. ");
               int number = keyboard.nextInt();
               switch(number)
               {
                   case 1:
                   System.out.println("You choose blue!");
                   break;
                   case 2:
                   System.out.println("You choose red!");
                   break;
                   case 3:
                   System.out.println("You choose green!");
                   break;
                   default:
                   System.out.println("Color not available!");
                   break;
                }
        }
    }


