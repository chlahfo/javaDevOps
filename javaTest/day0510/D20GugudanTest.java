import java.util.Scanner;
class D20GugudanTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력할까요? ");
		int dan = sc.nextInt();
		for (int i = 1; i < 10; i++)
		{
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
}
