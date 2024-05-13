//1~100 모든 수 출력하기
class D23Print1To100
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		int n = 1;
		while(flag){
			System.out.println(n);
			if(n == 100){
				flag = false;
			}
			n = n + 1;
		}
	}
}
/*
	int n = 1;
		boolean flag = true;

		while(flag){
			flag = n < 100;
			System.out.printf("%d ", n);
			n = n + 1;
		}
*/
