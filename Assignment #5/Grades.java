/**
 * Grades
 * Grading program for instructor
 * @author (Ryder Cook)
 * @version (2/11/2020)
 */

import java.util.Scanner;

public class Grades
{
        Scanner input = new Scanner(System.in);
        
        final double FINAL_EXAM_PERCENTAGE = 0.5;
        
        final double MID_EXAM_PERCENTAGE = 0.25;
        
        final double QUIZZES_PERCENTAGE = 0.25;
        
        double quiz1 = 0;
        
        double quiz2 = 0;
        
        double midterm = 0;
        
        double finalexam = 0;
        
        double finalgrade;
        
        char lettergrade;
        
        private String name;

        public void setquiz1(double q1)
        {
            quiz1 = q1;
        }
        
        public void setquiz2(double q2)
        {
            quiz2 = q2;
        }
        
        
        public void setmidterm(double mt)
        {
            midterm = mt;
        }
        
        public void setfinalexam(double fe)
        {
            finalexam = fe;
        }
        
        public double getquiz1()
        {
            return quiz1;
        }
        
        public double getquiz2()
        {
            return quiz2;
        }
        
        public double getmidterm()
        {
            return midterm;
        }
        
        public double getfinalexam()
        {
            return finalexam;
        }
        
        public void studentdetails()
        {
        System.out.println("Enter The Student Name: ");
        name = input.nextLine();
        
        System.out.println("Enter Quiz 1 Grade - Points Possible 10");
        quiz1 = input.nextDouble();
        
        System.out.println("Enter Quiz 2 Grade - Points Possible 10");
        quiz2 = input.nextDouble();
        
        System.out.println("Enter Midterm Exam Grade - Points Possible 100");
        midterm = input.nextDouble();
        
        System.out.println("Enter Final Exam Grade - Points Possible 100");
        finalexam = input.nextDouble();
        }
        
        public void finalgrade()
        {
            finalgrade = (finalexam * FINAL_EXAM_PERCENTAGE) + (midterm * MID_EXAM_PERCENTAGE) + ((quiz1 + quiz2) * 5 * QUIZZES_PERCENTAGE);
        }
        
        public void lettergrade()
        {
            if(finalgrade >= 90)
            {
                lettergrade = 'A';
            }
            else if(finalgrade >= 80 && finalgrade <= 89)
            {
                lettergrade = 'B';
            }
            else if(finalgrade >= 70 && finalgrade <= 79)
            {
                lettergrade = 'C';
            }
            else if(finalgrade >= 60 && finalgrade <= 69)
            {
                lettergrade = 'D';
            }
            else if(finalgrade < 60)
            {
                lettergrade = 'F';
            }
        }
        
        public void displaystudentdetails()
        {
            System.out.println("Student name: " + name);
            
            System.out.printf("Quiz 1 Grade: %.2f" , quiz1);
            System.out.println();
            
            System.out.printf("Quiz 2 Grade: %.2f" , quiz2);
            System.out.println();
            
            System.out.printf("Midterm Exam Grade: %.2f" , midterm);
            System.out.println();
            
            System.out.printf("Final Exam Grade: %.2f" , finalexam);
            System.out.println();
            
            System.out.printf("Final Grade: %.2f%%" , finalgrade);
            System.out.println();
            
            System.out.printf("Final Letter Grade: " + lettergrade);
            System.out.println();
        }
        
}
