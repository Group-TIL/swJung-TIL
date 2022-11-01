package section02.exam02_threadname;

public class ThreadA extends Thread {
	@Override
	public void run() {
		for(int i = 0;i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
			//threadA가 default로 어떤 이름을 가지고 있는지
			Thread threadA = new ThreadA();
			threadA.start();
		}
	}
}
