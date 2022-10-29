import java.util.*;
class StringRevandsort{
	public static void main(String [] args){
		Scanner input= new Scanner(System.in);
		//String str ="how are u all";
		String str = input.nextLine();
		String str1 =str.replaceAll("\\s+", "");  //this line for removing whiteSpaces
		char array[] = str1.toCharArray(); //converting string into character array

		System.out.println("original string :\n"+str);	

		System.out.println("After reversing the string :");		
		for (int i =array.length-1; i>=0 ;i-- )
			System.out.print(" "+array[i]);
	
		for (int i =0; i<array.length ;i++ ){
			for (int j =i+1; j<array.length ;j++ ){
			if((int)array[i]>(int)array[j]){
				int temp = array[i];
				array[i] = array[j];
				array[j] = (char)temp;
			}}}
			
		System.out.println("\n After sorting the String : ");
		for (int i =0; i<array.length ;i++ )
			System.out.print(" "+array[i]);
		
	}
}