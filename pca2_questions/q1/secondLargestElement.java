import java.util.Arrays;
import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); 
    System.out.print("how many numbers: ");
    int amountOfNumbers = input.nextInt();
    int[] numbersArray = new int[amountOfNumbers];
    System.out.println("\nEnter Numbers: ");
    for(int i = 0; i < amountOfNumbers; i++)
    {
      System.out.print("number for position " + (i + 1) + ": ");
      numbersArray[i] = input.nextInt();
    }
    Arrays.sort(numbersArray);
    System.out.print(numbersArray[(numbersArray.length) - 2]);
  }
}
