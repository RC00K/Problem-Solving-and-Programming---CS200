 /**
 * Password
 * Stores a PIN number, and then outputs random digits
 * from 0 to 9 to the user.
 * @author (Ryder Cook)
 * @version (3/10/2020)
 */
import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in); 
        
        int[] password = {5,4,4,4,3};
        int value;
        
        int[] random = new int[10];
        
        int[] user_pin = new int[5];
        
        int[] tens = {10000,1000,100,10};
        
        boolean success = true;
        
        for(int i = 0; i < 10; i++)
            random[i] = (int)(Math.random() * 3) + 1;
                System.out.println("");
                System.out.println("Enter 3 random digits.");   
                System.out.println("PIN: 0 1 2 3 4 5 6 7 8 9");
                System.out.print("NUM: ");
        
        for(int i = 0; i < 10; i++)
            System.out.print(random[i] +" ");
            System.out.println();
            System.out.println("Please enter your password.");
            value = reader.nextInt();
            
            user_pin[0] = value/10000;
            user_pin[4] = value%10;
            
        for(int i = 1; i <= 3; i++)
            user_pin[i] = (value/tens[i])%10;
                
        for(int i = 0; i < 5; i++)
        {
            if(user_pin[i] != random[password[i]])
                success = false;
        }

        if(success)
            System.out.println("Password is valid!");
            else
            System.out.println("ERROR: Invalid Password");
    }
}
