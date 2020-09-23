import java.util.Scanner;

class SwapTwoStrings {
	public static void main(String args[]){
		System.out.print("a = ");
		Scanner scan1 = new Scanner(System.in);
		String a = scan1.next();
		System.out.print("b = ");
		Scanner scan2 = new Scanner(System.in);
		String b = scan2.next();
		String c = b;
		b = a;
		a = c;
		System.out.println("a = " + a + "; b = " + b);
	}
}