package section12.exam01_conditional;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		/*
		 - 조건연산식(()? :)
		 	1. 조건식에 따라 콜론(:) 앞 뒤의 피연산자가 선택
		 	조건식 ? (값 또는 연산식) : (값 또는 연산식)
		 				true			false
		 */
		
		int score = 85;
		
		char grade = (score>90)? 'A':((score>80)?'B':'C');
		
		System.out.println(grade);

	}

}
