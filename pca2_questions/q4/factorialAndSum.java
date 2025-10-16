import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner input  = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int userInput = input.nextInt();
    //System.out.println();
    System.out.println(sumOfFactorialNumbers(factorial(userInput)));
  }
  
  static int factorial(int number)
  {
    if(number == 1 || number == 0)
    {
      return 1;
    }
    else
    {
      int sum = 1;
      for(int i = 1; i <= number; i++)
      {
        sum = sum * i;
      }
      return sum;
    }
  }
  
  static int sumOfFactorialNumbers(int number)
  {
    int sum = 0, rem;
    while(number != 0)
    {
      rem = number % 10;
      sum = sum + rem;
      number = number / 10;
    }
    return sum;
  }
}
