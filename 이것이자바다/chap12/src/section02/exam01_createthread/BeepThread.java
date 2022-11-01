package section02.exam01_createthread;

import java.awt.Toolkit;

public class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch(Exception e) {} 	
			//thread가 0.5초간 쉬었다가 다시 실행
		}
	}
}
