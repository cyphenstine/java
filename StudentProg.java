import java.util.Scanner;
class Student{
	class Date{
		int day;
		int month;
		int year;
		Date(int d,int m, int y){
			day=d;
			month=m;
			year=y;
		}
		void showDate(){
			System.out.println(day+"/"+month+"/"+year);
		}
	}

	String sName;
	int sRoll;
	double sGrade;
	Date sDOB;

	void readStudent(){
		Scanner sc =new Scanner(System.in);
		System.out.print("Name: ");
		sName=sc.nextLine();
		System.out.print("Roll: ");
		sRoll=sc.nextInt();
		System.out.print("Grade Point: ");
		sGrade=sc.nextDouble();
		System.out.print("Date of Birth...\n");
		sDOB=new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
		sc.close();
	}
	void printStudent(){
		System.out.println("Name: "+sName);
		System.out.println("Roll: "+sRoll);
		System.out.println("Grade Point: "+sGrade);
		System.out.print("Date of Birth: ");
		sDOB.showDate();
	}
}

class BCA extends Student{
	int sComp;
	int sMath;
	void readBCA(){
		Scanner sc =new Scanner(System.in);
		readStudent();
		System.out.print("Computer Science: ");
		sComp=sc.nextInt();
		System.out.print("Math: ");
		sMath=sc.nextInt();
		sc.close();
	}
	void printBCA(){
		printStudent();
		System.out.print("Computer Science: "+sComp);
		System.out.print("Math: "+sMath);
	}
}

class BBA extends Student{
	int sEng;
	void readBBA(){
		Scanner sc =new Scanner(System.in);
		readStudent();
		System.out.print("English: ");
		sEng=sc.nextInt();
		sc.close();
	}
	void printBBA(){
		printStudent();
		System.out.print("English: "+sEng);
	}
}

class StudentProg{
	public static void main(String arg[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("How many students?");
		int n=sc.nextInt();
		BCA bca[]=new BCA[n];
		System.out.println("Enter Record for "+n+" students...");
		for(int i=0;i<bca.length;i++){
			System.out.println("Record for Student "+(i+1)+"...");
			bca[i]=new BCA();
			bca[i].readBCA();
		}
		System.out.println("\nShowing Records for all Students...");
		for(int i=0;i<bca.length;i++){
			System.out.println("Record for Student "+(i+1)+"...");
			bca[i].printBCA();
		}
		sc.close();

		BBA bba[]=new BBA[n];
		System.out.println("Enter Record for "+n+" students...");
		for(int i=0;i<bba.length;i++){
			System.out.println("Record for Student "+(i+1)+"...");
			bba[i]=new BBA();
			bba[i].readBBA();
		}
		System.out.println("\nShowing Records for all Students...");
		for(int i=0;i<bba.length;i++){
			System.out.println("Record for Student "+(i+1)+"...");
			bba[i].printBBA();
		}
	}
}