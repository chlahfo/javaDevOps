class P06_1Math 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i= 1;i<=30; i++){
			sum = sum + (i * i) + 1;
		}
		System.out.println("결과 :"+ sum);
		/*
		int result = 0;
		for (int i = 1; i <= 30; i++)
		{
			result = result + (i * i + 1);
		}
		System.out.println(result);
		*/
	}
}
