package section06.exam01;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		/*
		 -String 또한 NaN을 주의
		 */
		
		
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val= 0.0;	//val을 0.0으로 만들어 놓고 계산
		}
		currentBalance = currentBalance + val;	//NaN이 저장됨
		
		System.out.println(currentBalance);		

	}

}
