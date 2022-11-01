package section04.exam01_arithmetic;

public class CheckOverflowExample {

	public static void main(String[] args) {
		/*
	 	2. 런타임시 입력된 값일 경우
	 		-> 산술연산자를 직접 사용하지 않는 것이 좋다.
	 		-> 메소드를 미리 작성해서 오버플로우를 미리 조사하고 예외처리한다.
		 */
		//int result = 2000000000+2000000000;// 오버플로우
		//사용자 입력, 데이터베이스의 값, 연산결과 등의 결과 등을 저장할때
		//오버플로우 발생가능성 높음
		
//		int result = 2000000000+2000000000; //overflow
//		System.out.println(result);
		try {
			int ResultSafe = safeAdd(2000000000,2000000000);
			System.out.println(ResultSafe);
		}catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}
		//safeAdd method 선언
		
		public static int safeAdd(int left,int right) {
			if(right>0) {
				if(left > (Integer.MAX_VALUE-right)) {
					throw new ArithmeticException("오버플로우 발생");
				}
			}else{
				if(left < (Integer.MIN_VALUE-right)) {
					throw new ArithmeticException("오버플로우 발생");
			}
			
		}
			return left + right;
		}
}
		



