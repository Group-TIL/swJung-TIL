package section01.exam01_variable;

public class LiteralExample {
	public static void main(String[] args) {
		/* 2.1. 변수(2)
		 - 리터럴
		 1. 소스 코드 내에서 직접 입력된 값
		 2. 종류 : 정수 리터럴, 실수 리터럴, 문자 리터럴, 문자열 리터럴, 논리 리터럴
		*/
				
		/* 
		 - 정수 리터럴
		 1. 소수점이 없는 정수 리터럴은 10진수로 간주한다.
				ex) 0, 75, -100
		 2. 0으로 시작되는 리터럴은 8진수로 간주한다.
				ex) 02, -04
		 3. 0x 또는 0X로 시작하고 0~9 숫자나 A,B,C,D,E,F 또는 a,b,c,d,e,f로
		 구성된 리터럴은 16진수로 간주한다.
				ex) 0x5, 0xA, 0xB3, 0xAC08
		 4. 정수리터럴을 저장할 수 있는 타입은 byte, char, short, int, long, 과 같이 5개가 있다.
		*/
		
		int var1 = 10;		//10진수 10 저장
		System.out.println(var1);
		
		int var2 = 010;		//8진수 10 저장
		System.out.println(var2);
		
		int var3 = 0x10;	//16진수 10저장
		System.out.println(var3);
		
		
		/* floating point
		 - 실수 리터럴
		 1. 소수점이 있는 리터럴은 10진수 실수로 간주한다.
		 	ex) 0.25, -3.14
		 2. 대문자 E 또는 소문자 e가 있는 리터럴은 10진수 지수와 가수로 간주한다.
		 	ex) 5E7 -> 5*10^7 , 0.12E-5 -> 0.12*10^-5
		 3. 실수 리터럴을 저장할 수 있는 타입은 float, double이 있다.
		 	ex) float var1 = 0.25; double var2 = 5E7;
		*/
		
		double var4 = 0.25;
		System.out.println(var4);
		
		double var5 = 2E5;
		System.out.println(var5);
		
		
		/*
		 - 문자 리터럴
		 1. 작은 따옴표 ('')로 묶은 텍스트는 하나의 문자 리터럴로 간주한다.
		 	ex) 'A', '한', '\t', '\n'
		 2. 역슬래쉬(\)가 붙은 문자 리터럴은 이스케이프(escape) 문자라고도 하는데,
		 다음과 같이 특수한 용도로 사용된다.
			이스케이프 문자		용도						유니코드
			'\t' 				수평 탭						0x0009
			'\n'				줄 바꿈						0x000a
			'\r'				리턴						0x000d
			'\"'				"큰따옴표					0x0022
			'\''				'작은따옴표 				0x0027
			'\\'				\백슬래쉬					0x0027
			'\(u)16 진수'		16진수에 해당하는 유니코드	0x0000~0xffff
		3. 문자 리터럴을 저장할 수 있는 타입은 char 하나 뿐이다.
		 */
		
		char var6 = 'A';
		System.out.println(var6);
		
		char var7 = '한';
		System.out.println(var7);
		
		System.out.println('\t'+"들여쓰기");
		System.out.println("대한" + '\n'+"민국");
		System.out.println("This"+'\''+"s Java");
		System.out.println("이것은 "+'\"'+"중요"+'\"' + " 합니다.");
		char var8 = '\u0041';
		System.out.println(var8);
		int var9 = 'r';
		System.out.println(var9);
		
		/*
		 - 문자열 리터럴
		 1. 큰 따옴표('')로 묶은 텍스트는 문자열 리터럴로 간주한다.
		 2. 큰 따옴표 안에는 텍스트가 없어도 문자열 리터럴로 간주된다.
		 3. 문자열 리터럴 내부에서 이스케이프 문자를 사용할 수 있다.
		 	ex) "대한민국"
		 		"탭 만큼 이동 \t 합니다."
		 		"한줄 내려 쓰기 \n 합니다."
		 4. 문자열 리터럴을 저장할 수 있는 타입은 String 하나 뿐이다.
		 */
		
		/*
		 - 논리 리터럴
		 1. true와 false는 논리 리터럴로 간주한다.
		 2. 논리 리터럴을 저장할 수 있는 타입은 boolean 하나 뿐이다.
		 */
		boolean isSave = true;
		System.out.println(isSave);
		System.out.println("java"+8);	//8이 문자열로 변하면서 결합
		
		String var10 = "자바";		//S 대문자
		System.out.println(var10);

	}
}
