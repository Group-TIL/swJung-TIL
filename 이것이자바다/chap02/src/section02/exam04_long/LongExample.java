package section02.exam04_long;

public class LongExample {

	public static void main(String[] args) {
		/*
		 - long 타입
		 1. 8byte 부호 있는(signed) 정수값 저장 (-2^63~2^63-1)
		 
		 2. 값의 표현
		 	2.1. int 범위의 리터럴은 상관없음
		 	2.2. int 범위를 초과하는 리터럴은 반드시 L 또는 l을 붙여야된다.
		 	ex) long var1 = 10;
		 		long var2 = 20L;
		 		//long var3 = 1000000000;	//컴파일 에러
		 		long var4 = 100000000L;
		 */
		long var1 = 10;
		long var2 = 20l;
		long var3 = 10000000000l;
		
		
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}

}
