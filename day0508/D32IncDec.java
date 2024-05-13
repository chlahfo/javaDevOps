/*
	++a와 a+1 은 같은건가요? 
	==> 다름
	==>a+1은 a가 변경되지 않는다. 그러나 ++a 는 a 가 변한다.
	==> a = a + 1; 
*/
class D32IncDec 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 5;
		
		System.out.println(++a);	//6
		System.out.println(b+1);	//6
		System.out.println(+a);		//6
		System.out.println(b);		//5
	}
}
