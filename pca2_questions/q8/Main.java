package q8;

public class Main 
{
    public static void main(String[] args)
    {
        int limit = Integer.parseInt(args[0]);

        for(int i = 0; i <= limit; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);                
            }
        }
    }    

    public static boolean isPrime(int number)
    {
        if(number <= 1)
        {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(number); i++)
        {
            if(number % i == 0)
            {
                return false;
            }
            
        }

        return true;
    }
}
