
/**
 * TimeNotation
 * Converts 24 hour time to 12 hour time
 * @author (Ryder Cook)
 * @version (4/05/2020)
 */

import java.util.Scanner;
import java.io.*;
import java.text.SimpleDateFormat;

public class TimeNotation
{
    //Main method
    public static void main(String args[])
    {
        //Local variables
        String hour;
        String minutes;
        try
        {
            //declare choice variable
            char ch;
            do
            {
                SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm");
                
                System.out.println("Enter time 24-hour " + "notation: ");
                
                Scanner keyboard = new Scanner(System.in);
                String hr = keyboard.nextLine();
                
                int colon = hr.indexOf(':');
                if(colon!=2)
                    throw new TimeFormatException();
                else
                    hour = hr.substring(0,colon);
                    minutes = hr.substring(3);
                int inHour = Integer.parseInt(hour);
                
                int inMinutes = Integer.parseInt(minutes);
                
                if(inHour < 0 || inHour > 23)
                {
                    System.out.println("There is no such hour as " + inHour);
                    throw new TimeFormatException();
                }
                
                else if(inMinutes < 0 || inMinutes > 59)
                {
                    System.out.println("There is no such minute as " + inMinutes);
                }
                else 
                    if(inHour == 12)
                        minutes += " PM";
                    else if(inHour < 12)
                    {
                        minutes += " AM";
                        System.out.println("This is the same as \n " + inHour + ":" + minutes);
                    }
                    else if(inHour > 12)
                    {
                        inHour = inHour - 12;
                        hour = Integer.toString(inHour);
                        minutes += " PM";
                        System.out.println("This is the same as \n " + hour + ":" + minutes);
                    }
                    System.out.println("Try Again? (y/n)");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String s = br.readLine();
                    ch = s.charAt(0);
                }while((ch == 'y') || (ch == 'Y'));
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
}

class TimeFormatException extends Exception
{
    public TimeFormatException()
    {
        super("TimeFormatException");
    }
    
    public TimeFormatException(String message)
    {
        super(message);
    }
}