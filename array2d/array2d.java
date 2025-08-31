import java.util.Scanner;

class Array2d {

    public static void main(String[] args) {
        // int marks[][] = {
        //     {43, 34, 56},
        //     {54, 65, 24},
        //     {43, 65, 56}
        // };

        // System.out.println(marks[2][1]);

        // take input from user and print that:

        int row = 2,
            column = 2;
        int marks[][] = new int[row][column];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(
                    "enter value for marks[" + (i + 1) + "][" + (j + 1) + "]: "
                );
                marks[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int[] theRow : marks) {
            for (int number : theRow) {
                System.out.print(number + " ");
            }
        }
    }
}
