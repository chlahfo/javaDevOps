/*
	��������� N�� �Է¹޾� 1~N������ ���� �����Ͽ� ����ϴ� ���α׷��� for, while, do~while���� ���� �ۼ��غ��ϴ�.
*/
import java.util.Scanner;
class  D1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum, n = sc.nextInt();
		
		sum = 0;
		for (int i = 1; i <= n; i++)
		{
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
}
