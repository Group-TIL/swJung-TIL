package section08.exam01_compare;

public class StringEqualsExample {
	public static void main(String args[]) {
		/*
		 - 문자열 비교
			1.String 타입의 문자열을 비교할 때에는
			대소(<,<=,>,>=)연산자를 사용할 수 없다.
			
			2.동등(==, !=)비교연산자는 사용할 수 있으나,
			문자열이 같은지, 다른지를 비교하는 용도로는 사용하지 않는다.
			
			3.문자열 비교는 equals() 메소드를 사용해야 한다.
			
			String strVar1 ="가나다";
			String strVar2 = "가나다";
			String new String("가나다");
			
			스택영역에서 strVar1,strVar2는 heap영역의 같은 객체를 참조
			strVar3은 다른 객체를 참조*/
		

		String strVar1 = "가나다";
		String strVar2 = "가나다";
		String strVar3 = new String("가나다");
		
		System.out.println(strVar1 == strVar2);
		//번지 비교 연산자
		System.out.println(strVar2 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar3));
		//내용비교 기준문자열.equals(비교할문자열);
		
		
	}
	
}
