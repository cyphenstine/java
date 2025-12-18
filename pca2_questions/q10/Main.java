package q10;

import java.util.Arrays;

public class Main 
{
    public static void main(String[] args) 
    {
        // Test array
        int[] data = {-1, 0, 1, 2, -1, -4};
        findCombos(data);
    }    
    
    public static void findCombos(int[] array)
    {
        Arrays.sort(array);

        // 1. OUTER LOOP: Pick the "Anchor" (i)
        // We stop at length-2 because we need at least 2 numbers after the anchor
        for(int i = 0; i < array.length - 2; i++)
        {
            // Optimization: Skip duplicate anchors to avoid printing same triplet twice
            if (i > 0 && array[i] == array[i - 1]) {
                continue;
            }

            // 2. RESET POINTERS: Left starts right next to anchor. Right starts at end.
            int left = i + 1;
            int right = array.length - 1;
            int target = -array[i]; // We want left + right to cancel out the anchor

            // 3. INNER LOOP: The "Pinch" technique
            while(left < right)
            {
                int sum = array[left] + array[right];

                if (sum == target) 
                {
                    System.out.println("Found: [" + array[i] + ", " + array[left] + ", " + array[right] + "]");
                    
                    // Skip duplicates inside the inner loop
                    while (left < right && array[left] == array[left + 1]) left++;
                    while (left < right && array[right] == array[right - 1]) right--;

                    // Move both after finding a match
                    left++;
                    right--;
                }
                else if (sum < target) 
                {
                    // Sum is too small, we need bigger numbers -> Move Left forward
                    left++;
                }
                else 
                {
                    // Sum is too big, we need smaller numbers -> Move Right backward
                    right--;
                }
            }
        }
    }
}