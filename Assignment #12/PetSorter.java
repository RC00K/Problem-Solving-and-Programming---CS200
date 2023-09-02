/**
 * Write a description of class PetSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PetSorter
{
    public static void main(String[] args)
    {
        ArrayList<Pet> strList = new ArrayList<Pet>();
        Boolean another = true;
        Scanner scan = new Scanner(System.in);
        while(another)
        {
            System.out.println("Enter the pet name: ");
            String name = scan.nextLine();
            Pet p = new Pet(name);
            strList.add(p);
            System.out.println("Would you like to enter another Pet name? (y/n)");
            String an = scan.nextLine();
            another = an.equals("y");
        }
        
        PetSorter.nameSort(strList);
        for(int x = 0; x < strList.size(); x++)
        {
            System.out.println(strList.get(x).getName());
        }
    }
    
    public static void nameSort(ArrayList<Pet> array)
    {
        for(int i = 1; i < array.size(); i++)
        {
            int j = i;
            Pet tp = array.get(i);
            String B = array.get(i).getName();
            while((j > 0) && (array.get(j-1).getName().compareTo(B) > 0))
            {
                array.set(j, array.get(j-1));
                j--;
            }
            array.set(j, tp);
        }
    }
}
