package section02.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 =125;
		var1++;
		System.out.println(var1);
		var1++;
		System.out.println(var1);
		
		//오버플로우, 쓰레기값
		var1++;
		System.out.println(var1);
		
		int var2 = 125;
		
		for (int i = 0; i<5;i++) {
			var1++;
			var2++;
			System.out.println("var1 : "+var1+'\t' + "var2 : "+var2);
		}
		

	}

}
