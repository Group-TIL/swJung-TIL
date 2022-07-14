package section06.exam01;

public class InfinityAndNaNCheckExample2 {

	public static void main(String[] args) {
		/*
		 NaN과 Infinity 연산을 조심
		 5/0.0 - >Infinity
		 5%0.0 -> NaN
		 */
		int x = 5;
		int y = 0;
		
		try {
			int z = x / y;	// %도 마찬가지
			System.out.println("z = "+z);
		} catch(ArithmeticException e){
			System.out.println("0으로 나누면 안됨");
		}
	}

}
