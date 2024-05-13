import java.util.Scanner;

public class Car{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int start_pos, end_pos, use_oil, distance;
		
		System.out.print("출발한 지점의 주행거리계: ");
		start_pos = sc.nextInt();
		System.out.print("도착한 지점의 주행거리계: ");
		end_pos = sc.nextInt();
		System.out.print("사용한 연료: ");
		use_oil = sc.nextInt();

		distance = end_pos - start_pos;
		System.out.println("연비는 "+ distance / use_oil +"km/l입니다");
	}
}