class D04BreakTest 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<=10; i++){
			if(i % 3 == 0)
				break;
			System.out.println(i);
		}
		System.out.println("작업종료");
	}
}
