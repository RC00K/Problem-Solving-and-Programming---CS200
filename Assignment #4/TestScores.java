/**
 * TestScores
 * This program will calculate to total number of grades and
 * show the total number of A's, B's, C's, D's, and F's from the grades entered.
 * @author (Ryder Cook)
 * @version (2/4/2020)
 */
import java.util.*;

public class TestScores
{
   public static void main(String[] args)
   {
        Scanner input = new Scanner(System.in);
        
        int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0, count = 0;

        System.out.println("Enter Your Exam Grades (1-100)");
        System.out.println("Enter A Negative Score To End");
        
        int num = input.nextInt();
        
        while(num > 0)
        {
            if(num >= 90 && num <= 100)
                gradeA++;
            
            else if(num >= 80 && num <= 89)
                gradeB++;
            
            else if(num >= 70 && num <= 79)
                gradeC++;
                
            else if(num >= 60 && num <= 69)
                gradeD++;
            
            else if(num >= 0 && num <= 59)
                gradeF++;
                
                count++;
                
                num = input.nextInt();
        }
        
        System.out.println("Total number of grades = " + count);
        System.out.println("Number of A's = " + gradeA);
        System.out.println("Number of B's = " + gradeB);
        System.out.println("Number of C's = " + gradeC);
        System.out.println("Number of D's = " + gradeD);
        System.out.println("Number of F's = " + gradeF);
   }
}
