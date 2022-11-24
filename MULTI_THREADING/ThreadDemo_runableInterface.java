package demo;

class Employee3 implements Runnable{
	int salArr[] = {1000,2000,3000,4000,5000,6000};
	public void run() {
		for (int salary : salArr) {
			System.out.println("Employee_3 salary : "+(3*salary)+"/-");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

class Employee4 implements Runnable{
	int salArr[] = {100,200,300,400,500,600};
	public void run() {
		for (int salary : salArr) {
			System.out.println("Employee_4 salary : "+(3*salary)+"/-");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}	
}
public class ThreadDemo_runableInterface {

	public static void main(String[] args) {
		Runnable myEmp3 = new Employee3(); //creating obj for `Runnable interFace`
		Runnable myEmp4 = new Employee4(); //creating obj for `Runnable interFace`
		//myEmp3.run();//it will print 1st	
		//myEmp4.run();//it will print after completing Employee1 class....	
		
		//we want to create ``Thread obj`` and passing parameter of Obj..
		Thread t1 = new Thread(myEmp3);
		Thread t2 = new Thread(myEmp4);
		
		t1.start();
		t2.start();
		
		try {t1.join();} catch (InterruptedException e) {e.printStackTrace();}
		try {t2.join();} catch (InterruptedException e) {e.printStackTrace();}
		System.err.println("End of the statement....");
	}

}
