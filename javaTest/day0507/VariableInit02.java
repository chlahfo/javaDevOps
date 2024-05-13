import java.util.Scanner;
public class VariableInit02{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("니, 몇살이고?");
		age = sc.nextInt();
		System.out.println(age);
	}
}
//초기화 되지 않은 경우 변수 사용 불가능하다