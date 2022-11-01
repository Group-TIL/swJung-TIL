package chap11.section15_exam01_format;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	/*형식(Format)클래스
	 * -숫자와 날짜를 원하는 형식의 문자열로 변환
	 * -종류
	 * 	- 숫자형식 : DecimalFormat
	 *  - 날짜형식 : SimpleDateFormat
	 *  - 매개변수화 된 문자열 형식 : MessageFormat
	 *   
	 */
	public static void main(String[] args) {
		double num = 1234567.89;
		//대문자 O
		DecimalFormat df = new DecimalFormat("O");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("OOOOOOOO.OOOOO");
		System.out.println(df.format(num));
		
		
		//O와 #의 차이점 O는 빈 공간을 0으로 채우고, #은 그대로 표시
		df = new DecimalFormat("########.#####");
		System.out.println(df.format(num));
		
		//세자리 마다 , 넣기
		df = new DecimalFormat("#,###.O");
		System.out.println(df.format(num));
		

	}

}
