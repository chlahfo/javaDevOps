import java.util.Scanner;

public class MathTest2{
	public static void main(String []args){
		int num1;
		int num2;
		int val;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 = ");
		num1 = sc.nextInt();
		System.out.print("num2 = ");
		num2 = sc.nextInt();
				
		val = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + val);
		val = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + val);
		val = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + val);
		val = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + val);
	}
}