package section05.exam01;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 ='A'+1;
//		리터럴을 가지고 연산은 오류발생하지 않음
		char c2 ='A';
//		char c3 = c2+1;
		
//		변수를 가지고 계산할 경우, 4byte int로 변환 컴파일 에러
		
		System.out.println(c1);
		int result =c2+1;
		System.out.println(result);
		char c3 = (char)result;
		System.out.println(c3);
	}

}
