import java.util.Scanner;
class D02SumTestWhile 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n, sum = 0;
		System.out.print("N을 입력하세요 ==> ");
		n = sc.nextInt();
		int i = 0;
		while(i <= n){
			sum += i;
			i++;
		}
		System.out.printf("1에서 %d까지의 합은 %d", n, sum);
	}
}
