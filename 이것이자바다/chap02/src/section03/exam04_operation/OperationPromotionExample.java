package section03.exam04_operation;

public class OperationPromotionExample {

	public static void main(String[] args) {
		/*
		 - 연산식에서 자동 타입 변환
		 	1.연산은 같은 타입의 피연산자간에만 수행
		 		-> 서로 다른 타입의 피연산자는 같은 타입으로 변환됨
		 		-> 두 피연산자 중 크기가 큰 타입으로 자동 변환
		 	ex) 
		 	int intValue = 10;
		 	double doubleValue = 5.5;
		 	
		 	double result = intValue + doubleValue
		 	//intValue가 double 타입으로 자동 변환
		 	//result에 15.5가 저장
			
			2. 만약 int 타입으로 연산을 꼭 해야한다면 dobule 타입을 int 타입으로 
			강제변환 하고 덧셈 연산을 수행하면 된다.
			
			ex)
			int intValue = 10;
			double doubleValue = 5.5;
			int result = intValue + (int)doubleValue;
			//result에 15가 저장
			
		- int 이하의 타입연산
		
			int result = byte, char, short, int (연산자) byte,char,short,int
			int이하의 타입의 결과는 int로 나온다 -> byte, char,short끼리의 연산도
			int로 나온다.
			
			ex)
			char ai = 'A';
			int result = ai+1;	//'A'의 유니코드 보다 1이 큰 유니코드가 저장
			char na = (char) result; //'B'가 저장됨
			
			
		-long 타입연산
			피연산자 중에 long 타입 변수가 있으면 나머지도 long타입으로 변한다.
			ex)
			long result = long변수 (연산자) byte, char, short, int
		- 실수 리터럴 및 double 연산
			ex)
			double result = 실수리터럴, double변수 (연산자) byte,char,short,int,float,double
			
		-float 연산 : 두 피연산자가 모두 float일 경우에만
			ex)
			float result = float (연산자) float	
		 */
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		//byte byteValue3 = byteValue1+byteValue2;	//컴파일 에러, byteValue1과2가 int타입으로 자동변환된다.
		int byteValue3 = byteValue1+byteValue2;
		System.out.println(byteValue3);
		
		char charValue1 ='A';
		char charValue2 = 1;
		//char charValue3 = charValue1+charValue2;	//컴파일 에러
		int charValue3 = charValue1+charValue2;
		System.out.println((char)charValue3);
		
		
		int intValue4 = 10;
		int intValue5 = intValue4 / 4;		//정수 나누기 정수는 정수 값만 나온다.
		System.out.println(intValue5);
		
		int intValue6 = 10;
		//int intValue7 = 10/4.0;		//10이 double로 변환 컴파일 에러
		double intValue7 = intValue6/4.0;
		System.out.println(intValue7);
		
		//변수는 초기값이 들어가지 않으면 메모리에도 생성되지 않는다.
		//문자열은 char타입으로 변환할 수 없다.
		
		
		
	}

}
