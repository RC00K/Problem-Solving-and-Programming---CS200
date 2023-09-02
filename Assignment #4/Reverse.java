/**
 * Reverse
 * Reverse
 * @author (Ryder Cook)
 * @version (2/4/2020)
 */
import java.util.Scanner;

public class Reverse
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the word to be tested.");  
        System.out.println("Enter quit to end.");
        
        String word = input.nextLine();
        
        word = word.toLowerCase();
        
        while(!word.equals("quit"))
        {
            word = word.toLowerCase();
            
            String word1 = "";
            
            int size = word.length();
            
            for(int i = 1; i<size; i++)
            {
                char c = word.charAt(i);
                word1 += c;
            }
            
            char c1 = word.charAt(0);
            
            word1 += c1;
            
            System.out.println("The word after the move: " + word1);
            
            int i = 0, count = 0;
            int w = 0, w1 = size-1;
            
            while(i < size)
            {
                if(word.charAt(w) == word1.charAt(w1))
                count++;
                w++;
                w1--;
                i++;
            }
            
            if(count == size)
            System.out.println("If the word " + word + " is spelt backwards, we will get the original word.");
            
            else
            System.out.println("If the word " + word + " is spelt backwards, we will not get the original word.");
            
            System.out.println("\nEnter the word to be tested.");  
            System.out.println("Enter quit to end.");
            
            word = input.nextLine();
        }
            System.out.println("END");
   }
}
