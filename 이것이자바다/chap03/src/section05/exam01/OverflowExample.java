package section05.exam01;

public class OverflowExample {

	public static void main(String[] args) {
		/*
		 - 오버플로우로 인해 잘못된 값이 산출되는 것을 방지
		 	1. 리터럴을 사용할 경우
		 		->연산 후의 값이 저장될 수 있는 충분한 타입을 사용
		 	2. 런타임시 입력된 값일 경우
		 		-> 산술연산자를 직접 사용하지 않는 것이 좋다.
		 		-> 메소드를 미리 작성해서 오버플로우를 미리 조사하고 예외처리한다.
		 	
		 */
		
		//int x = 1000000;
		//int y = 1000000;
		//int z = x*y;		//오버플로우
		
		
		long x = 1000000;
		long y = 1000000;
		long z = x*y;
		
		System.out.println(z);
	}
}
