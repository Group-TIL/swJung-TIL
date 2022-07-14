package section06.exam01;

public class InputDataCheckNaNExample {

	public static void main(String[] args) {
		/*
		 입력할 때 NaN을 주의
		 */
		
		
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		//double val = NaN으로 저장됨
		double currentBalance = 10000.0;
		
		currentBalance = currentBalance + val;	//NaN이 저장됨
		System.out.println(currentBalance);		
	}

}
