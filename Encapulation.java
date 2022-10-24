/*Encapsulation
-->The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

-->declare class variables/attributes as private
-->provide public get and set methods to access and update the value of a private variable*/



public class Encapulation{
	private String name;
	private int num;
	
	void set(String str,int number){
		this.name = str;
		this.num=number;
	}
	String get(){
		return name;
	}
	int getnum(){
		return num;
	}

	
	public static void main (String[] args){
		Encapulation obj = new Encapulation();
		obj.set("satz" ,21);
		System.out.println(obj.get());
		System.out.println(obj.getnum());
		
		
	}
}
/*The get method returns the value of the variable name.

The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer to the current object.

However, as the name variable is declared as private, we cannot access it from outside this class:*/




/*Why Encapsulation?

Better control of class attributes and methods

Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)

Flexible: the programmer can change one part of the code without affecting other parts

Increased security of data*/
