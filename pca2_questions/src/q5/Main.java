// Given two sorted integer arrays, merge them into one sorted array without using built-in sort functions.
package q5;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int[] userInput = new int[20];
        int arraySize = fillArray(userInput);
        System.out.println("before sorting:");
        showArray(userInput, arraySize);

    }

    public static void showArray(int[] arr, int arraySize)
    {
        if(arr != null)
        {
            for(int i = 0; i < arraySize; i++)
            {
                System.out.println(arr[i]);
            }
        }

    }

    public static int fillArray(int[] arr)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Array size: ");
        int arraySize = userInput.nextInt();
        for(int i = 0; i < arraySize; i++)
        {
            System.out.print("enter for element " + (i + 1) + ": ");
            arr[i] = userInput.nextInt();
        }
        return arraySize;
    }

    public static void insertionSort(int[] arr)
    {
        if(arr != null)
        {
            for(int i = 1; i < arr.length; i++)
            {
                int temp;
                int compWithInUnSorted = arr[i];
                int prevEle = i - 1;
                while(j >= 0 && )
            }
        }

    }
}
