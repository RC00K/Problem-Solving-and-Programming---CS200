/**
 * KenoPlaySlip
 * This is the Keno Play Splip.
 * @author (Ryder Cook)
 * @version (2/18/2020)
 */

import java.util.*;
public class KenoPlaySlip
{
      //Instance variables
      public int spots;
      public int dollarAmount;
      public int numberOfDraws;
      public int[] numbers;
      //Default Constructor
      
      public KenoPlaySlip()
      {
            spots = 0;
            dollarAmount = 0;
            numberOfDraws = 0;
            numbers = new int[spots];
      }
      
      public int[] getNumbers()
      {
            return numbers;
      }
      
      public void setNumbers(int[] newNumbers) {
            numbers = newNumbers;
      }
      
      public void displayKenoPlaySlip()
      {
          System.out.println("Spots: " + spots); 
          System.out.println("Dollar Amount: " + dollarAmount); 
          System.out.println("Number of draws: " + numberOfDraws); 
          System.out.println("Numbers played: ");
          System.out.println();
          
          for (int i=0; i< spots; i++)
          System.out.print(numbers[i] + " "); 
          System.out.println();
      }
      
      public void preparePlaySlip()
      {
            int outputNumber = 0;
            Scanner keyboard = new Scanner(System.in); System.out.print
            ("How many spots would you like to play? 1 - 10 "); 
            setSpots(keyboard.nextInt());
            
            System.out.print("What dollar amount would you like to play?" + " $1-$3? ");
            setDollarAmount(keyboard.nextInt());

            System.out.print("How many drawings do you want to play?" + " 1-5, 10 or 20 ");
            setNumberDraws(keyboard.nextInt());
            
            numbers = new int[spots];
            for(int i = 0; i < spots; i++)
            {
                  outputNumber = i + 1;
                  System.out.print("Number " + outputNumber + ": "); 
                  numbers[i] = keyboard.nextInt();
            }
      }
      
      public void setSpots(int spotNumber)
      {
          if((spotNumber <= 10) && (spotNumber >= 1))
              spots = spotNumber;
          else
          {
              System.out.print("Invaild please enter a number 1 - 10");
              System.exit(0);
          }
      }
      
      public void setDollarAmount(int dollarAmountNumber)
      {
          if((dollarAmountNumber >= 1) && (dollarAmountNumber <= 3))
              dollarAmount = dollarAmountNumber;
          else
          {
              System.out.print("Invaild please enter an amount $1 - $3");
              System.exit(0);
          }
      }
      
      public void setNumberDraws(int drawNumber)
      {
          if((drawNumber >= 1 && drawNumber <= 5) || (drawNumber == 10) || drawNumber == 20)
              numberOfDraws = drawNumber;
          else
          {
              System.out.print("Invaild please enter a number 1 - 5, 10 or 20");
              System.exit(0);
          }
      }
}