import java.util.Scanner;

public class PrintNum{
	public static void main(String []args){
		int num;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		num = sc.nextInt();
		
		System.out.println("천의 자리: " + num/1000);
		num %= 1000;
		System.out.println("백의 자리: " + num/100);
		num %= 100;
		System.out.println("십의 자리: " + num/10);
		num %= 10;
		System.out.println("일의 자리: " + num);
	}
}