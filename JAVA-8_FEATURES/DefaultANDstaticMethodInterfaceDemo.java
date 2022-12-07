package demo;

interface InterfaceDemo1 {
	// single abstract method-->doesn't have body...only declaration
	void write();

	// defauult method-->we can define body in default method in interface
	default void read() {
		System.out.println("iam still reading");
	}

	// static method-->there is no need to create a obj for static method.
	static void slepp() {
		System.out.println("iam still Slepping");
	}
}

public class DefaultANDstaticMethodInterfaceDemo {

	public static void main(String[] args) {
		InterfaceDemo1 obj = () -> System.out.println("iam writing about JAVA ");
		obj.write();
		obj.read();
		InterfaceDemo1.slepp();
	}
}
