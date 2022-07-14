package section01.exam01_variable;

public class VariableScopeExample {
	public static void main(String[] args) {
		//2.1.1 변수(2)
		//variable scope
		//변수는 선언된 블록(중괄호) 내에서만 사용이 가능하다
		int var1;	//메소드 블록에서 선언
		
		if(true) {
			int var2;

			var1 =10;		//var1 사용가능
			var2 = 20;
			
		}
		var1= 10;
//		var2=20;		//if 문 바깥에서 사용불가 에러
		
		 for(int i = 0; i<5;i++) {
			 int var3;
			 
			 var1 = 10;	//var1 사용가능
			 var3 = 30;
			 System.out.println(var3);
		 }
		 
		// var3 =30;	//for문 바깥에서 사용불가 에러
	}
}
