class D23ForTest 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 3; i = i + 1){
			System.out.println("hello");
		}
		System.out.println(i);
	}
}
/*
	D23ForTest.java:8: error: cannot find symbol
                System.out.println(i);
                                   ^
	symbol:   variable i
	location: class D23ForTest
	1 error
*/