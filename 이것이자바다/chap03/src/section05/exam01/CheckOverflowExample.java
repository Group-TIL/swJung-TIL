package section05.exam01;

public class CheckOverflowExample {

	public static void main(String[] args) {
		/*
		 	2. 런타임시 입력된 값일 경우
		 		-> 산술연산자를 직접 사용하지 않는 것이 좋다.
		 		-> 메소드를 미리 작성해서 오버플로우를 미리 조사하고 예외처리한다.
		 */
		//int result = 2000000000+2000000000;// 오버플로우
		try {
			int result = safeAdd(2000000000,2000000000);
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("오버플로우 발생하여 "
					+ "정확하게 계산할 수 없음.");
		}//예외처리 코드
	}

	public static int safeAdd(int left, int right) {
		if(right>0) {
			if(left>(Integer.MAX_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}else {
			if(left<(Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
		}
	}
		return left+right;
	}
}
