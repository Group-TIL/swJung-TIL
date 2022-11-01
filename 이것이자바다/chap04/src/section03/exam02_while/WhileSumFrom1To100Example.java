package section03.exam02_while;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum+=i;
			i++;
		}

		System.out.println("1 ~ " + (i-1) + "까지의 합" + sum);
		
		/*
		 * -자바 API
		 * 	- 자바에서 기본적으로 제공하는 라이브러리이다.
		 * 	- 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말한다.
		 * -API 도큐먼트
		 * 	- 쉽게 API를 찾아 이용할 수 있도록 문서화한 것을 말한다.
		 *  - HTML 페이지로 작성되어 있어 웹 브라우저로 바로 볼 수 있다.
		 *  
		 */
		

	}

}
