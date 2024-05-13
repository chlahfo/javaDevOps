import java.util.Scanner;
class D03ClubEnter {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		double height;
		System.out.print("이름을 입력하세요 ==>");
		name = sc.next();
		System.out.print("나이를 입력하세요 ==>");
		age = sc.nextInt();
		System.out.print("키를 입력하세요 ==>");
		height = sc.nextDouble();

		if(age >= 30 && height <= 170){
			System.out.printf("%s님 입장가능합니다.", name);
		}else{
			System.out.printf("%s님 입장불가능합니다.", name);
		}
	}
}
