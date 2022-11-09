class Second{
	int x;
	int y;
	static int z = 50;
	//constructor:::when using class name name method name as is it same we call constructor and 
	//does not have return value like (void).
	Second(){
		x = 10;
		y = 20;	
	}
	public static void method(){
		System.out.println(z);
	}
	public static void main(String [] args){
		Input obj = new Input();
		Second obj1 = new Second();
		System.out.println(obj.z);
		obj.integer();
		obj.index();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		method();
		
	}
} 