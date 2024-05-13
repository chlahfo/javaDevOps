//로또번호 1~45까지의 숫자 6개를 선택하는 것입니다.
class D13ArrayTest 
{
	public static void main(String[] args) 
	{
		//배열을 선언함ㄱ
		int []lotto = {2, 43, 21, 7, 16, 33};
		int len = 6;
		for(int i = 0; i< lotto.length; i++){
			System.out.printf("%5d", lotto[i]);			
		}
		/*
		System.out.printf("%5d", lotto[0]);
		System.out.printf("%5d", lotto[1]);
		System.out.printf("%5d", lotto[2]);
		System.out.printf("%5d", lotto[3]);
		System.out.printf("%5d", lotto[4]);
		System.out.printf("%5d", lotto[5]);
		*/
	}
}