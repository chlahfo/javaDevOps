/*문자열 데이터 소문자 o는 모두 몇개가 있는지 판별하여 출력*/
class D09StringTest 
{
	public static void main(String[] args) 
	{
		String data;
		data = "hello";
		int len = data.length();
		int cnt = 0;
		char ch;
		for(int i = 0; i < len; i++){
			ch = data.charAt(i);
			if(ch == 'o')
				cnt++;
		}
		System.out.printf("문자열 데이터에 소문자 o는 %d개", cnt);
	}	
}
