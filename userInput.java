import java.util.Scanner;

class UserInput{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your age: ");
		int age = sc.nextInt();
		System.out.print("you are " + age + " years old.");
		sc.close();
	}
}