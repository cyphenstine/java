package q9;

public class Main 
{
    public static void main(String[] args) 
    {
        int number = Integer.parseInt(args[0]);
        if(number < 0)
        {
            number = number - number * 2;
            String inString = Integer.toString(number);
            StringBuilder str = new StringBuilder();
            str.append(inString);
            System.out.println("-" + str.reverse());
        }

        else if(number == 0)
        {
            System.out.println(0);
        }

        
    }

}
