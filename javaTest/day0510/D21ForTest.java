class D21ForTest 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 3; i = i + 1){
			System.out.println("hello");
		}
		System.out.println("-----------------------------------");
		for(int i = 1; i <= 3; i++){
			System.out.println("hello");
		}
		System.out.println("-----------------------------------");
		for(int i = 1; i <= 3; i += 1){
			System.out.println("hello");
		}
	}
}
/*
	D21ForTest.java:13: error: not a statement
                for(int i = 1; i <= 3; i + 1){
                                         ^
	1 error

*/