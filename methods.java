class Methods {

    public static void main(String[] args) {
        // "String[] args" this is actually a string array
        // for (String num : args) {
        //     System.out.println(num);
        // }
        
        float result = average(2,3,5);
        System.out.println(result);
    }

    // static int add(int num1, int num2){
    //     return (num1 + num2);
    // }

    static float average(float... numberArg) {
        // "..." is called var arg, takes multiple arguments, it's basically an array.

        float sum = 0f;
        for (float arg : numberArg) {
            sum = sum + arg;
        }
        float arrLength = numberArg.length;
        return (sum / arrLength);
    }
}
