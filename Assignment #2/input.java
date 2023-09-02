/**
 * PracticeProgram6
 * Practice program number 6
 * @author (Ryder Cook)
 * @version (1/21/20)
 */
import java.util.Scanner;

public class input
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        String name;
        System.out.println("Enter your age.");
        age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter your full name.");
        name = keyboard.nextLine();
        name = name.toUpperCase();
        name = name.substring(0,1).toUpperCase() + name.substring(1);
        System.out.println("Your name in uppercase is " + name + " and you are " + age + " years old.");
        
    }
}
