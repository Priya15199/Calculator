import java.util.Scanner;
public class Mainclass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1. Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int choice;
		System.out.println("Enter the option");
		choice = sc.nextInt();
		switch(choice) {
		case 1: 
			add();
			break;
		case 2:
			subtract();
			break;
		case 3:
			division();
			break;
		case 4:
			multiply();
			break;
		default:
			System.out.println("Invalid input");


}
}
	public static void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
	    float res = a + b;
	    System.out.println("Result is :" + res);
	}
	public static void subtract() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
	    float res = a - b;
	    System.out.println("Result is :" + res);
	}
	public static void division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
	    float res = a / b;
	    System.out.println("Result is :" + res);
		
	}
	public static void multiply() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
	    float res = a * b;
	    System.out.println("Result is :" + res);
		
	}
}
	
	
	
	
	