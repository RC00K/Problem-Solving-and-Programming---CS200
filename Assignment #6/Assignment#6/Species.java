/**
* Species
* Endangered Species
* @author (Ryder Cook)
* @version (2/20/2020)
*/
import java.util.Scanner;
    
public class Species
{
        private String name;
        private int population;
        private double growthRate;
        
        Species()
        {
            name = "not set";
            population = 0;
            growthRate = 0.0;
        }
        
        //Species Name
        Species(String name)
        {
            this.name = name;
            population = 0;
            growthRate = 0.0;
        }
        
        //Species Population
        Species(int population)
        {
            this.name = "not set";
            this.population = population;
            growthRate = 0.0;
        }
        
        //Species Growth Rate
        Species(double growthRate)
        {
            name = "not set";
            population = 0;
            this.growthRate = growthRate;
        }
        
        //Set Name
        public void set(String name)
        {
            this.name = name;
        }
        
        //Set Population
        public void set(int population)
        {
            this.population = population;
        }
        
        //Set Growth Rate
        public void set(double growthRate)
        {
            this.growthRate = growthRate;
        }
        
        //Set Species
        public void setSpecies(String newName, int newPopulation, double newGrowthRate)
        {
            name = newName;
            if(newPopulation >= 0)
                population = newPopulation;
            else
            {
                System.out.println("ERROR: using a negative population.");
                System.exit(0);
            }
            growthRate = growthRate;
        }
        
        //Read Input
        public void readInput()
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("What is the species' name?");
            name = keyboard.nextLine();
            
            System.out.println("What is the population of the species?");
            population = keyboard.nextInt();
            while(population < 0)
            {
                System.out.println("Population cannont be negative.");
                System.out.println("Reenter population: ");
                population = keyboard.nextInt();
            }
            System.out.println("Enter growth rate (% increase per year): ");
            growthRate = keyboard.nextInt();
        }
        
        //Write Output
        public void writeOutput()
        {
            System.out.println("Name = " + name);
            System.out.println("Population = " + population);
            System.out.println("Growth rate = " + growthRate + "%");
        }
        
        //Precondition: years is a nonnegative number.
        //Returns projected population of the receiving object
        //After the specified number of years.
        public int predictPopulation(int years)
        {
            int result = 0;
            double populationAmount = population;
            int count = years;
            while((count > 0) && (populationAmount > 0))
            {
                populationAmount = (populationAmount + 
                                   (growthRate / 100) * populationAmount);                
                
                count--;
            }
            if(populationAmount > 0)
                result = (int)populationAmount;
            return result;
    }
    
    //Get Name
    public String getName()
    {
        return name;
    }
    
    //Get Population
    public int getPopulation()
    {
        return population;
    }
    
    //Get Growth Rate
    public double getGrowthRate()
    {
        return growthRate;
    }
    
    public boolean equals(Species otherObject)
    {
        return(name.equalsIgnoreCase(otherObject.name)) && 
              (population == otherObject.population) && 
              (growthRate == otherObject.growthRate);
    }
}
