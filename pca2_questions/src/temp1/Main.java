// second largest number in the array [3,9,8,7,2,3,4,9,4]
package temp1;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 9, 8, 7, 2, 3, 4, 9, 4};
        int biggest = arr[0];
        int secondBiggest = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > biggest)
            {
                secondBiggest = biggest;
                biggest = arr[i];
            }
            else
            {
                if(arr[i] > secondBiggest && arr[i] != biggest)
                {
                    secondBiggest = arr[i];
                }
            }
        }
        System.out.println(secondBiggest);
    }
}


