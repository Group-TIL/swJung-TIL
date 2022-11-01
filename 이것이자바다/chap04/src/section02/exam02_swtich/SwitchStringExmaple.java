package section02.exam02_swtich;

public class SwitchStringExmaple {

	public static void main(String[] args) {
		String position = "과장";
		
		switch(postion) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			
		}
	//java7 부터는 case에 string도 사용할 수 있다.
	}
/* 반복문
 * - 중괄호 블록 내용을 반복적으로 실행할 때 사용한다.
 * - 종류 : for문 while문, do-while문
 * 
 * for문 : 반복횟수를 알고 있을 때 주로 사용
 * 
 */
}
