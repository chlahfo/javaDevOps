
class D22IfTestCurly
{
	public static void main(String[] args) 
	{
		int n = 5;
		System.out.println("a");
		System.out.println("b");
		if(n > 0){
			System.out.println("c");
			System.out.println("c");
		}else{
			System.out.println("d");
			System.out.println("c");
		}
		System.out.println("e");
		System.out.println("f");
	}
}

/*
	D22IfTestCurly.java:12: error: 'else' without 'if'
                else
*/