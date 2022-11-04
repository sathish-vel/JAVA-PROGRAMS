/*
 				-----DECLARATION AND ACCESS CONTROL-----
THERE ARE FOUR NON-STATIC MEMBER : 
	1.non-static variable.
	2.non-static block.
	3.non-static method.
	4.Constructor.
  
 */
package demo;

public class Test_1 {
	//NON-STATIC VARIABLE
	int a = 10;
	int b = 20;
	
	int m = m();
	String name;
	int age;
	int roll_no;
	
	//CONSTRUCTOR
	public Test_1(String name, int age, int roll_no) {
		super();
		this.name = name;
		this.age = age;
		this.roll_no = roll_no;
	}
	//GETTER AND SETTER METHOD
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", roll_no=" + roll_no + "]";
	}

	//NON-STATIC BLOCK
	 {System.out.println("NON-STATIC BLOCK");}
	 
	//NON-STATIC METHOD
	 void method_1() {
		 System.out.println("NON-STATIC METHOD ");
	 }
	 int m() {
		 method_1();
		 System.out.println("NON-STATIC METHOD VARIABLE ");
		 return 0;
	 }

	public static void main(String[] args) {
		Test_1 obj = new Test_1("satz",21,123);
		String result=obj.toString();
		System.out.println(result);
		
		Test_1 obj1 = new Test_1("roman",51,619);
		String result1=obj1.toString();
		System.out.println(result1);
		
		obj.setName("captain");
		obj.setAge(21);
		obj.setRoll_no(1234);
		String name=obj.getName();
		int age = obj.getAge();
		int roll_no = obj.getRoll_no();
		System.out.println("me new name is " +name +" my new age " +age + " my new roll no is " +roll_no );
		
	}

}
