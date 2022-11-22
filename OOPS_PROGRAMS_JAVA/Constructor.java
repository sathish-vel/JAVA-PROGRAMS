/*
A constructor in Java is a special method that is used to initialize objects. 
The constructor is called when an object of a class is created. It can be used to 
set initial values for object attributes:

*/
public class Constructor{
	int a,b,c;
	String name;
	
	Constructor(int x, int y,int z,String n){ //constroctor
		a=x;
		b=y;
		c=z;
		name=n;
	}
	
	public static void main(String[] args){
		Constructor con = new Constructor(1,2,3,"satz");
		System.out.println(con.a);	
}
}
/*	-->special method 
	-->same name as the class
	-->immediately called when the object is created
	-->no return type   */	
	
/*
Note that the constructor name must match the class name, and
 it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself,
 Java creates one for you. However, then you are not able to set initial values for 
 object attributes.

*/	