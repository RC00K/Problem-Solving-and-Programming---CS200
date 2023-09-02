/**
 * InputMismatchException
 * Throw an error if input is not valid
 * Ryder Cook
 * 4/14/2020
 */

import java.util.Scanner;

public class InputMismatchException extends Exception
{
   public InputMismatchException()
   {
       super("Input Mismatch! Try Again");
   }
   
   public InputMismatchException(String message)
   {
       super(message);
   }
}
