/*
	연습 사용자한테 암호확인을 입력받아 일치하는지 판별하여 메세지를 출력하는 프로그램
	암호는 문자열로 입력
	문자열이 서로 같은지 판별하려면 equals 메소드를 이용합니다.(문자열은 == 으로 판별하지 않습니다.)
	a,equals(b) <-- 서로 같으면 true, 그렇지 않으면 false 
*/
import java.util.Scanner;
class PasswordEqual
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String pas, ans;
		System.out.println("암호를 입력해주세요");
		pas = "abc";
		ans = sc.next();

		if(ans.equals(pas)){
			System.out.println("암호가 일치함");
		}else{
			System.out.println("암호가 일치하지 않음");
		}
	}
}
