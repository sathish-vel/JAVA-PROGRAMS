package demo;

class Employee1 extends Thread{
	int salArr[] = {1000,2000,3000,4000,5000,6000};
	public void run() {
		for (int salary : salArr) {
			System.out.println("Employee_1 salary : "+(2*salary)+"/-");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

class Employee2 extends Thread{
	int salArr[] = {100,200,300,400,500,600};
	public void run() {
		for (int salary : salArr) {
			System.out.println("Employee_2 salary : "+(2*salary)+"/-");
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}	
}

public class ThreadDemo {
	public static void main(String[] args) {
		Employee1 myEmp1 = new Employee1();
		Employee2 myEmp2 = new Employee2();
		
		//myEmp1.run();//it will print 1st	
		//myEmp2.run();//it will print after completing Employee1 class....	
		
		myEmp1.start();
		myEmp2.start();
		
		try {myEmp1.join();} catch (InterruptedException e) {e.printStackTrace();}
		try {myEmp2.join();} catch (InterruptedException e) {e.printStackTrace();}
		System.err.println("End of the statement....");
	}
}
