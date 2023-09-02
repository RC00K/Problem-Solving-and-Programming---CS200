
/**
 * ClockTest
 * Tests the clock object.
 * @author (Ryder Cook)
 * @version (2/11/2020)
 */
import java.util.*;
public class ClockTest
{
    public static void main(String[] args)
    {
        Clock myClock = new Clock();
        myClock.setHour(10);
        myClock.setMinutes(15);
        myClock.setSeconds(47);

        myClock.displayTime();
        
        myClock.setDisplaySeconds(true);
        myClock.setHour(3);
        myClock.displayTime();
        
        //myClock.setHour(0);
        //myClock.displayTime();
        
        System.out.println(myClock.getMinutes());
    }
} 