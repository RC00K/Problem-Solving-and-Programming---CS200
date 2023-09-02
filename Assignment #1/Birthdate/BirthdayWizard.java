/**
 * BirthdayWizard
 * Birthday Wizard
 * @author (Ryder Cook)
 * @version (1/15/2020)
 */
import java.util.*;
import java.util.Calendar;
public class BirthdayWizard
{
    public static void main(String[] args)
    {
        String name;
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        Calendar now = Calendar.getInstance();
        
        //Asks user for the month they were born
        System.out.println("Enter the month you were born");
        int month = keyboard.nextInt();
        
        //Asks user for the day they were born
        System.out.println("Enter the day you were born");
        int birthday = keyboard.nextInt();
        
        //Asks user for their age
        System.out.println("Enter your age");
        int age = keyboard.nextInt();
        
        //Tells user their age on certain year
        System.out.println("You will turn " + (age + 1) + " on " + month + "-" + birthday + "-" + (now.get(Calendar.YEAR) + 1));
    }
}
