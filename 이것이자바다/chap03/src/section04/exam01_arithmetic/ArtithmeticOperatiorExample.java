package section04.exam01_arithmetic;

public class ArtithmeticOperatiorExample {

	public static void main(String[] args) {
		/*
		 -산술 연산 예시
		 */
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1+v2;
		System.out.println("result1 = "+result1);
		
		int result2 = v1 - v2;
		System.out.println("result2 = "+result2);
		
		int result3 = v1*v2;
		System.out.println("result3 = "+result3);
		
		int result4 = v1/v2;		//정수/정수 -> 정수
		System.out.println("result4 = "+result4);
		
		int result5 = v1%v2;
		System.out.println("result5 = "+result5);
		
		double result6 = (double)v1/v2; //double로 강제타입변환 실수/정수 -> 정수가 실수가 됨
		System.out.println("result6 = "+result6);
		
	}

}
