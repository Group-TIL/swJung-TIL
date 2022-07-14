package section02.exam02_char;

public class CharExample {

	public static void main(String[] args) {
		/*
		 - char 타입
		 1. 2byte 부호없는(unsigned) 정수값 저장
		 2. char 타입에는 한 문자를 유니코드로 저장
		 3. 하나의 문자 리터럴은 작은 따옴표로(')감싸야한다.
		 		ex)
		 		char var1 = 'A';
		 		char var2 = 'B';
		 		char var3 = '가';
		 		char var4 = '나';
		 4. 직접 유니코드 정수 값을 저장할 수도 있다.
		 		ex)
		 		char c = 65;
		 		char c = '\u0041';
		 5. 유니코드를 알고 싶을 경우
		 		ex)
		 		char c = 'A';
		 		int uniCode = c'
		 6. 문자와 문자열은 다르다, 문자열은 큰 따옴표로 리터럴을 작성한다.
		 7.빈(empty) 문자 처리
		 		ex) 
		 		char c = '';	//컴파일 에러
		 		charc = ' ';	//공백(유니코드:32) 가능
		 		String str = "";	//가능
		 */
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uAC00';
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		int uniCode = c1;
		System.out.println(uniCode);

	}

}
