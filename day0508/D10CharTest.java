import java.util.Scanner;
class D10CharTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;
		int i = 0, cnt = 0;
		boolean flag = true;
		char ch;

		System.out.print("문자열을 입력하세요==>");
		data = sc.next();

		while(flag){
			ch = data.charAt(i);
			i = i + 1;
			if(i == data.length()){
				flag = false;
			}//end if
			if(ch == 'A'){
				cnt = cnt + 1;
			}//end if
		}//end while

		System.out.println("대문자 A의 개수는 "+ cnt);
	}//end main
}//end class
