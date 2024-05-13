import java.util.Scanner;
class P06UserWeight{
	public static void main(String []args){
		double weight, height, stdWeight;
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요(cm) : ");
		height = sc.nextDouble();
		System.out.print("체중을 입력하세요(kg) : ");
		weight = sc.nextDouble();
		stdWeight = (height - 100) * 0.9;
		if(weight < stdWeight)
			result = "저체중";
		else if(weight == stdWeight)
			result = "표준";
		else
			result = "과체중";
		System.out.printf("표준체중은 %.1f이며 체중은 %.1f이므로 %s입니다.", stdWeight, weight, result);
		
	}
}