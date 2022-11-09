import java.util.Scanner;
import java.util.Arrays;
class Descending {
	static void descending(int array[]){
		int len = array.length;
		System.out.println("Original Array is   : "+Arrays.toString(array));	//printing original array
		for (int i =0; i<len ;i++ ){
			for (int j =i+1; j<len ;j++ ){
			if(array[i]<array[j]){
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		 }
		}
		
		System.out.println("Descending Order    : "+Arrays.toString(array));	//printing descending order
	}
public static void main(String ar[]) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the Array Size : ");
	int size = input.nextInt(); 
	int array[] = new int[size];
	
	System.out.println("Enter the Value : ");
	for (int i =0; i<size ;i++ ){
		array[i] = input.nextInt();
	}
	descending(array);//calling descending method
	
	

}

}