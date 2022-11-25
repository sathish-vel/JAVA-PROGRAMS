package demo;

class Vehicle{
	public void color(String black) {
		System.out.println("My bike color is " +black );
	}
}

public class AnonymousClassDemo1 {

	public static void main(String[] args) {
	Vehicle obj = new Vehicle()
			{//no named class.....it is used to override the method.
			public void color(String black) {
				System.out.println("My brother bike color is " +black );
				}
			};
	obj.color("Black");
	}
}
