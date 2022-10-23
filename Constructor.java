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
-->special method 
-->same name as the class
-->immediately called when the object is created
-->no return type