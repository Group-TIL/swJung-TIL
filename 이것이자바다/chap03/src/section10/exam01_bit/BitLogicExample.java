package section10.exam01_bit;

public class BitLogicExample {

	public static void main(String[] args) {
		/*
		  - 비트연산자(&,|,^,~,<<,>>,>>>)
		 	1.비트단위로 연산을 한다. 즉 0과 1이 피연산자가 된다.
		 		1.1. 0과1로 표현이 가능한 정수 타입만 비트연산을 할 수 있다.
		 		1.2. 실수타입인 float와 double은 비트연산을 할 수 없다.
		 	
		 	2. 종류
		 		2.1. 비트 논리 연산자(&,|,^,~)
		 		2.2. 비트 이동 연산자(<<,>>,>>>)
		 	
		 	3. 비트 논리 연산자(&,|,^,~)
		 		3.1. 피연산자가 boolean타입일 경우 -> 일반 논리 연산자
		 		3.2. 피연산자가 정수 타입일 경우 비트 논리 연산자.
		 	
		 	4.비트연산자는 피연산자를 int타입으로 자동변환한 후 연산을 수행한다.
		 */
		
		System.out.println("45 & 25 = "+(45&25));
		System.out.println("45 | 25 = "+(45|25));
		System.out.println("45 ^ 25 = "+(45^25));
		System.out.println("~45 = "+(~45));
		
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		System.out.println("ll");
		System.out.println(toBinaryString(25&45));
	}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = "0"+str;
		}
		return str;
	}

}
