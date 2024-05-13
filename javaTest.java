import java.util.Scanner;
import java.util.Date;

class javaTest{
	public static void main(String []args ){
		String name, gender, tot = ""; 
		int birthYear, currentYear, age;
		Scanner sc = new Scanner(System.in);
		Date current = new Date();

		final String commonHealthChk = "위암, 간암"; 
		final String AgeHighHealthChk = "대장암";
		final String womanHealthChk = "유방암, 자궁암";
		
		
		System.out.print("이름을 입력해주세요 ==> ");
		name = sc.next();

		System.out.print("출생년도를 입력해주세요 ==> ");
		birthYear = sc.nextInt();
		currentYear = current.getYear() + 1900;
		age = currentYear - birthYear;
		
		if(age < 40){
			System.out.printf("%s님은 %d살로 무료암검진 대상자가 아닙니다.", name, age);
			sc.close();
			return;
		}
		if((currentYear % 2 == 0 && birthYear % 2 == 1)||(currentYear % 2 == 1 && birthYear % 2 == 0)){
			System.out.printf("%s님의 무료암검진은 1년 뒤입니다.", name);
			sc.close();
			return;
		}
		System.out.print("성별을 입력해주세요(man / woman) ==> ");
		gender = sc.next();
		

		tot += (age >= 50)? (commonHealthChk + ", "+ AgeHighHealthChk) : commonHealthChk;

		if(gender.equals("man"))
			tot += "";
		else if(gender.equals("woman"))
			tot += ", "+womanHealthChk;
		else{
			System.out.println("성별을 정확히 기입해주세요.");
			sc.close();
			return;
		}

		System.out.printf("%s(%d)님은 %s검사 대상자입니다.\n", name, age, tot);

		sc.close();
	}	
}