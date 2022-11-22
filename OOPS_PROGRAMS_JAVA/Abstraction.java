//Abstract class cannot be create object.....
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
/*
Data abstraction is the process of hiding certain details and showing only essential information to the user.

Abstraction can be achieved with either "abstract classes" or "interfaces" (which you will learn more about in the next chapter).

The abstract keyword is a " non-access modifier ", used for "classes" and " methods " :

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:

To access the abstract class, it must be inherited from another class. Let's convert the Animal class we used in the Polymorphism chapter to an abstract class:

Why And When To Use Abstract Classes and Methods?
To achieve security - hide certain details and only show the important details of an object.

Note: Abstraction can also be achieved with Interfaces, which you will learn more about in the next chapter.


*/