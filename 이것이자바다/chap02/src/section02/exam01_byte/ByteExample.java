package section02.exam01_byte;

public class ByteExample {
	public static void main(String args[]) {
		/*
		 -기본(primitive)타입
		 값의종류 			기본타입			메모리사용크기 		저장되는 값의 범위
		 정수				byte				1byte				-2^7~2^7-1 (-128~127)
		 					char				2byte				0~2^16-1 (유니코드 : \u0000 ~ \uFFFF, 0 ~ 65535)
		 					short				2byte				-2^15~2^15-1 (-32,768~32,767)
		 					int					4byte				-2^31~2^31-1
		 					long				8byte				-2^63~2^63-1
		 
		 실수				float				4byte				(+/-)1.4E-45~(+/-)3.4E38
		 					double				8byte				(+/-)4.9E-324~(+/-)1.7E308
		 					
		 논리				boolean				1byte				true, false
		 */
		
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 =30;
		byte var5 = 127;
		
//		byte var6 = 128;		//컴파일 오류
		
		System.out.println(var1);
	}
}
