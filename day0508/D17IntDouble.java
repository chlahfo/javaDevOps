class D17IntDouble 
{
	public static void main(String[] args) 
	{
		//나누기한 결과를 실수값을 담고싶어요.
		double div;
		div = 5 / 2 ;
		/*
			우변에서 계산하고 대입하는 순서가 되므로,
			Int끼리 계산한 결과 우변의 자료형이 int 형인 상태 즉, 2가 된 상태에서
			Double 형 변수에 담겼으므로 자동으로 형 변환이 되어 2.0이 된 것같습니다.
		*/
		System.out.println(div);
	}

}

/*
double div;
div = 5 / 2 ;
==> 왜 결과가 2.5가 나오지 않고 2.0이 나오는가?
==> 5 / 2의 결과는 정수 / 정수를 했기 때문에 2입니다.
==> 이것을 double 형의 변수 div 에 저장하여 2.0이 도비니다.
*/
