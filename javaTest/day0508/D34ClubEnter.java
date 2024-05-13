/*
	사용자한테 키를 입력받아 키가 170 이하이면 입장가능 그렇지 않으면 입장 불가능을 출력
*/
import java.util.Scanner;
class D34ClubEnter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int height;
		String result = "입장 불가능";
		
		System.out.print("사용자의 키는? => ");
		height = sc.nextInt();
		
		if(height <= 170){
			result = "입장 가능";
		}
		
		System.out.println(result);

		System.out.println((int)2.8+3.3);

		int x = 10, y = 3, z = 2;
		System.out.println((int)2.8+3.3);
	}
}
