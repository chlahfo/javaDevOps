/*
	배열의 요소 중에 가장 큰 수 찾기
	1) 배열의 맨 첫번째 요소를 max라고 본다.
	2) 배열의 두번째 요소부터 끝까지 max와 비교하여 그 값이 max보다 크다면 그 값을 max 에 저장한다.
*/
class D19MaxTest 
{
	public static void main(String[] args){
		int []data = {13, 10, 5, 25, 30, 10};
		int max;
		
		int len = data.length;
		max = data[0];

		for (int i = 1; i < len; i++)
		{
			if(max < data[i])
				max = data[i];
		}

		System.out.printf("가장 큰 수는 %d이다", max);
	}
}
