package tempArena;



import java.util.Scanner;

class Calculator {
    private int firstNumber;
    private int secondNumber;

    public Calculator(int num1, int num2) {
        this.firstNumber = num1;
        this.secondNumber = num2;
    }

    public int add() {
        return firstNumber + secondNumber;
    }

    public int sub() {
        return firstNumber - secondNumber;
    }
}


class TheMainClass{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        Calculator calc = new Calculator(num1, num2);
        System.out.println(calc.add()); 
        System.out.println(calc.sub()); 

    }
}