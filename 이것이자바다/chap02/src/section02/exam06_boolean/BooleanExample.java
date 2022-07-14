package section02.exam06_boolean;

public class BooleanExample {

	public static void main(String[] args) {
		
		/*
		 - 논리 타입
		 	boolean
		 	1. 1byte 크기를 가지며, 논리값 true 또는 false를 저장
		 	2. 두가지 상태값을 저장할 필요성이 있을 경우 사용
		 	3. 조건문, 제어문의 실행 흐름을 변경할 때 주로 이용
		 */
		boolean stop = false;
		
		
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("실행합니다.");
		}

	}

}
