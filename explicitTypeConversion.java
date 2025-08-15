class TypeConversion {

    public static void main(String args[]) {
        // this is not possible, would throw error:
        /*long number1 = 12;
		int number2 = number1;*/

        // instead do this: This is explicit conversion.
        long number1 = 12;
        int number2 = (int) number1;

        System.out.println(number2);

        // this is implicit conversion:
        char character1 = 'a';
        int number3 = character1;

        System.out.println(number3);

        // this also needs explicit conversion:
        /*int number4 = 13;
		char character2 = number4;

		System.out.println(character2);*/

        // here we go:
        int number4 = 69;
        char character2 = (char) number4;

        System.out.println(character2);
    }
}