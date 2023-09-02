/**
* TestSpeciesCases
* Endangered Species test class.
* @author (Ryder Cook)
* @version (2/20/2020)
*/

public class TestSpeciesCases
{
    public static void main(String[] args)
    {
        //Test Case 1
        System.out.println("Test Case 1");
        System.out.println("Default Constructor");
        Species object = new Species();
        object.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Name Constructor");
        Species nameObject = new Species("Klingon ox");
        nameObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Population Constructor");
        Species populationObject = new Species(10);
        populationObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Growth-Rate Constructor");
        Species growthObject = new Species(2.5);
        growthObject.writeOutput();
        
        object.set("Klingon");
        object.set(20);
        object.set(35.5);
        
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 2
        System.out.println("Test Case 2");
        System.out.println("Name Constructor");
        Species s2nameObject = new Species("Fish");
        s2nameObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Population Constructor");
        Species s2populationObject = new Species(4);
        s2populationObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Growth-Rate Constructor");
        Species s2growthObject = new Species(3.5);
        s2growthObject.writeOutput();
        
        object.set("Fish");
        object.set(10);
        object.set(10.0);
        
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 3
        System.out.println("Test Case 3");
        System.out.println("Name Constructor");
        Species s3nameObject = new Species("Lizard");
        s3nameObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Population Constructor");
        Species s3populationObject = new Species(23);
        s3populationObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Growth-Rate Constructor");
        Species s3growthObject = new Species(12.5);
        s3growthObject.writeOutput();
        
        object.set("Lizard");
        object.set(2);
        object.set(14.0);
        
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 4
        System.out.println("Test Case 4");
        System.out.println("Name Constructor");
        Species s4nameObject = new Species("Pig");
        s4nameObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Population Constructor");
        Species s4populationObject = new Species(12);
        s4populationObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Growth-Rate Constructor");
        Species s4growthObject = new Species(12);
        s4growthObject.writeOutput();
        
        object.set("Pig");
        object.set(32);
        object.set(4.3);
        
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 5
        System.out.println("Test Case 5");
        System.out.println("Name Constructor");
        Species s5nameObject = new Species("Dog");
        s5nameObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Population Constructor");
        Species s5populationObject = new Species(4);
        s5populationObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Growth-Rate Constructor");
        Species s5growthObject = new Species(4);
        s5growthObject.writeOutput();
        
        object.set("Dog");
        object.set(2);
        object.set(23);
        
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 6
        System.out.println("Test Case 6");
        System.out.println("Name Constructor");
        Species s6nameObject = new Species("Bird");
        s6nameObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Population Constructor");
        Species s6populationObject = new Species(16);
        s6populationObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Growth-Rate Constructor");
        Species s6growthObject = new Species(16);
        s6growthObject.writeOutput();
        
        object.set("Bird");
        object.set(3);
        object.set(43);
        
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 7
        System.out.println("Test Case 7");
        System.out.println("Name Constructor");
        Species s7nameObject = new Species("Cat");
        s7nameObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Population Constructor");
        Species s7populationObject = new Species(5);
        s7populationObject.writeOutput();
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Growth-Rate Constructor");
        Species s7growthObject = new Species(56);
        s7growthObject.writeOutput();
        
        object.set("Cat");
        object.set(16);
        object.set(12.4);
        
        System.out.println();
        System.out.println("==========================================");
        
        System.out.println("Reset the instance variable values");
        object.writeOutput();
    }
}
