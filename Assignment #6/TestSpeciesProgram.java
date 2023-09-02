/**
* TestSpeciesProgram
* Program for Endangered Species.
* @author (Ryder Cook)
* @version (2/20/2020)
*/

public class TestSpeciesProgram
{
    public static void main(String[] args)
    {
        //Test Case 1
        Species s1 = new Species("Klingon ox");
        s1.set(100);
        s1.set(10.0);
        
        Species s2 = new Species("Elephant");
        s2.set(10);
        s2.set(35.0);
        
        int year = 0;
        
        //Get species 1 and species 2
        if(s1.getPopulation() < s2.getPopulation())
        {
            while(s1.getPopulation() < s2.getPopulation())
            {
                s1.set((int) (s1.getPopulation() + (s1.getPopulation() * 
                             (s1.getGrowthRate() / 100))));
                
                s2.set((int) (s2.getPopulation() + (s2.getPopulation() * 
                             (s2.getGrowthRate() / 100))));
            }
                System.out.println("The population of " + s1.getName() + 
                                   " is exceeded by the population of " + 
                                   s2.getName() + " in " + year + "years");
            }
            else
            {
            while(s1.getPopulation() > s2.getPopulation())
            {
                s1.set((int) (s1.getPopulation() + (s1.getPopulation() * 
                             (s2.getGrowthRate() / 100))));
            
                year++;
            }
                System.out.println("The population of " + s2.getName() + 
                                   " is exceeded by the population of " + 
                                   s1.getName() + " in " + year + "years");
        }
        
        //Test Case 2
        Species s3 = new Species("Fish");
        s3.set(10);
        s3.set(10.0);
        
        Species s4 = new Species("Lizard");
        s4.set(10);
        s4.set(12.0);
        
        //Get species 3 and species 4
        if(s3.getPopulation() < s4.getPopulation())
        {
            while(s1.getPopulation() < s2.getPopulation())
            {
                s3.set((int) (s3.getPopulation() + (s3.getPopulation() * 
                             (s3.getGrowthRate() / 100))));
                
                s4.set((int) (s4.getPopulation() + (s4.getPopulation() * 
                             (s4.getGrowthRate() / 100))));
            }
                System.out.println("The population of " + s3.getName() + 
                                   " is exceeded by the population of " + 
                                   s4.getName() + " in " + year + "years");
            }
            else
            {
            while(s3.getPopulation() > s4.getPopulation())
            {
                s3.set((int) (s3.getPopulation() + (s3.getPopulation() * 
                             (s4.getGrowthRate() / 100))));
            
                year++;
            }
                System.out.println("The population of " + s4.getName() + 
                                   " is exceeded by the population of " + 
                                   s3.getName() + " in " + year + "years");
        }
        
        //Test Case 3
        Species s5 = new Species("Bird");
        s5.set(12);
        s5.set(15.0);
        
        Species s6 = new Species("Duck");
        s6.set(52);
        s6.set(43.0);
        
        //Get species 5 and species 6
        if(s5.getPopulation() < s6.getPopulation())
        {
            while(s5.getPopulation() < s6.getPopulation())
            {
                s5.set((int) (s5.getPopulation() + (s5.getPopulation() * 
                             (s5.getGrowthRate() / 100))));
                
                s6.set((int) (s6.getPopulation() + (s6.getPopulation() * 
                             (s6.getGrowthRate() / 100))));
            }
                System.out.println("The population of " + s5.getName() + 
                                   " is exceeded by the population of " + 
                                   s6.getName() + " in " + year + "years");
            }
            else
            {
            while(s5.getPopulation() > s6.getPopulation())
            {
                s5.set((int) (s5.getPopulation() + (s5.getPopulation() * 
                             (s6.getGrowthRate() / 100))));
            
                year++;
            }
                System.out.println("The population of " + s6.getName() + 
                                   " is exceeded by the population of " + 
                                   s5.getName() + " in " + year + "years");
        }
        
        //Test Case 4
        Species s7 = new Species("Bird");
        s7.set(12);
        s7.set(15.0);
        
        Species s8 = new Species("Duck");
        s8.set(52);
        s8.set(43.0);
        
        //Get species 7 and species 8
        if(s7.getPopulation() < s8.getPopulation())
        {
            while(s7.getPopulation() < s8.getPopulation())
            {
                s7.set((int) (s7.getPopulation() + (s7.getPopulation() * 
                             (s7.getGrowthRate() / 100))));
                
                s8.set((int) (s8.getPopulation() + (s8.getPopulation() * 
                             (s8.getGrowthRate() / 100))));
            }
                System.out.println("The population of " + s7.getName() + 
                                   " is exceeded by the population of " + 
                                   s8.getName() + " in " + year + "years");
            }
            else
            {
            while(s7.getPopulation() > s8.getPopulation())
            {
                s7.set((int) (s7.getPopulation() + (s7.getPopulation() * 
                             (s8.getGrowthRate() / 100))));
            
                year++;
            }
                System.out.println("The population of " + s8.getName() + 
                                   " is exceeded by the population of " + 
                                   s7.getName() + " in " + year + "years");
        }
        
        //Test Case 5
        Species s9 = new Species("Fox");
        s9.set(32);
        s9.set(23.4);
        
        Species s10 = new Species("Lion");
        s10.set(52);
        s10.set(43.0);
        
        //Get species 9 and species 10
        if(s9.getPopulation() < s10.getPopulation())
        {
            while(s9.getPopulation() < s10.getPopulation())
            {
                s9.set((int) (s9.getPopulation() + (s9.getPopulation() * 
                             (s9.getGrowthRate() / 100))));
                
                s10.set((int) (s10.getPopulation() + (s10.getPopulation() * 
                             (s10.getGrowthRate() / 100))));
            }
                System.out.println("The population of " + s9.getName() + 
                                   " is exceeded by the population of " + 
                                   s10.getName() + " in " + year + "years");
            }
            else
            {
            while(s9.getPopulation() > s10.getPopulation())
            {
                s9.set((int) (s9.getPopulation() + (s9.getPopulation() * 
                             (s10.getGrowthRate() / 100))));
            
                year++;
            }
                System.out.println("The population of " + s10.getName() + 
                                   " is exceeded by the population of " + 
                                   s9.getName() + " in " + year + "years");
        }
        
        //Test Case 6
        Species s11 = new Species("Bird");
        s11.set(43);
        s11.set(15.3);
        
        Species s12 = new Species("Duck");
        s12.set(52);
        s12.set(43.0);
        
        //Get species 11 and species 12
        if(s11.getPopulation() < s12.getPopulation())
        {
            while(s11.getPopulation() < s12.getPopulation())
            {
                s11.set((int) (s11.getPopulation() + (s11.getPopulation() * 
                             (s11.getGrowthRate() / 100))));
                
                s12.set((int) (s12.getPopulation() + (s12.getPopulation() * 
                             (s12.getGrowthRate() / 100))));
            }
                System.out.println("The population of " + s11.getName() + 
                                   " is exceeded by the population of " + 
                                   s12.getName() + " in " + year + "years");
            }
            else
            {
            while(s11.getPopulation() > s12.getPopulation())
            {
                s11.set((int) (s11.getPopulation() + (s11.getPopulation() * 
                             (s12.getGrowthRate() / 100))));
            
                year++;
            }
                System.out.println("The population of " + s12.getName() + 
                                   " is exceeded by the population of " + 
                                   s11.getName() + " in " + year + "years");
        }
        
        //Test Case 7
        Species s13 = new Species("Snail");
        s13.set(12);
        s13.set(15.0);
        
        Species s14 = new Species("Snake");
        s14.set(52);
        s14.set(43.0);
        
        //Get species 13 and species 14
        if(s13.getPopulation() < s14.getPopulation())
        {
            while(s13.getPopulation() < s14.getPopulation())
            {
                s13.set((int) (s13.getPopulation() + (s13.getPopulation() * 
                             (s13.getGrowthRate() / 100))));
                
                s14.set((int) (s14.getPopulation() + (s14.getPopulation() * 
                             (s14.getGrowthRate() / 100))));
            }
                System.out.println("The population of " + s13.getName() + 
                                   " is exceeded by the population of " + 
                                   s14.getName() + " in " + year + "years");
            }
            else
            {
            while(s13.getPopulation() > s14.getPopulation())
            {
                s13.set((int) (s13.getPopulation() + (s13.getPopulation() * 
                             (s14.getGrowthRate() / 100))));
            
                year++;
            }
                System.out.println("The population of " + s14.getName() + 
                                   " is exceeded by the population of " + 
                                   s13.getName() + " in " + year + "years");
        }
    }  
}