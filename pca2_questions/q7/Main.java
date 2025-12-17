package q7;

import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(returUniqueSubStringCount("pwwkew"));
    }

    public static int returUniqueSubStringCount(String str)
    {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        while (right < str.length()) 
        {
            char currentChar = str.charAt(right);

            if(!set.contains(currentChar))
            {
                set.add(currentChar);
                maxLength = Math.max(maxLength, right-left+1);
                right++;
            }

            else
            {
                set.remove(str.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
