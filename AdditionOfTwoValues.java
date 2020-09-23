import java.util.Scanner;

class AdditionOfTwoValues {
	public static void main(String args[]){
		System.out.print("Input a number, please. ");
		Scanner scan1 = new Scanner(System.in);
		String str1 = scan1.next();
		int a = Integer.parseInt(str1);
		System.out.print("Input the other number, please. ");
		Scanner scan2 = new Scanner(System.in);
		String str2 = scan2.next();
		int b = Integer.parseInt(str2);
		int c = a + b;
		System.out.println(a + " + " + b + " = " + c);
	}
}