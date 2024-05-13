class D07StringTest 
{
	public static void main(String[] args) 
	{
		String data;
		data = "hello";
		/*
		System.out.println(data);
		char ch;
		ch = data.charAt(0);
		System.out.println(ch);
		ch = data.charAt(1);
		System.out.println(ch);*/
		int len = data.length();
		char ch;
		for(int i = 0; i < len; i++){
			ch = data.charAt(i);
			System.out.println(ch);
		}
	}	
}
