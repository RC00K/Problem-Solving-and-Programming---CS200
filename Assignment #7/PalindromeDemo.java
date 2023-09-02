 /**
 * PalindromeDemo
 * Palindrome Demo program class. 
 * @author (Ryder Cook)
 * @version (3/5/2020)
 */
import java.util.*;

public class PalindromeDemo
{
    public static final int MAX_CHARS = 80;
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Palindrome test = new Palindrome();
        
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
            if(test.palindrome(phrase))
                System.out.println("YES, the phrase is a palindrome!");
                else
                    System.out.println("NO, the phrase is NOT a palindrome.");
        }
    }
}
