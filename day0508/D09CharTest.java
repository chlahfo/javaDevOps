class D09CharTest 
{
	public static void main(String[] args) 
	{
		String data;
		data = "hello";
		char ch;
		boolean flag = true;
		
		int i = 0;		
		ch = data.charAt(0);

		while(flag){
			ch = data.charAt(i);
			System.out.println(ch);
			i = i + 1;
			if(i == data.length()){
				flag = false;
			}
		}
	}
}