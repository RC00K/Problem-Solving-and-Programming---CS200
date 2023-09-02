 /**
 * TemperatureTest1
 * The output of the Temperature Test temperatures
 * that are entered in.
 * @author (Ryder Cook)
 * @version (2/20/2020)
 */
public class TemperatureTest1
{
    public static void main(String[] args)
    {
        //Test Case 1
        System.out.println();
        System.out.println("Test case 1: Default constructor and");
        System.out.println("writeOutput() method.");
        System.out.println();
        
        Temperature1 t1 = new Temperature1();
        System.out.println("Results of default constructor: ");
        System.out.println("Verify 0 degrees C.");
        System.out.println();
        
        t1.writeOutput();
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 2
        System.out.println();
        System.out.println("Test case 2: Sets the given temp and char");
        System.out.println("writeOutput() method.");
        System.out.println();
        
        System.out.println("Writes temp and char (for example 24.9F).");
        System.out.println();
        
        t1.readInput();
        t1.writeOutput();

        System.out.println("==========================================");
        
        //Test Case 3
        System.out.println();
        System.out.println("Test case 3: Constructor with temp and char");
        System.out.println("writeF() method.");
        System.out.println();
        
        Temperature1 t2 = new Temperature1(32.0, 'F');
        System.out.println("Results of constructor: ");
        System.out.println("Verify 32.0 degrees F.");
        System.out.println();
        
        t2.writeF();
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 4
        System.out.println();
        System.out.println("Test case 4: Constructor with negative temp");
        System.out.println("writeC() method.");
        System.out.println();
        
        Temperature1 t3 = new Temperature1(-40.0);
        t3.setUnits('C');
        System.out.println("Results constructor: ");
        System.out.println("Verify -40.0 degrees C.");
        System.out.println();
        
        t3.writeC();
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 5
        System.out.println();
        System.out.println("Test case 5: Constructor with char");
        System.out.println("writeF() method.");
        System.out.println();
        
        Temperature1 t4 = new Temperature1('F');
        t4.setDegrees(-40.0);
        System.out.println("Results of constructor: ");
        System.out.println("Verify -40.0 degrees F.");
        System.out.println();
        
        t4.writeF();
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 6
        System.out.println();
        System.out.println("Test case 6: Constructor with temp and char");
        System.out.println("writeC() method.");
        System.out.println();
        
        Temperature1 t5 = new Temperature1(100.0, 'C');
        System.out.println("Results constructor: ");
        System.out.println("Verify 100.0 degrees C.");
        System.out.println();
        
        t5.writeC();
        System.out.println();
        System.out.println("==========================================");
        
        
        //Test Case 7
        System.out.println();
        System.out.println("Test case 7: Constructor with temp and char");
        System.out.println("writeC() method.");
        System.out.println();
        
        Temperature1 t6 = new Temperature1();
        t6.setDegreesUnits(212.0, 'F');
        System.out.println("Results of constructor: ");
        System.out.println("Verify 212.0 degrees F to degrees C.");
        System.out.println();
        
        t6.writeC();
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 8
        System.out.println();
        System.out.println("Test case 8: Constructor with temp and char");
        System.out.println("writeC() method.");
        System.out.println();
        
        Temperature1 t7 = new Temperature1(32.0, 'C');
        System.out.println("Results of constructor: ");
        System.out.println("Verify 32.0 degrees C.");
        System.out.println();
        
        t7.writeC();
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 9
        System.out.println();
        System.out.println("Test case 9: Determines if two temps equal each other");
        System.out.println("using a equals comparison.");
        System.out.println();
        
        System.out.println("Determines if 100.0 degrees C is equal to 212.0 degrees F.");
        System.out.println();
        
        System.out.println("The degrees " + t5.getC() + " C is equal to " + t5.getF() + "F.");
        System.out.println();
        System.out.println("==========================================");
        
        
        //Test Case 10
        System.out.println();
        System.out.println("Test case 10: Determines if two temps equal each other");
        System.out.println("using a equals comparison.");
        System.out.println();
        
        System.out.println("Determines if 100.0 degrees C is equal to 100.0 degrees F.");
        System.out.println();
        
        System.out.println("Temperaure " + t5.toString() + " is equal to " + t6.toString() + ".(T/F): " + t5.equals(t6));
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 11
        System.out.println();
        System.out.println("Test case 11: Determines if two temps equal each other");
        System.out.println("using a equals comparison.");
        System.out.println();
        
        System.out.println("Determines if -40.0 degrees C is equal to 32.0 degrees F.");
        System.out.println();
        
        System.out.println("Temperaure " + t2.toString() + " is equal to " + t3.toString() + ".(T/F): " + t2.equals(t3));
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 12
        System.out.println();
        System.out.println("Test case 12: Determines what temp is lesser");
        System.out.println("using a isLessThan().");
        System.out.println();
        
        System.out.println("Determines if " + t1.toString() + " is less than 48.0 degrees F.");
        System.out.println();
        
        System.out.println("Temperaure " + t1.toString() + " is less than " + t5.toString() + ".(T/F): " + t1.isLessThan(t5));
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 13
        System.out.println();
        System.out.println("Test case 13: Determines what temp is lesser");
        System.out.println("using a isLessThan().");
        System.out.println();
        
        System.out.println("Determines if -40.0 degrees C is less than -40.0 degrees F.");
        System.out.println();
        
        System.out.println("Temperaure " + t3.toString() + " is less than " + t4.toString() + ".(T/F): " + t3.isLessThan(t4));        
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 14
        System.out.println();
        System.out.println("Test case 14: Determines the greater temp");
        System.out.println("using a isGreaterThan().");
        System.out.println();
        
        System.out.println("Determines if 212.0 degrees F is greater than 32.0 degrees F.");
        System.out.println();
        
        System.out.println("Temperaure " + t6.toString() + " is greater than " + t2.toString() + ".(T/F): " + t6.isGreaterThan(t2));
        System.out.println();
        System.out.println("==========================================");
        
        //Test Case 15
        System.out.println();
        System.out.println("Test case 15: Determines the greater temp");
        System.out.println("using a isGreaterThan().");
        System.out.println();
        
        System.out.println("Determines if -40.0 degrees F is greater than " + t1.toString() + ".");
        System.out.println();
        
        System.out.println("Temperaure " + t4.toString() + " is greater than " + t1.toString() + ".(T/F): " + t4.isGreaterThan(t1));
        System.out.println();
        System.out.println("==========================================");
    }
}
