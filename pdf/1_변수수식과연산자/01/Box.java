import java.util.Scanner;

public class Box{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n, total;
		
		System.out.print("길이는? => ");
		n = sc.nextInt();
		total = n;
		System.out.print("너비는? => ");
		n = sc.nextInt();
		total *= n;
		System.out.print("높이는? => ");
		n = sc.nextInt();
		total *= n;
		System.out.println("상자의 부피는 "+total + "이다.");
	}
}