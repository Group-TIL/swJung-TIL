package section06.exam01;

public class AccuracyExample2 {

	public static void main(String[] args) {
		/*
		 -정확한 계산은 정수를 사용
		 정확하게 계산해야 할 때는 부동소수점(실수)타입을
		  사용하지 않는 것이 좋다
		 */
		int apple = 1;
		int totalPieces = apple*10;
		int number = 7;
		int temp = totalPieces - number;
		
		
		double result = temp/10.0;
		System.out.println("사과 한 개에서");
		System.out.println("0.7조각을 빼면");
		System.out.println(result+"조각이 남는다.");
		//정확한결과 마지막에만 실수계산을 하였다.
		
		
		/*
		 NaN과 Infinity 연산을 조심
		 */
	}

}
