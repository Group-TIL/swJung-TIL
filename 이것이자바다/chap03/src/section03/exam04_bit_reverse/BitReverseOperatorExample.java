package section03.exam04_bit_reverse;

public class BitReverseOperatorExample {
	/*
	 - 비트연산자 : ~
	 	1. byte, short, int, long 타입만 피연산자가 될 수 있다.
	 	2. 비트값을 반전(0->1, 1->0)시킨다.
	 	3. 부호 비트의 최상위 비트까지 반전되므로 부호가 반대인 새로운 값이 산출된다.
	 	4. 피연산자의 타입이 int이하이면 연산의 결과는 int타입이다.
	 	
	 	ex) byte v1 =10;
	 		byte v2 = ~v1;	//컴파일 에러
	 		
	 		byte v1 = 10;
	 		int v2 = ~v1;
	 		
	 	5.
	 		byte v1 = 10;
	 		int v2 = ~v1 +1 ;	//-10이 v2에 저장
	 		
	 		참고 : Integer.toBinaryString(): 
	 		정수값을 32비트 이진 문자열로 리턴
	 		
	 */
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1+1;
		
		System.out.println(toBinaryString(v1) + "(십진수 : "+v1+")");
		System.out.println(toBinaryString(v2) + "(십진수 : "+v2+")");
		System.out.println(toBinaryString(v3) + "(십진수 : "+v3+")");
		System.out.println(v2);
		System.out.println(v3);
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4+1;
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(toBinaryString(v5) + "(십진수 : "+v5+")");
		System.out.println(toBinaryString(v6) + "(십진수 : "+v6+")");
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		
		while(str.length()<32) {
			str = "0"+str;
		}
		return str;
	}

}
