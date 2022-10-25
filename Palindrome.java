import java.util.Scanner;

class Palindrome{
	
	static int palindrome(int num){
		int rev = 0,rem =0; 
		while(num!=0){
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
		
	} 
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = input.nextInt(); 
		
		int res = palindrome(num);
		
		String result = (res == num)? "is a Palindrome" : "is not a palindrome";
		System.out.println(num +" "+result);
		
		
	}
}