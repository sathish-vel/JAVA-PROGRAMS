

/*Why And When To Use "Inheritance"?
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.*/
class One { //super class, base class, parent class
	int a;
	public void method_1(int a){
		this.a=a;
		System.out.println("this the first Method_1 ");
	}
}
class Two extends One{ //sub class, derived class, child class
	public void method_2(){
		System.out.println("this the first Method_2");
	}
}class Three extends One{
	public void method_3(){
		System.out.println("this the first Method_3");
	}
}


class Inheritance{
	public static void main(String [] args){
		Two obj = new Two();
		Three obj2 = new Three();
		
		obj.method_1(2);
		obj2.method_3();
		System.out.println(obj.a);
		
	}
}