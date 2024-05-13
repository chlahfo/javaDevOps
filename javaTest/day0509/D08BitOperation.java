class D08BitOperation 
{
	public static void main(String[] args) 
	{
		int a = 3; //11
		int b = 7; //111
		int i = a & b;
		int j = a | b;
		int k = a ^ b;
		
		System.out.println("i: "+ i);
		System.out.println("j: "+ j);
		System.out.println("k: "+ k);
	}
}
