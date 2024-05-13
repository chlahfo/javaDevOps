class D08StringTest 
{
	public static void main(String[] args) 
	{
		String data;
		data = "hello";
		int len = data.length();
		char ch;
		for(int i = 0; i < len; i++){
			ch = data.charAt(i);
			System.out.println(ch);
		}
	}	
}
