package section02.exam01_createthread;

import java.awt.Toolkit;

/*
 * 1절. 프로세스와 스레드
 * 1. 프로세스(process) -> 절차
 * 	- 실행중인 하나의 프로그램을 말한다
 * 		- 하나의 프로그램은 다중 프로세스를 만들기도 한다.
 * 		프로그램은 실행하면 운영체제는 프로세스를 하나 만든다, 
 * 		cpu와 메모리를 사용할 수 있게 해준다
 * 
 * 			실행
 * 프로그램 	->	프로세스
 * 				->	프로세스
 * 
 * 2. 멀티 태스킹(multi tasking)
 * 	- 두 가지 이상의 작업을 동시에 처리하는 것
 * 		두가지의 방법이 있다
 * 		1) 멀티 프로세스 : 독립적으로 프로그램들을 실행하고 여러 가지 작업 처리
 * 		2) 멀티 스레드 : 한 개의 프로그램을 실행하고 내부적으로 여러가지 작업 처리
 * 
 * 3. 메인(main) 스레드
 * 	- 모든 자바프로그램은 메인 스레드가 main()메소드를 실행하면서 시작된다.
 *  - main() 메소드의 첫 코드부터 아래로 순차적으로 실행한다.
 *  - main() 메소드의 마지막 코드를 실행하거나, return 문을 만나면 실행이 종료된다.
 *  - 코드의 실행흐름 = 스레드
 *  - main 스레드는 작업 스레드 들을 만들어서 병렬로 코드들을 실행할 수 있다.
 *  즉, 멀티 스레드를 생성해서 멀티 태스킹을 수행한다.
 *  
 *  4. 프로세스의 종료
 *   - 싱글 스레드 : 메인 스레드가 종료하면 프로세스도 종료된다.
 *   - 멀티 스레드 : 실행중인 스레드가 하나라도 있다면, 프로세스는 종료되지 않는다.
 *   	- 메인 스레드가 작업 스레드 보다 먼저 종료되더라도 작업 스레드가 계속 실행 중이라면,
 *   		프로세스는 종료되지 않는다. => 프로세스에 있는 모든 스레드가 종료되어야 애플리케이션이 종료된다.
 *  2절. 작업스레드 생성과 실행
 *  1. 몇 개의 작업을 병렬로 실행할지 결정
 *  	- 몇개의 작업을 병렬로 실행할지 결정
 *  	- 프로그램에서 병렬로 실행할 작업을 결정
 *  2. 작업 스레드 생성 방법
 *  	- Thread 클래스로 부터 직접 생성
 *  	- Thread 하위 클래스로부터 생성
 *  3. Thread 클래스로부터 직접 생성
 *  
 *  	class Task implements Runnable{
 *  		public void run(){
 *  			스레드가 실행할 코드;
 *  		}
 *  	}
 *  	// Runnable -> 작업스레드가 실행할 수 있는 클래스를 만들겠다는 선언
 *  	// run() 메소드가 정의 되어있음
 *  	// run 메소드를 반드시 재정의 해야함
 *  
 *  how1) 
 * 		Runnable task = new Task();
 * 		Thread thread = new Thread(task);
 * 		thread.start();
 * 		정석적인 방법		
 * 		1. 작업을 정의한 클래스를 객체를 생성을 시킨다. 
 * 		2. thread라는 매개변수를 만든다음 매개 변수로 task라는 객체를 넣어준다.
 * 		3. thread가 task라는 객체를 실행한다.
 * 		4. 자바에서는 하나의 thread도 객체화 해서 사용한다.
 * 
 *  how2)
 * 		Thread thread = new Thread(new Runnable(){
 * 			public void run(){
 * 				스레드가 실행할 코드;
 * 			}
 * 		});
 * 
 * 		간편한 방법
 * 		Runnable을 익명객체로 만들어 Thread에 매개변수로 대입
 * 
 *  how3)
 * 		Thread thread = new Thread( ()->{
 * 			스레드가 실행할 코드;
 * 		});
 * 
 * 		람다식으로 작성
 * 
 * thread.start();
 *	start 메소드를 호출하면 thread가 실행 
 * 
 *  
 *   
 */
public class BeepPrintExample1 {

	public static void main(String[] args) {
		// 비프음을 5번 반복해서 소리나게 하는 작업
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch(Exception e) {} 	
			//thread가 0.5초간 쉬었다가 다시 실행
		}
		
		// 띵 문자열을 5번 출력하는 작업
		for(int i = 0 ;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {} 
		}
		//비프음 5번 출력후 문자열을 5번 출력하게 된다.
		

	}

}
