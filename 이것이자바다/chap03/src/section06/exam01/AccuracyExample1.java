package section06.exam01;

public class AccuracyExample1 {

	public static void main(String[] args) {
		/*
		 -정확한 계산은 정수를 사용
		 정확하게 계산해야 할 때는
		  부동소수점(실수)타입을 사용하지 않는 것이 좋다
		 */
		int apple = 1;
		double pieceUnit = 0.1;
		//부동소수점의 경우 0.1을 정확하게 표현할 수 없음
		int number = 7;
		
		double result = apple- number*pieceUnit;
		System.out.println("사과 한 개에서");
		System.out.println("0.7조각을 빼면");
		System.out.println(result+"조각이 남는다.");
		//정확하지 않은 결과
	}

}
