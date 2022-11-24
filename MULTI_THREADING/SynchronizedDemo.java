package demo;

class A implements Runnable {
	public synchronized void  run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("hiiiii");
			try {Thread.sleep(700);} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println("end of the loop");
	}
}
public class SynchronizedDemo {
	public static void main(String[] args) {
		Runnable obj = new A();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.start();
		t2.start();
		//wait for the thread to end
		try {t1.join();} catch (InterruptedException e) {e.printStackTrace();}
		try {t2.join();} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("End of the Main method");
	}
}
