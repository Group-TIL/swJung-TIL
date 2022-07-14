package section01.exam01;

public class SignOperationExample {

	public static void main(String[] args) {
		/*
		 - 연산
		 	1. 데이터를 처리하여 결과를 산출하는 것
		 	2. 연산자: 연산에 사용되는 표시나 기호(+,-,*,/,%,=)
		 	3. 피연산자 : 연산대상이 되는 데이터 (리터럴, 변수)
		 	4. 연산식 : 연산자와 피연산자를 이용하여 연산의 과정을 기술한 것
		 	
		 -단항연산자
		 	1. 피연산자가 1개인 연산자
		 	2.종류
		 		2.1. 부호연산자 : +,-
		 		2.2. 증감연산자 : ++,--
		 		2.3. 부정연산자 : !
		 		2.4. 비트 반전 연산자 : ~
		 		
		 -부호연산자
		 	1. + 피연산자 : 피연산자의 부호 유지
		 	2. - 피연산자 : 피연산자의 부호 변경
		 	3. boolean 타입과 char 타입을 제외한 기본 타입에 사용가능
		 	ex1)
		 	int i1 = +100;
		 	int i2 = -100;
		 	double d1 = +3.14;
		 	double d2 = -10.5;
		 	
		 	ex2)
		 	int x = -100;
		 	int result1 = +x;	-> -100
		 	int reuult2 = -x;	-> 100
		 	
		 	ex3)
		 	short s = 100;
		 	short result = -s;	//컴파일 에러, short타입이 아닌 int타입으로 산출되어 나옴
		 	
		 	short s = 100;
		 	int result3 = -s;
		 */
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println(result1);
		System.out.println(result2);
		
		short s =100;
		//short result3 = -s;	//컴파일 에러 int값 산출
		int result3 = -s;
		System.out.println(result3);

	}
}
