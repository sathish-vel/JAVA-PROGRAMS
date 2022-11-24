//iam using !st `Reduce the line` and using `Annonymous class` and `Lambda Expression`
package demo;

public class ThreadDemo_lamdaExp {
	public static void main(String[] args) {
		//we want to create ``Thread obj`` and passing parameter of Obj..
		//`Annonymous Class` and `Lambda expression`	
		Thread t1 = new Thread(() -> 
		{
			int salArr[] = {1000,2000,3000,4000,5000,6000};
			for (int salary : salArr) {
				System.out.println("Employee_5 salary : "+(4*salary)+"/-");
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			}
		  } );
		Thread t2 = new Thread(()-> 
		{
			int salArr[] = {100,200,300,400,500,600};
			for (int salary : salArr) {
				System.out.println("Employee_6 salary : "+(5*salary)+"/-");
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		   }
		  } );
		
		t1.start();
		t2.start();
		
		try {t1.join();} catch (InterruptedException e) {e.printStackTrace();}
		try {t2.join();} catch (InterruptedException e) {e.printStackTrace();}
		System.err.println("End of the statement....");
		
		
		
		
		
	}
	

}


