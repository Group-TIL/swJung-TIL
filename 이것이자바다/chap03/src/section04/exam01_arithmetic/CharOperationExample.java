package section04.exam01_arithmetic;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A'+1;
		System.out.println(c1);
//		리터럴을 가지고 연산은 오류발생하지 않음
		char c2 = 'A';
		//char c3 = c2 +1;
//		변수를 가지고 계산할 경우, 4byte int로 변환 컴파일 에러
		
		int result = c2 +1;
		System.out.println(result);
		
		char c3 = (char)result;
		//char type 으로 변환되어 2바이트 2바이트 나뉘어서 끝 2바이트가 들어감
		System.out.println(c3);
		

	}

}
