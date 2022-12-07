package demo;
//what is functional interface?
//Functional interface contain only one Single Abstract Method(SAM) is called "Functional Interface".
//and also it's contain defalut method and static method it's doesn't matter
//we can give @FunctionalInterface annotation.


@FunctionalInterface
interface InterfaceDemo {
	//single abstract method-->doesn't have body...only declaration
	void write();
	//defauult  method-->we can define body in default method in interface
	default void read() {
		System.out.println("iam still reading");
	}
	//static method-->there is no need to create a obj for static method.
	static void slepp() {
		System.out.println("iam still Slepping");
	}
}
public class FunctionalinterfaceDemo {
	public static void main(String[] args) {
	InterfaceDemo obj =()->System.out.println("iam writing about JAVA ");
	obj.write();
	obj.read();
	InterfaceDemo.slepp();
	
	
}
}
