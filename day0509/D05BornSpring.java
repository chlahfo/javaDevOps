import java.util.Scanner;
class D05BornSpring 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.print("몇 월에 태어났나요 ==> ");
		month = sc.nextInt();
		if(month < 1 || month > 12){
			System.out.println("제대로된 월을 입력해주세요");
			return;
		}

		if(month == 3 || month == 4 || month == 5){
			System.out.println("봄에 태어났습니다.");
		}else{
			System.out.println("봄에 태어나지 않았습니다");			
		}
	}
}
