package chap11.section15_exam01_format;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * - 날짜형식 클래스(simpleDateFormat)
 * 	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
 *	String strDate = sdf.format(new Date());
 * - 매개변수화된 문자열 형식 클래스(MessageFormat)
 * 방법1.
 * String message = "회원 ID:{0} \n 회원 이름 : {1}\n 회원 전화 : {2}"
 * String result = MessageFormat.format(message, id, name, tel);
 * 
 * 방법2.
 * String text = "회원 ID: {0} 회원 이름:{1} \n 회원 전화 : {2}";
 * Object[] arguments = {id, name, tel};
 * String result = MessageFormat.format(text, arguments);
 */
public class SimpleDateFormatExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf.format(now));
		
		//dd는 남는 공간을 0으로 채움 d는 채우지 않음
		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sdf.format(now));
	}
}

