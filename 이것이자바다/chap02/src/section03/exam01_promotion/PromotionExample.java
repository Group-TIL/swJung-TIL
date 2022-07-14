package section03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		/*
		 - 타입변환 
		 1. 데이터 타입을 다른 타입으로 변환하는 것
		 	ex) byte <-> int, int <-> double
		 2. 종류
		 	2.1. 자동(묵시적) 타입 변환 : Promotion
		 	2.2. 강제(명시적) 타입 변환 : Casting	-> 코드에 의해서
		 	
		 - 자동 타입 변환
		 1. 프로그램 실행 도중에 작은 타입은 큰 타입으로 자동 타입 변환됨
		 				
		 				<-- 자동타입변환 --
		 		큰크기타입 		 = 		작은크기타입
		 	ex) 	int(4)					byte(1)
		 		
		 	byte(1) < char(2) = short(2) < int(4) < long(8) < float(4) < double(8)	
		 
		 2. 예시
		 	2.1. int(4) <- byte(1)
		 		
		 		byte byteValue = 10;
		 		int intValue = byte byteValue;		//자동 타입 변환이 일어난다
		 				<-- 자동타입변환 --
		 		큰크기타입 		 = 		작은크기타입
		 	ex) 	int(4)					byte(1)
		00000000 00000000 00000000 00001010	<-  00001010	
		 						   값 보존됨
		 		
		
			2.2. double(8) <- int(4)
			
				int intValue = 200;
				double doubleValue = intValue; 	//200.0
			
			2.3. int(4) <- char(2)
			
				char charValue = 'A';
				int intValue = charValue;		//65가 저장
				
			2.4. 예외
				byte byteValue = 65;
				char charValue = byteValue; (X)	//byte 값이 음수가 나올 수 있으므로 컴파일 에러
				char charData = (char) byteData; (O)	//강제 타입변환시에는 가능(byte 변수가 양수임이 보장되고,변환시에 손실이 없음이 보장될 때)
				
		 */
		byte byteValue = 10;
		int intValue = byteValue;		//자동 타입 변환
		System.out.println(intValue);
		
		char charValue = '가';
		intValue =charValue;		//따로 선언 x
		System.out.println(intValue);
		
		intValue =500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue =200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		
		longValue = 1000000000L;
		float floatValue =longValue;
		System.out.println(floatValue);
		//float은 부동소수점 방식으로 저장되므로 4바이트float에 long타입 데이터 저장 가능
		//부동소수점 방식으로 저장
		
	}

}
