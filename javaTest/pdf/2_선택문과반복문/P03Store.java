import java.util.Scanner;
class P03Store
{
	public static void main(String[] args) 
	{
		int n, tot = 0;
		System.out.print("물건 구입 갯수는? ==> ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n >= 10){
			tot = (100 * n) + (10 * n);
		}else{
			tot = 100 * n;
		}
		System.out.printf("물건 %d개의 총 가격은 %d원입니다.", n, tot);
	}
}
