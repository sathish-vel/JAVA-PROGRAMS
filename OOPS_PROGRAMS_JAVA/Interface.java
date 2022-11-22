interface Animal{
	public void method_1();//empty bodies;
	public void method_2();//empty bodies;
}
class dog implements Animal{
	public void method_1(){
		System.out.println("this is the 1st method of interface class");
	}
	public void method_2(){
		System.out.println("this is the 2nd method of interface class");
	}
}

//main class
class Interface{
	//main method
	public static void main(String [] args){
		dog mydog = new dog();
		
		mydog.method_1();
		mydog.method_2();
	}
}