import java.util.Scanner;

class Factorial{
	
	static int factorial(int num){
		int fact = 1;
		
		for (int i =1; i <= num; i++){
			fact*=i;
		}
		return fact;
	} 
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = input.nextInt(); 
		
		int res = factorial(num);
		
		System.out.println("The Factorial number of "+num +" is "+res);
	}
}