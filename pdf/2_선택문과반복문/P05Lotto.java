import java.util.Scanner;

class P05Lotto{
	public static void main(String []args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 10 사이의 번호를 입력해주세요.")
		n = sc. nextInt();
		
		if(n == 2){
			System.out.println("1등에 당첨되었습니다");
		}else if(n == 5){
			System.out.println("2등에 당첨되었습니다");
		}else if(n == 7){
			System.out.println("3등에 당첨되었습니다");
		}else{
			System.out.println("꽝입니다.");
		}
	}	
}