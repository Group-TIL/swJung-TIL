package section11.exam01_asginment;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		/*
		 - 대입연산자
		 	1. 오른쪽 피연산자의 값을 좌측 피연산자인 변수에 저장
		 	2. 단순대입연산자(=)
		 	3. 복합대입연산자
		 		ex)+=,-=,*=,/=,%=,&=,|=, ^=,<<=,>>=,>>>=
		 */
		int result = 10;
		System.out.println("result = "+result);
		
		result+=10;
		System.out.println("result = "+result);
		
		result-=5;
		System.out.println("result = "+result);
		
		
		result*=3;
		System.out.println("result = "+result);
		
		result/=5;
		System.out.println("result = "+result);
		
		result%=5;
		System.out.println("result = "+result);
	}

}
