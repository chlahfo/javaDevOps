import java.util.Scanner;
public class VariableInit03{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int age;
		String result = "";
		System.out.print("니, 몇살이고?");
		age = sc.nextInt();
		System.out.println(age);

		if(age >=20){
			result = "입장가능";
		}else{
			result = "입장불가능";
		}
		System.out.println(result);
	}
}
//if 안에서만 초기화 할 경우에는 java 는 반드시 초기화 된다고 생각하지 않으므로 오류가 날 수 있다. 따라서 위와 같은 경우 if 실행문 바깥에서  비어있는 글자 "" 등으로 초기화 한다.