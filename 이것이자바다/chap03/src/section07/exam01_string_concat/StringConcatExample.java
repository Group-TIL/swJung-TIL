package section07.exam01_string_concat;

public class StringConcatExample {

	public static void main(String[] args) {
		/*
		 - 문자열 연결 연산자 (+)
		 	1.피연산자 중 문자열이 있으면 문자열로 결합시킨다.
		 */
		String str1 = "JDK"+6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK"+3 + 3.0;
		String str4 = 3+3.0+"JDK";
		System.out.println(str3);
		System.out.println(str4);

	}

}
