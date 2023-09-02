/**
 * ExerciseSeven
 * Find next largest number in an array of integers
 * @author (Ryder Cook)
 * @version (4/22/2020)
 */

import java.util.Scanner;

public class ExerciseSeven
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the size of the array (Greater Than 0): ");
        
        int size = keyboard.nextInt();
        
        while(size < 0)
        {
            System.out.print("ERROR: Only Positive Numbers Please");
            size = keyboard.nextInt();
        }
        
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " integers into the array: ");
        
        for(int i = 0; i < size; i++)
        {
            array[i] = keyboard.nextInt();
            while(array[i] < 0)
            {
                System.out.print("ERROR: Only Positive Numbers Please");
                array[i] = keyboard.nextInt();
            }
        }
        
        int maxValue = recFindLargest(array, 0, array.length - 1);
        
        System.out.println("Maximum value in the array of integers: " + maxValue);
    }
    
    public static int recFindLargest(int[] array, int start, int end)
    {
        if(start == end)
        {
            return array[start];
        }
        else
        {
            int middle = (start + end) / 2;
            
            int leftMaxValue = recFindLargest(array, start, middle);
            
            int rightMaxValue = recFindLargest(array, middle + 1, end);
            
            return Math.max(leftMaxValue, rightMaxValue);
        }
    }
}
