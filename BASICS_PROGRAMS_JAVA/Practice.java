import java.util.Scanner;
class Practice{
	
		
	public static void main(String [] args){
			//getting integer input array from user
	Scanner input = new Scanner(System.in);
	int array[]=new int[5];
	for (int i=0; i<5; i++){
		array[i]=input.nextInt();
	}
	for (int i : array){
		System.out.println(i);
	}
		
	}
}