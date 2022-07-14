package section02.exam01_increase_decrease;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		/*
		 - 증감연산자 : ++, --
		 	1. ++ 피연산자 : 다른연산을 수행하기 전에 피연산자의 값을 1증가시킴
		 	2. -- 피연산자 : 다른연산을 수행하기 전에 피연산자의 값을 1감소시킴
		 */
		
		int x = 10;
		int y = 10;
		int z;
		x++;
		++x;
		System.out.println("x  = "+ x);
		y--;
		--y;
		System.out.println("y = "+y);
		z = x++;
		
		
	}
}


