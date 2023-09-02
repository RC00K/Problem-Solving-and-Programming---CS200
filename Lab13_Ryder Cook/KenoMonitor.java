/**
 * KenoMonitor
 * This is the Keno Monitor.
 * @author (Ryder Cook)
 * @version (2/18/2020)
 */

import java.util.Random;

public class KenoMonitor
{
    public int count;
    public int[] kenoList;
    public int kenoNumber;
    
    public void KenoMonitor()
    {
        kenoList = new int[20];
        count = 0;
    }
    
    public void setKenoNumbers()
    {
        while(count < 20)
        {
            kenoNumber = (int)(80*Math.random()) + 1;
            if(!isOnList(kenoNumber))
            {
                kenoList[count] = kenoNumber;
                System.out.print(kenoNumber + " ");
                count++;
            }
        }
    }
    
    public boolean isOnList(int Number)
    {
        boolean test = false;
        int i = 0;
        while(!test && (i < 20))
        {
            if(Number == kenoList[i])
            test = true;
            else
            i++;
        }
        return test;
    }
}