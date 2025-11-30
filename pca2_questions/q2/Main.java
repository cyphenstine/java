// Given a string, return a new string where every delay word “not” followed by “bad” is replaced by “good”. E.g. “This movie is not that bad!” → “This movie is good!”
package q2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter your text:");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        input.close();
        System.out.println(fixNotBad(userInput));
    }
    public static String fixNotBad(String userInput)
    {
        int notIndexStart =userInput.indexOf("not");
        int badIndexStart =userInput.indexOf("bad", notIndexStart);
        if(notIndexStart != -1 && badIndexStart != -1 && badIndexStart > notIndexStart)
        {
            return userInput.substring(0, notIndexStart) + "good" + userInput.substring(badIndexStart + 3);
        }
        return userInput;
    }
}

