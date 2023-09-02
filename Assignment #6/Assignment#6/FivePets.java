/**
 * Pet
 * Class for five pets.
 * @author (Ryder Cook)
 * @version (2/25/2020)
 */
import java.util.Scanner;

public class FivePets
{
    private static final int MAX_PETS = 5;
    
    private static String petName;
    
    private static int petAge;
    
    private static double petWeight;
    
    private static String smallestPet;
    
    private static String largestPet;
    
    private static String oldestPet;
    
    private static String youngestPet;
    
    private static int oldAge;
    
    private static int youngAge;
    
    private static double smallWeight;
    
    private static double largeWeight;
    
    private static int ageSum;
    
    private static double weightSum;
    
    private static double ageAverage;
    
    private static double weightAverage;
    
    private static Scanner input;
    
    public static void main(String[] args)
    {
        input = new Scanner(System.in);
        
        getData(0);
        
        Pet pet = new Pet(petName, petAge, petWeight);
        
        smallestPet = pet.getName();
        
        largestPet = pet.getName();
        
        oldestPet = pet.getName();
        
        youngestPet = pet.getName();
        
        ageSum = pet.getAge();
        
        youngAge = pet.getAge();
        
        smallWeight = pet.getWeight();
        
        largeWeight = pet.getWeight();
        
        for(int i = 1; i < MAX_PETS; i++)
        {
            getData(i);
            
            pet = new Pet(petName, petAge, petWeight);
            
            findDetails(pet);
        }
        
        findAverageAge();
        
        findAverageWeight();
        
        displayDetails();
    }
    
    private static void getData(int i)
    {
        System.out.println("Enter data for pet" + (i + 1) + ":");
        {
            System.out.print("Name of pet" + (i + 1) + ":");
            
            petName = input.next();
            
            System.out.print("Age of pet" + (i + 1) + ":");
            
            petAge = input.nextInt();
            
            System.out.print("Weight of pet" + (i + 1) + ":");
            
            petWeight = input.nextDouble();
            
            System.out.println();
        }
    }
        
    private static void findDetails(Pet pet)
    {
        if(pet.getAge() < youngAge)
        {
            youngestPet = pet.getName();
        
            youngAge = pet.getAge();
        }
            
        else if(pet.getAge() > oldAge)
        {
            oldestPet = pet.getName();
                
            oldAge = pet.getAge();
        }
            
        if(pet.getWeight() < smallWeight)
        {
            smallestPet = pet.getName();
                
            smallWeight = pet.getWeight();
        }
            
        else if(pet.getAge() > largeWeight)
        {
            largestPet = pet.getName();
                
            largeWeight = pet.getWeight();
        }
            
        ageSum += pet.getAge();
            
        weightSum += pet.getWeight();
    }    
    
    private static void findAverageAge()
    {
        ageAverage = ((double) ageSum) / MAX_PETS;
    }
    
    private static void findAverageWeight()
    {
        weightAverage = weightSum / MAX_PETS;
    }
    
    private static void displayDetails()
    {
        System.out.println("Name of the smallest pet:" + smallestPet);
        
        System.out.println("Name of the largest pet:" + largestPet);
        
        System.out.println("Name of the oldest pet:" + oldestPet);
        
        System.out.println("Name of the youngest pet:" + youngestPet);
        
        System.out.println("Average weight of the five" + " pets:" + weightAverage);
        
        System.out.println("Average age of the five" + " pets:" + ageAverage);
    }
}
