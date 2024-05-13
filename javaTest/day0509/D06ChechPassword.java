import java.util.Scanner;
class D06ChechPassword 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String pwd, chkPwd;
		System.out.print("암호를 입력하세요 ==> ");
		pwd = sc.next();
		System.out.print("암호 확인을 입력하세요 ==> ");
		chkPwd = sc.next();
		if(pwd.equals(chkPwd)){
			System.out.println("암호 확인이 되었습니다.");
		}else{
			System.out.println("암호가 일치하지 않습니다.");
		}
	}
}
