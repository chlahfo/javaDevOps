class D16ShiftTest 
{
	public static void main(String[] args) 
	{
		int a = 4;//000100
		int i = a << 1;
		System.out.println(i); //1000 이 되므로 8이 된다.
		int j = a << 2;
		System.out.println(j); 
		int k = a >> 1;
		System.out.println(k);
	}
}
