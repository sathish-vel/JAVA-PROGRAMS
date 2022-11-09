abstract class Animal{   //abstract class must be declare abstract key word
	//method doesn't have body	
	public abstract void method1();//if you using abstract method dont give method body
}

class Dog extends Animal{
	public void method1(){
		System.out.println("this is method_1 body of abtract method");
	}
}

class Abstraction{
	public static void main(String [] args){
		Dog mydog = new Dog();
		mydog.method1();
}
}