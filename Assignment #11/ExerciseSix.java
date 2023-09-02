/**
 * ExerciseSix
 * Recursive method that will compute the sum of all
 * values in an array
 * @author (Ryder Cook)
 * @version (4/22/2020)
 */

import java.util.Scanner;


public class ExerciseSix
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        
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
        
        int sumValue = sumofArray(array, array.length - 1);
        
        System.out.println("Sum of values in the array: " + sumofArray(array, array.length));
    }
    
    public static int sumofArray(int a[], int n)
    {
        if(n == 1)
            return a[n - 1];
        else
            return (a[n - 1] + sumofArray(a, n - 1));
    }
}
