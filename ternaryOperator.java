import java.util.Scanner;

class TernaryOperator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter for a: ");
		int a = sc.nextInt();
		System.out.print("enter for b: ");
		int b = sc.nextInt();
		int max = a > b ? a : b;
		System.out.println("max is: " + max);
		sc.close();
	}
}