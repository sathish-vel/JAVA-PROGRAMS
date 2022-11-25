package demo;

interface Vehicle1 {
	public void color(String black);
}

public class AnonymousInterfcaeClassDemo {
	public static void main(String[] args) {
		
		Vehicle1 obj = new Vehicle1() 
			{
			public void color(String black) {
				System.out.println("My bike color is " + black);
			}
		};
		
		obj.color("black");
		
}
}
