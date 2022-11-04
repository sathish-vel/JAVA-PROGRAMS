/*
 				-----DECLARATION AND ACCESS CONTROL-----
THERE ARE THE FOUR STATIC MEMBER : 
	1.static variable.
	2.static block.
	3.static method.
	4.main method.
  
 */
package demo;

public class Test {
	//STATIC VARIABLES:
	static String name = "satz";
	static int age = 21;
	
	static int x =method_2();//STATIC VARIABLE "1ST PREFRENCE"

	static int method_2() {
		method_1();//"2ND PREFRENCE"
		System.out.println("METHOD_2");
		return 0;
	}
	static {
		System.out.println("STATIC BLOCK");//STATIC BLOCK "3RD PREFRENCE"
	} 
	static void method_1() {
		System.out.println("METHOD_ONE");//NORMAL METHOD
	}
	static void method_3() {
		System.out.println("METHOD_THREE");//NORMAL METHOD
	}
	

	public static void main(String[] args) {
		method_3();//4TH PREFENCE
		System.out.println("iam " + name +" my age is " +age );
		
	}

}
