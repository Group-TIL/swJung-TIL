package section08.exam01_compare;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		/*
		 - 비교연산자(==,!=,<,>,<=,>=)
		 1. 대소(<,<=,>,>=) 또는 동등(==,!=) 비교해서 boolean타입인 true/false를 
		 2. 동등비교연산자는 모든 타입에 사용
		 3. 크기비교 연산자는 boolean 타입을 제외한 모든 기본 타입에 사용
		 4. 흐름제어문인 조건문(if),반복문(for, while)에서 주로 이용되어 실행흐름을
		 제어할 때 사용
		 */
		
		int v2 =1;
		double v3 =1.0;
		System.out.println(v2==v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		
		System.out.println(v4==v5);
		//double 과 float은 같은 싥수가 들어가 있어도 
		//다른 결과가 나온다
		//-> 정밀도의 차이
		System.out.println((float)v4==v5);
		System.out.println((int)(v4*10)==(int)(v5*10));
		

	}

}
