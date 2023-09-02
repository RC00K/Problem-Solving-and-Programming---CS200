/**
 * PolymorphismDemo
 * This program will demonstrate the implementation of all
 * classes and generate a report from an array.
 * @author (Ryder Cook)
 * @version (3/30/2020)
 */

import java.util.*;

public class PolymorphismDemo
{
    public static void main(String[] args)
    {
        System.out.println("Do you have a masters degree?"); 
        System.out.println("Enter 1 for YES or 2 for NO");
        
        Scanner keyboard = new Scanner(System.in);
        
        int valid = keyboard.nextInt();
        
        if(valid == 1)
        {
            System.out.println("*Students and Workers Information*");
            System.out.println();
            
            Person[] people = new Person[12];
        
            people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
            people[1] = new Undergraduate("Kick, Anita", 9931, 2);
            people[2] = new Undergraduate("Bugg, June", 9901, 4);
         
            people[3] = new Doctorial("Doctorial", "Jobs, Steve", 56);
            
            people[4] = new Master("Belkin, Polly", 2468, 2);
            
            people[5] = new Student("DeBanque, Robin", 8812);
        
            people[6] = new Faculty(3056, "Mock, Kenrick", "Computer Science", "Professor of Computer Science");
            
            people[7] = new Staff(1551, "Jones, James", "Mathematical Science", 15);
            people[8] = new Staff(799, "Gosling, Jim", "Computer Science", 15);
            people[9] = new Staff(899, "Pure, Bill", "Computer Science", 5);
            
            people[10] = new Employee(1001, "Genn, Sue", "Professor of English Language");
            
            people[11] = new Internship("Intern", "Cook, Ryder", 21);
            
            
            for(Person p:people)
            {
            p.writeOutput();
            System.out.println();
            }
        }
        else if(valid >= 2)
        {
            System.out.println("*YOU DON'T HAVE PERMISSION TO VIEW INFORMATION*");
        }
    }
}
