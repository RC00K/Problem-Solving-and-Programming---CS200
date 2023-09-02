/**
 * Favorites 
 * Users Favorites
 * @author (Ryder Cook)
 * @version (1/21/20)
 */
import java.util.*;
import java.awt.Font; 

public class Favorites
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your favorite color: ");
        String color = keyboard.nextLine();
        
        System.out.println("Enter your favorite food: ");
        String food = keyboard.nextLine();
        
        System.out.println("Enter your favorite animal: ");
        String animal = keyboard.nextLine();
        
        System.out.println("Enter the first name of a friend or relative: ");
        String name = keyboard.nextLine();
        
        System.out.println("I had a dream that " + name + " ate a " + color + " " + animal + " and said it tasted like " + food + "!");
        
    }
}
