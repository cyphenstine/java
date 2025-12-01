// Write a program to rotate an array by k positions to the right.
package q6;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int[] array = new int[20];
        System.out.println("Enter position:");
        Scanner positionInput = new Scanner(System.in);
        int position = positionInput.nextInt();
        positionInput.close();
        int arraySize = fillArray(array);
        System.out.println("this is the array:");
        showArray(array, arraySize);
        swapPositions(array, arraySize, position);
        showArray(array, arraySize);
    }

    public static int fillArray(int[] arr)
    {
        System.out.println("Enter array size:");
        Scanner userInput = new Scanner(System.in);
        int arraySize = userInput.nextInt();
        userInput.close();
        for(int i = 0; i < arraySize; i++)
        {
            System.out.print("enter for element " + (i + 1) + ": ");
            arr[i] = userInput.nextInt();
        }
        return arraySize;
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

    public static void swapPositions(int[] arr, int arraySize, int k)
    {
        k = k % arraySize;

        // reverse the entire array:
        reversePositions(arr, 0, arraySize-1);

        // reverse the first k elements:
        reversePositions(arr, 0, k-1);

        // reverse remaining elements:
        reversePositions(arr, k, arraySize-1);
    }

    public static void reversePositions(int[] arr, int start, int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}

