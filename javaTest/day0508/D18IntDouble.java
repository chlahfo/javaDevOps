class D18IntDouble 
{
	public static void main(String[] args) 
	{
		//나누기한 결과를 실수값을 담고싶어요.
		double div;
		//div = 5 / 2.0 ;
		div = 5/ (double) 2;
		System.out.println(div);
	}

}

/*
double div;
div = 5 / 2 ;
==> 왜 결과가 2.5가 나오지 않고 2.0이 나오는가?
==> 5 / 2의 결과는 정수 / 정수를 했기 때문에 2입니다.
==> 이것을 double 형의 변수 div 에 저장하여 2.0이 도비니다.
==> 만약 실수의 값을 기대한다면, 둘 중에 하나를 double 형으로 변환합니다.

div = 5/ 2.0;
div = 5/ (double)2;
*/
