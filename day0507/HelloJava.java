public class HelloJava{
	public static void main(String []args ){
		short	isshort = 1;
		int		isInt = 2;
		long	isLong = 3;
		float	isFloat = 0.3f;
		double	isDouble = 0.3;
		boolean	isBoolean = true;

		char	isChar = 'A';
		String	isString = "이것은 테스트를 위한 구문입니다.";
		
		System.out.printf("숫자 : %hd %d %ld", isshort, isInt, isLong);
		System.out.printf("소수 : %f")
		System.out.printf("문자 : %c %s", isChar, isString);
	}
}