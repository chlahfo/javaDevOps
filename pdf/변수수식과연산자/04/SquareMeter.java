import java.util.Scanner;

public class SquareMeter{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		final double p = 3.3;
		double square_m;
		
		System.out.print("몇 평입니까? => ");
		square_m = sc.nextDouble() * p;
		System.out.println("평방미터(m^2)로 환산할 경우"+square_m +"입니다.");
	}
}