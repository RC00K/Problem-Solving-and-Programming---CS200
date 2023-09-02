/**
 * InvalidGameException
 * Throw an error if input is not valid
 * Ryder Cook
 * 4/14/2020
 */

import java.util.Scanner;

public class InvalidGameException extends Exception
{
   public InvalidGameException()
   {
       super("Invalid amount of players please enter between one and two playes");
   }
   
   public InvalidGameException(String message)
   {
       super(message);
   }
}
