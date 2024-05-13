import java.util.Scanner;

public class Interest{
	public static void main(String []args){
		double money, interest;
		Scanner sc = new Scanner(System.in);
		System.out.print("예금액을 입력하시오: ");
		money = sc.nextDouble();
		System.out.print("연이율을 입력하시오: ");
		interest = sc.nextDouble();
		money += (money * 0.01 * interest);		//1년 후 예금액
		money += (money * 0.01 * interest);		//2년 후 예금액
		System.out.println("2년 후의 예금액은 "+money+"입니다.");		
	}
}