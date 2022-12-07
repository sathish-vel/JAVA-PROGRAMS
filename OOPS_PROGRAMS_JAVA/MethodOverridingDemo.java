package demo;
//method overriding is a multiple method name can have the same same name with same parameter is called method overriding.

//it is used to runtime polymorphism
//it is also known as dynamic polymorphism
//polymorphish is one task perform diffrent ways.
//run time polymorphism wecan achive with is sublclass in other words IS-A relationship

class Students1 {
	public void mark(int a, int b) {
		System.out.println("my marks is : " + a + "," + b);
		System.out.println("printiing the students1 class ");

	}
}

//class Students2 extends Students1 {
//	public void mark(int a, int b) {
//		System.out.println("my marks is : " + a + "," + b);
//		System.out.println("printiing the students2 class ");
//		System.out.println("subclass override the parent class");
//
//	}
//}

public class MethodOverridingDemo {

	public static void main(String[] args) {
//		Students2 myStu = new Students2();
//		myStu.mark(89, 78);
		Students1 myStu = new Students1() {
			public void mark(int a,int b) {
				String res = (a>b) ? ("yes") : ("No") ;
				System.out.println(res);
				System.out.println("my marks is : " + a + "," + b);
				System.out.println("printiing the Annonmyous class ");
				System.out.println("annonmyous inner class is no named class. it is used to overridiing at once ..not required to creating of subclass");
			}
		};
		myStu.mark(89, 78);
		
	}

}















