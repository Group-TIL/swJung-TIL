package section02.exam02_threadname;
/*스레드의 이름
 * 	- 메인 스레드 이름 : main
 * 	- 작업 스레드 이름 : Thread -n
 * 		thread.getName();
 * 	- 작업 스레드의 이름 변경
 * 		thread.setName("스레드 이름");
 * 	- 코드를 실행하는 스레드의 참조 얻기
 * 		Thread thread = Thread.currentThread();
 * 		thread.getName();
 */

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 "+thread.getName());
	}

}
