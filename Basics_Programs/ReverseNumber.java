import java.util.Scanner;
class ReverseNumber{
	static int reverseNumber(int n,int rev,int rem){
		while(n!=0){
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev;
	}
public static void main(String[] args){
		int rev = 0,rem =0; 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = input.nextInt(); 
		
		int res = reverseNumber(n,rev,rem);
		System.out.println("The Reversed Number is : " +res);
		
}
}