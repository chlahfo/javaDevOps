import java.util.Scanner;

public class cylinder{
	public static void main(String []args){
		int r, h;
		double volume;
		Scanner sc = new Scanner(System.in);

		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		r = sc.nextInt();
		System.out.print("원기둥의 높이를 입력하시오: ");
		h = sc.nextInt();
		volume = r * r * 3.141592 * h;
		System.out.println("원기둥의 부피는 "+volume+" 입니다.");
		
	}
}