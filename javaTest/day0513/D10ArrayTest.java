class D10ArrayTest 
{
	public static void main(String[] args) 
	{
		int []a;
		a = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
//		a[5] = 500;
		System.out.println("종료");
	}
}
/*
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at D10ArrayTest.main(D10ArrayTest.java:12)
*/