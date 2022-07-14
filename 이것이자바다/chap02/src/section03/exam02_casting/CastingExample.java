package section03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		/*
		 - 강제 타입 변환 (Casting)
		 	1. 큰 타입을 작은 타입 단위로 쪼개고 "끝 한부분만" 작은 타입으로 강제적 변환
		 				<--강제 타입 변환--
		 		작은크기 타입  =  (작은크기타입) 큰 크기 타입
		 	ex1) byte(1) <- int(4)
		 	
		 		int intValue = 103029770;
		 		byte byteValue = (byte) intVlaue;
		 		00001010		<-	00000110 00100100 00011100 00001010
		 								X		X		X		O
		 		원래값이 보존되지 않음
		 	ex2) byte(1) <- int(4)
		 	
		 		int intValue = 10;
		 		byte byteValue = (byte) intVlaue;
		 		00001010		<-	00000000 00000000 00000000 00001010
		 								X		X		X		O
		 		원래값이 보존됨
		 	ex3) int <- long
		 		long longValue = 300;
		 		int intValue = (int)longValue;		//intValue는 300이 그대로 저장된다.
		 		
		 	ex4) char(2) <- int(4)
		 		int intValue = 'A';
		 		char charValue = (char)intValue;
		 	
		 	ex5) int(4) <- double(8)
		 		double doubleValue = 3.14;
		 		int intValue = (int) doubleValue		//intValue는 정수 부분인 3만 저장된다.
		 

		 */
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);	//정수부분만 들어감
		
		
	}

}
