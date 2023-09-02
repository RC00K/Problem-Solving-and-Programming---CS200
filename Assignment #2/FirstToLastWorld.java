/**
 * FirstToLastWorld
 * This program will move the first word entered in a line to 
 * the last as well as capitalize
 * the new first letter and lower case the old first letter.
 * @author (Ryder Cook)
 * @version (1/21/20)
 */
import java.util.Scanner;

public class FirstToLastWorld
{
   public static void main(String[] args)
   {
       // Sets up scanner for keyboard input
       Scanner keyboard = new Scanner(System.in);
       
       // First line printed to the screen for keyboard input
       System.out.println("Enter a line of text with a capital first letter - no punctuation, please.");
       
       // Reads in user input
       String sentence = keyboard.nextLine();
       
       String[] words = sentence.split("\\s+");
       
       sentence = sentence.substring(0,1).toLowerCase() + sentence.substring(1);
       
       int endOfFirstWord = sentence.indexOf(" ");
       
       sentence = sentence.substring(endOfFirstWord + 1) + " " + sentence.substring(0, endOfFirstWord);
       
       sentence = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
       
       // Prints a 2nd line to the screen
       System.out.println("I have rephrased that line to read:\n" + sentence);
       
       keyboard.close();
   }
}
