package section02.exam03_int;

public class IntExample {

	public static void main(String[] args) {
		/*
		 - short 타입
		 1. 2byte 부호있는(signed) 정수값 저장 : -32,768 ~ 32,767(-2^15 ~ 2^15-1)
		 2. C언어와 타입 호환을 위해 사용되며 비교적 자바에서는 잘 사용되지 않는 타입
		 */
		
		/*
		 - int 타입
		 1. 4byte 부호 있는 (signed) 정수값 저장 : (-2^-31~ 2^31)
		 		ex) int number = 10;
		 			int octNumber = 012;
		 			int hexNumber = 0xA;
		 2. 변수에 어떤 진수로 저장을 하더라도 동일한 값이 이진수로 변환되어 저장된다.
		 	10이 int 변수에 저장되면 메모리에 생성되는 변수는 다음과 같다. int가 4byte의 크기를 가지고
		 	4byte의 공간을 차지하며서 총 32bit로 10을 표현한다.
		 	
		 	변수
		 	00000000 00000000 00000000 00001010
		 	 1byte	  1byte	   1byte	1byte
		 10은 1byte로 충분히 표현이 가능하기 때문에 나머지 상위 3byte는 모두 값이 0이다.
		 
		 */
		int var1 = 10;
		int var2 = 012;
		int var3 = 0xA;
		
		//int var4 =10000000000; 10억 에러
		
		
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		//System.out.println(var4);
		
		
	}

}
