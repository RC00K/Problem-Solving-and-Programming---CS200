 /**
 * Palindrome
 * Palindrome program class. 
 * @author (Ryder Cook)
 * @version (3/5/2020)
 */
import java.util.*;

public class Palindrome
{
    public static final int MAX_CHARS = 80;
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("This program will test whatever text");
        System.out.println("you enter to see if it is a palindrome");
        System.out.println("(reads the same backwards and forwards).");
        
        System.out.println();
        System.out.println("Enter text (just letters and blanks, please).");
        System.out.println();
        
        String phrase = keyboard.nextLine();
        System.out.println();
        
        //Exit: Too many characters.
        if(phrase.length() > MAX_CHARS)
        {
            System.out.println();
            System.out.println("Too many characters: maximum is 50.");
        }
        else
        {
            if(palindrome(phrase))
                System.out.println("YES, the phrase is a palindrome!");
                else
                    System.out.println("NO, the phrase is NOT a palindrome.");
        }
    }
    
    public static boolean palindrome(String text)
    {
        //Parse: Remove blanks, save letters in array, & count letters.
        //Assumption: The line has only letters and blanks.
        //Seperate counters must be used to cycle through the characters
        // in the original string and to create a new array with just
        // the letters and no white space.
        
        //Index for new array with only letters.
        int letterCount = 0;
        
        //Number of characters in phrase.
        int charCount = text.length();
        
        char[] letter = new char[MAX_CHARS];
        char aChar;
        
        //i counts through chars in original array
        for(int i = 0; i < charCount; i++)
        {
            aChar = text.charAt(i);
            if(!Character.isWhitespace(aChar))
            {
                letter[letterCount] = aChar;
                letterCount++;
            }
        }
        
        //Test for mirror image (palindrome):
        //Start with first and last chars and work inward.
        //If count is odd, the middle char can safely be ignored;
        // using i as the loop control variable, going from i = 0
        // to i < (the truncation of count/2) gets the correct number
        // of comparisons for both an odd and even number of chars.
        //Character array [i] is at one end of the array and
        // character array [count - 1 - i] is at the other, and
        // each increment of i gets the next mirror imaged pair
        // that need to be equal if it is a palindrome.
        
        boolean result = true;
        
        for(int i = 0; i < letterCount/2; i++)
        {
            if(Character.toUpperCase(letter[i]) != 
               Character.toUpperCase(letter[letterCount -1 - i]))
            {
                result = false;
            }
        }
        return(result);
    }
}
