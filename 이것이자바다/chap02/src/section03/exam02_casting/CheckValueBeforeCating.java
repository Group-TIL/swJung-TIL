package section03.exam02_casting;

public class CheckValueBeforeCating {

	public static void main(String[] args) {
		/*
		  - 강제 타입 변환전에 값이 보존될 것인지(손실이 되지 않는지) 검사
		 
		 
		 	if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE){
		 		System.out.println("byte 타입으로 변환할 수 없습니다.");
		 	}else{
		 		byte b = (byte)i;
		 		System.out.println(b);
		 		
		 	기본타입	최소값 상수			최대값 상수
		 	byte		Byte.MIN_VALUE 		Byte.MAX_VALUE	
		 	short		Short.MIN_VALUE		Short.MIN_VALUE
		 	int
		 	long
		 	float
		 	double
		 	*/
		
		int i = 128;		//범위 초과 쓰레기값 저장
		
		//검사코드
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
		}else {
			byte b  = (byte)i;
			System.out.println(b);			
		}

	}

}
