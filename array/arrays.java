class Arrays {

    public static void main(String[] args) {
        /*int arr[] = new int[10];
		System.out.println(arr[0]);

		char arr2[] = new char[10];
		System.out.println(arr2[0]);*/

        int[] marks = { 90, 80, 88, 96, 100 };
        // System.out.println(marks[9]);

        // for each loop:

        // for(int number: marks){
        //     System.out.println(number);
        // }

        // int sum = 0;

        // for(int number: marks){
        //     sum += number;
        // }

        // System.out.println("the total is: " + sum);

        int min = marks[0];

        for (int number : marks) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println(min);
    }
}
