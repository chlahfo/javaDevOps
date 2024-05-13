/*
	사용자한테 문자열을 입력받아 그 문자열 안에 대문자 A는 모두 몇 개 있는지 판별하여 출력하는 프로그램을 작성해보기
	클래스명, 변수명 자유
*/
import java.util.Scanner;
public class ANum{
	public static void main(String []args){
		char ch;
		int len, chk, i = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		chk = 0;
		len = data.length();
		while(flag){
			ch = data.charAt(i);
			i = i + 1;
			flag = i < len;

			if(ch == 'A'){
				chk = chk + 1;
			}

		}
		System.out.println(chk);
	}
}