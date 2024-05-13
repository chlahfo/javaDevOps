class P06_2Math 
{
	public static void main(String[] args) 
	{	
		int sum = 0;
		for(int i = 10; i <=30; i++){
			for(int j =0; j<=5; j++){
				sum += i*j;
			}
		}
		/*
		int result, sum;
		result = 0;
		for (int j = 10; j <= 30; j++)
		{
			sum = 0;
			for(int i = 0; i <= 5; i++){
				sum += i * j;
			}
			result += sum;
		}
		System.out.println(result);
		*/
	}
}
