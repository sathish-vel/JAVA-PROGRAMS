package demo;

@FunctionalInterface
interface Vehicle3 {
	// abstract method
	void color();

	// default method
	default int speed(int sp) {
		System.out.println("my bike is going in " + sp + " Speed/Km");
		return 0;
	}

	// static method
	static void model() {
		System.out.println("my bike model is R15");
	}
}

public class LambaInterface {

	public static void main(String[] args) {
		Vehicle3 obj = () -> System.out.println("My bike color is black");
		obj.color();
		obj.speed(200);
		Vehicle3.model();

	}

}
