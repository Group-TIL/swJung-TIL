package section10.exam01_bit;

public class BitShiftExample {

	public static void main(String[] args) {
		/*
		 -비트 이동(쉬프트) 연산자(<<,>>,>>>)
		  	1. 정수 데이터의 비트를 좌측 또는 우측으로 
		  	밀어서 이동시키는 연산을 수행
		  	ex)
		  		a << b : 정수 a의 각 비트를 b만큼 왼쪽으로 이동
		  		(빈자리는 0으로 채워진다)
		  		a >> b: 정수 b의 각 비트를 b만큼 오른쪽으로 이동
		  		(빈자리는 정수 a의 최상위 부호 비트(MSB)와 같은값으로
		  		채워진다.
		  		a >>> b 정수a의 각 비트를 b 만큼 오른쪽으로 이동
		  		(빈자리는 무조건 0으로 채워진다.) 
		 */
		
		System.out.println("1 << 3"+(1<<3));
		System.out.println("-8 << 3"+(-8>>3));
		System.out.println("-8 >>> 3"+(-8>>>3));
		
		System.out.println(toBinaryString(-8));
		System.out.println(">> 3 = ");
		System.out.println(toBinaryString(-8>>3));
		System.out.println();
		System.out.println(-8);
		System.out.println(">>> 3 = ");
		System.out.println(toBinaryString(-8>>>3));
	}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = "0"+str;
		}
		return str;
	}

}
