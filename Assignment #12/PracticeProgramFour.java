
/**
 * PracticeProgramFour
 * Calculates the min and max grade and 
 * @author (Ryder Cook)
 * @version (4/27/2020)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeProgramFour
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
    
        //Reads integer grade
        int grade = 0;
        int maximum = 0;
        int minimum = 0;
        int gradeCount = 0;
   
        double sumOfGrades = 0;
    
        //Object class for Array List to store integer elements
        ArrayList<Integer> grades = new ArrayList<Integer>();
        System.out.println("Enter grade value and enter -1 to stop reading.");
    
        //Enter grades
        grade = keyboard.nextInt();
    
        if(grade!=-1)
        {
            minimum = grade;
            maximum = grade;
        }
        
        while(grade!=-1)
        {
            gradeCount = gradeCount + 1;
            grades.add(grade);
            System.out.println("Enter grade value and enter -1 to stop reading.");
        
            //Enter grades
            grade = keyboard.nextInt();
        }
    
        for(int index = 0; index < grades.size(); index++)
        {   //Finds maximum grade
            if(grades.get(index) > maximum)
                maximum = grades.get(index);
                //Find minimum grade
                if(grades.get(index) < minimum)
                    minimum = grades.get(index);
                    //Sum of grades
                    sumOfGrades += grades.get(index);
        }
    
        if(gradeCount!=0)
        {   //Prints out minimum and maximum grade
            System.out.println("Minimum Grade: " + minimum);
            System.out.println("Maximum Grade: " + maximum);
            //Calculates average grade
            System.out.println("Average Grade: " + sumOfGrades/gradeCount);
        }
    }
}
