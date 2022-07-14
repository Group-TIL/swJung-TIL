package section02.exam05_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		/*
		 - 실수 타입
		 (+-) 	m 		x 		10^n
		 부호	가수			지수(n)
		 
		 실수타입		float		double
		 바이트 수		  4			  8
		 
		 - 부동소수점 (floating-point) 방식으로 저장
		 	1. 가수 : 0<= m < 1 범위의 실수 ( 0.xxxxx )
		 	2. 동일한 메모리 크기를 가지는 int와 long 보다 더 큰 수를 저장할 수 있음
		 	
		 	float : 부호(1bit) + 지수(8bit) + 가수(23bit) = 32bit = 4byte
		 	double : 부호(1bit) + 지수(11bit) + 가수(52bit) = 64bit = 8byte
		 
		 - 실수 리터럴의 기본 타입은 double이다.
		 	1. float 리터럴은 끝네 F(대문자) 또는 f(소문자)를 붙인다.
		 	ex) 
		 	double var1 = 3.14;
		 	float var2 = 3.14; //컴파일에러
		 	float var3 = 3.14f;
		 	
		 	2. 정수 리터럴에 10의 지수를 나타내는 E 또는 e가 포함되어 있을 경우
		 	실수타입에 저장해야 한다.
		 	ex)
		 	int var6 = 3000000;
		 	double var7 = 3e6;
		 	float var8 = 3e6f;
		 	double var9 = 2e-3;
		 */
		
		double var1 = 3.14;
		//float var2 = 3.14;	//컴파일에러
		float var2 = 3.14f;
		System.out.println(var1);
		System.out.println(var2);
		
		//정밀도 검사
		double var4 = 0.1234567890123456789;
		float var5= 0.1234567890123456789f;
		System.out.println(var4);
		System.out.println(var5);
		
		//e사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6f;
		double var9 = 2e-3;
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);

		
	}

}
