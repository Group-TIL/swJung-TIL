package section09.exam01_logical;

public class LogicalOperatorExample {
	public static void main(String args[]) {
		/*
		 -논리연산자 (&&,||,&,|,^,!)
		 	1. 논리곱(&&), 논리합(||), 배타적 논리합(^),논리부정(!)연산을 수행
		 	2. 피연산자는 boolean 타입만 사용할 수 있다.
		 	3. &&와 &의 차이 : &&은 앞의 내용이 false면
		 	뒤의 내용은 보지않는다. &은 앞의 내용이 false라도
		 	뒤의 내용을 검토한다. &&의 속도가 더 빠르다.
		 	4. ||와 |의 차이 : ||은 앞의 내용이 true면
		 	뒤의 내용은 보지않는다. |은 앞의 내용이 true라도
		 	뒤의 내용을 검토한다. |의 속도가 더 빠르다.
		 */
		
		int charCode = '0';
		//유니코드가 저장
		if((charCode>=65)&&(charCode<=90)){
			System.out.println("대문자 입니다.");
		}
		if((charCode>=97)&&(charCode<=122)) {
			System.out.println("소문자 입니다.");
		}
		if(!(charCode<48)&&!(charCode>57)) {
			System.out.println("0~9숫자 입니다.");
		}
		
		int value = 6;
		
		if((value%2==0)|(value%3==0)) {
			System.out.println("2또는 3의 배수 이군요");
		}
		if((value%2==0)||(value%3==0)) {
			System.out.println("2또는 3의 배수 입니다.");
		}

	}
}
