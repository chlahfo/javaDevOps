//로또번호 1~45까지의 숫자 6개를 선택하는 것입니다.
class D12ArrayTest 
{
	public static void main(String[] args) 
	{
		int []lotto;
		lotto = new int[6];
		lotto [0] = 2;
		lotto [1] = 43;
		lotto [2] = 21;
		lotto [3] = 7;
		lotto [4] = 16;
		lotto [5] = 33;
		
		int len = 6;

		for(int i = 0; i< len; i++){
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