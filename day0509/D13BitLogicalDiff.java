
class D13BitLogicalDiff 
{
	public static void main(String[] args) 
	{
		int age1 = 28;
		int age2 = 29;

		if(++age1 >= 30 && ++age2 >= 30){
			System.out.println("두 사람 모두 내년에는 30대 입니다.");
		}else{
			System.out.println("두 사람 모두 내년에는 30대가 아닙니다.");
		}
	}
}
