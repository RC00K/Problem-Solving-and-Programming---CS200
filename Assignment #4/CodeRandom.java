/**
 * CodeRandom
 * Code Random
 * @author (Ryder Cook)
 * @version (2/4/2020)
 */
import java.util.*;

public class CodeRandom
{
    public static void main(String[] args)
    {
        //Random 5 digit number
        int code = (int)(89999 * Math.random()) + 10000;
    
        //Changing number to string
        String newcode = Integer.toString(code);
    
        System.out.println("Welcome To Secret Code.  Can you guess my code?");
    
        System.out.println("I have a secret 5 digit code.  Please enter a positive 5 digit number as your guess.");
    
        System.out.println("I will then tell you how many numbers you have in correct places and total of those numbers.");
    
        System.out.println("You will then be able to guess again up to 5 times after which you are locked!");
    
        System.out.println(" ");
    
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        int number = 0;
        int counter = 0;
    
        do
        {
            count = 0;
            number = 0;
            counter++;
            System.out.println("Enter guess " + counter);
        
            String guess = keyboard.nextLine();
        
            if(!guess.equals(newcode))
            {
                if(guess.charAt(0) == newcode.charAt(0))
            {
                count = count + 1;
                number = number + Integer.parseInt(guess.substring(0,1));
            }
            
            if(guess.charAt(1) == newcode.charAt(1))
            {
                count = count + 1;
                number = number + Integer.parseInt(guess.substring(1,2));
            }
            
            if(guess.charAt(2) == newcode.charAt(2))
            {
                count = count + 1;
                number = number + Integer.parseInt(guess.substring(2,3));
            }
            
            if(guess.charAt(3) == newcode.charAt(3))
            {
                count = count + 1;
                number = number + Integer.parseInt(guess.substring(3,4));
            }
            
            if(guess.charAt(4) == newcode.charAt(4))
            {
                count = count + 1;
                number = number + Integer.parseInt(guess.substring(4));
            }
            
            if(count > 0)
            {
                System.out.println("You guessed " + count + " numbers correctly.");
                
                System.out.println("The total of those numbers you guessed correctly is " + number);
                
                System.out.println("You have used " + counter + " guesses.");
            }
            else
                System.out.println("Sorry you guessed no numbers correctly.");
            }
            else
            {
                System.out.println("Great job you correctly guessed the code of " + code + ".");
                System.exit(0);
            }
        }while(counter < 5 && count < 5);
        System.out.println("You have run out of guesses and did not guess the correct code.  The correct code was " + newcode);
    }
}

