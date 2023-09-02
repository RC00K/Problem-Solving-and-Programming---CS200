/**
 * StringWorkOut
 * String Work Out
 * @author (Ryder Cook)
 * @version (1/30/2020)
 */
import java.util.*;
import java.io.*;

public class StringWorkOut {
    public static void main(String args[])
    {   
        String firstString, secondString;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Let's compare the length of two strings.");
        System.out.println("Enter the first line. ");
        firstString = keyboard.nextLine();
        
        System.out.println("Enter the second line. ");
        secondString = keyboard.nextLine();
        
        if (firstString.length() < secondString.length())
        {
            System.out.println("\"" + secondString + "\" is " + secondString.length() + " characters log while \"" + firstString + " longer than " + firstString.length());
            
            System.out.println("So \"" + secondString + "\" is longer than \"" + firstString + "\"");
        }
        else
        {
            System.out.println("\"" + firstString + "\" is " + firstString.length() + " characters log while \"" + secondString + " longer than " + secondString.length());
            
            System.out.println("So \"" + firstString + "\" is longer than \"" + secondString + "\"");
        }
    }
}

