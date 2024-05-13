import java.util.Scanner;

public class PoundTrans{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		final int pound = 454;
		double weight;
		
		System.out.print("몸무게를 입력하시오(kg) => ");
		weight = sc.nextInt() / 0.454;
		System.out.println("파운드 값으로 환산하면 "+ weight + " 입니다.");
	}
}


