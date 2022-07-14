package section06.exam01;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		/*
		 = 정수 끼리의 나눗셈 연산시 0으로 나눌때는 오류발생
		 5/0 -> ArithemticException 예외 발생
		 5%0 -> ArithemticException 예외 발생
		 
		 - NaN과 Infinity 연산을 조심
		 실수로 나눌 때에는 Infinity와 NaN발생
		 5/0.0 - >Infinity
		 5%0.0 -> NaN
		 자바에서는 둘다 수로 인식 : 연산시 이상한값이 
		 나올 수 있다.
		 */
		int x = 5;
		double y = 0.0;
		
		//double z = x/y;
		double z = x%y;
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		if(Double.isInfinite(z)||Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z+2);
		}
	}

}
