package demo;
import java.util.*;

public class String_reverse {
	static void reverse_string(String str){
		int len = str.length()-1;
		
		for(int i=len;i>=0;i--)
			System.out.print(" " +str.charAt(i));
		
		//convert string to char array
		System.out.println();
		char arr[] = str.toCharArray();
		for(int i=len;i>=0;i--)
			System.out.print(" " +arr[i]);
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str= "How are you?" ;
		reverse_string(str);
	

	}

}
