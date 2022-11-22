import java.util.Scanner;
import java.util.Arrays;
class FindMin {
	static void findmin(int array[]){
		int len = array.length;
		int a = array[0];
		for (int i =1; i<len ;i++ ){
			if(a>array[i]){
				a=array[i];
			}
		}
		System.out.println("Minimum Element in the Array is : "+a);	
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
	findmin(array);//calling findmin method
	
	

}

}