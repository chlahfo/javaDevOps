import java.util.Scanner;

public class CmTrans{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		final float inch = 2.54f;
		final int fit = 12;
		int input_num, cm_num;
		float inch_num;
		int fit_num;
		
		System.out.print("키를 입력하시오: ");
		input_num = sc.nextInt();
		cm_num = input_num;

		inch_num = cm_num / inch;
		cm_num %= inch;

		fit_num = (int)inch_num / fit;
		inch_num %= fit;
		
		System.out.println(input_num+"는 "+fit_num+"피트 "+inch_num+"인치입니다.");
	}
}