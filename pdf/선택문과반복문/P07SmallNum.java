import java.util.Scanner;
class P07SmallNum
{
	public static void main(String []args){
		int a, b, c, min;
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 수 a를 입력하세요 ==> ");
		a = sc.nextInt();
		System.out.print("임의의 수 b를 입력하세요 ==> ");
		b = sc.nextInt();
		System.out.print("임의의 수 c를 입력하세요 ==> ");
		c = sc.nextInt();
		min = a;
		if(b < a){
			min = b;
			if(c < b){
				min = c;
			}
		}
		if(c < a){
			min = c;
			if(b < c){
				min = b;
			}
		}
		System.out.println("가장 작은 수는 "+min+"입니다");
	}
}