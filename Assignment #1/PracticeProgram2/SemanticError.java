/**
 * PracticeProgram2
 * Calculate volume
 * @author (Ryder Cook)
 * @version (1/16/2020)
 */
import java.util.Scanner;
public class SemanticError
{
    public static void main(String[] args)
    {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        
        System.out.println("Enter the height, width, and depth of");
        System.out.println("a box and I will compute the volume.");
        
        System.out.println("Height");
        int height = keyboard.nextInt();
        
        System.out.println("Width");
        int width = keyboard.nextInt();
        
        System.out.println("Depth");
        int depth = keyboard.nextInt();
        
        int volume = height * width * depth;
        System.out.print("The volume is " + volume);
    }
}
