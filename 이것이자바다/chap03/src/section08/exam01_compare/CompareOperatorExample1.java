package section08.exam01_compare;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		/*
		 - 비교연산자(==,!=,<,>,<=,>=)
		 1. 대소비교연산(<,<=,>,>=) 또는 동등비교연산(==,!=) 비교해서 boolean타입인 true/false를 
		 2. 동등비교연산자는 모든 타입에 사용
		 3. 크기비교 연산자는 boolean 타입을 제외한 모든 기본 타입에 사용
		 4. 흐름제어문인 조건문(if),반복문(for, while)에서 주로 이용되어 실행흐름을
		 제어할 때 사용
		 */
		
		int num1 = 10;
		int num2 = 10;
		boolean result1= (num1==num2);
		boolean result2= (num1!=num2);
		boolean result3= (num1<=num2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

		char char1 ='A';
		char char2 = 'B';
		boolean result4 = (char1<=char2);
		System.out.println(result4);
	}

}
