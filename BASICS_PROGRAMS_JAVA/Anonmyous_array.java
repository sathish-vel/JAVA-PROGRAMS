class Anonmyous_array{
	static void intarray(int a []){
		for(int i : a)
			System.out.print("  " +i);
	}
	static void stringarray(String a []){
		for(String i : a)
			System.out.print("  " +i);
	}
	static void chararray(char a []){
		for(char i : a)
			System.out.print("  " +i);
	}
	public static void main(String [] args){
		intarray(new int [] {1,2,3,4,5});
		stringarray(new String [] {"satz","roman","captain"});
		chararray(new char [] {'a','b','c'});
	}
}