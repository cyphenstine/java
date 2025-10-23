// Check if two strings are anagrams of each other (ignoring case and non-letter characters).
package q3;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1st input:");
        String userInput1 = input.nextLine();
        System.out.println("2nd input:");
        String userInput2 = input.nextLine();
        if(checkIfAnagrams(userInput1, userInput2))
        {
            System.out.println("yes they are anagrams!");
        }
        else
        {
            System.out.println("nope they are not anagrams!");
        }
    }

    public static boolean checkIfAnagrams(String userInput1, String userInput2)
    {
        char[] firstString = prepareStringForComp(userInput1).toCharArray();
        char[] secondString = prepareStringForComp(userInput2).toCharArray();
        Arrays.sort(firstString);
        Arrays.sort(secondString);
        return Arrays.equals(firstString, secondString);
    }

    public static String prepareStringForComp(String theString)
    {
        if (theString != null)
        {
            theString = theString.replaceAll("[^a-zA-Z]", "").toLowerCase();
            return theString;
        }
        else
        {
            return "you fucking passed empty string!";
        }
    }
}
