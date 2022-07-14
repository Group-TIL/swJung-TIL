package section03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		/*
		 - 강제 타입 변환시 정밀도 손실을 피한다.
		 ex1)
		 	int num1 = 123456780;	->4바이트(32비트)
		 	int num2 = 123456780;	->4바이트(32비트)
		 
		 	float num3 = num2;	
		 	//0.12345xxx * 10^n -> 가수부가 23비트 안에 다 들어가지 못함 -> 정밀도 손실발생
		 	num2 = (int)num3;
		 
		 	int result = num1-num2;
		 	result -> 4
		 	float : 부호(1비트) + 지수(8비트) + "가수(32비트) : 32비트 보다 작음 int값이 손실될 수 있음"
		 
		 ex2)
		 	int num1 = 123456780;	->4바이트(32비트)
		 	int num2 = 123456780;	->4바이트(32비트)
		 	
		 	double num3 = num2;	
		 	num2 = (int)num3;	
		 	int result = num1 - num2;
		 	result -> 0 //값 정상으로 나옴
		 	double : 부호(1비트) + 지수(11비트) + "가수(52비트):32비트보다 큼 int값이 그대로 보존"
		 	
		 - 가능하면 double 타입으로 정수를 변환할 것
		 */
		
		int num1 =123456780;
		int num2 = 123456780;
		
		float num3 = num1;	// 자동타입 변환	정밀도 손실 발생
		num2 = (int) num3;	// 강제타입 변환 float -> int
		int result = num1-num2;
		System.out.println(result);
	}

}
