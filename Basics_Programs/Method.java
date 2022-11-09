class Method {
	static int y=10;
	static void m(){ //-->if we are using static keyword that method belongs to "main method" and no need create object for classs
		int x =20;
		System.out.println(x);
	}
	void m1(int n){
		int x =30;
		System.out.println(x + n);
	}
	void m2(String lname){
		String fname = "satz";
		System.out.println(fname + " " +lname);
	}
	int m3(int num){
		return num + 20;
	}
	void m3(int m,int n){
		System.out.println(m+n);
	}
	void m3(String name){
		System.out.println(name);
	}
	 
public static void main(String[] args){
	m();//static method
	Method obj  =  new Method();//creating object for class
	System.out.println(y);
	
//passing the parameters
	obj.m1(20);
	int n =obj.m3(5);
	System.out.println(n);
	
	
	//method overriding::
	//-->multiple method can have the save method name With Diffrent Data Types.
	
	obj.m3("satz");
	obj.m3(10,20);
	System.out.println(obj.m3(50));
	
	
}
}

