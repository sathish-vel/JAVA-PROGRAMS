import java.util.Scanner;

class PrimeAndOddorEven{
	static void prime(int n){
		int count = 0; 
		for (int i =1; i<=n; i++){
			if(n % i==0) 
				count++;
			
		}
		if (count == 2)
				System.out.println("It is a Prime Number");
		else 
				System.out.println("It is not a Prime Number");	
	}
	static void oddoreven(int n){
		if (n % 2 == 0)
			System.out.println("It is Even Number");	
		else
			System.out.println("It is Odd Number");	
	}
		

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("\t |1.Find The Prime Number      | ");
		System.out.println("\t |2.Find The Odd or Even Number|  ");
		
		
		System.out.println("Enter the above list number You want to Find: ");
		int num = input.nextInt(); 
		
		if(num == 1){
			System.out.println("\t you choosing Prime Number ");
			System.out.println("Enter the number : ");
			int n = input.nextInt(); 
			prime(n);
		}
		else if(num == 2){
			System.out.println("\t you choosing Odd or Even Number ");
			System.out.println("Enter the number : ");
			int n = input.nextInt(); 
			oddoreven(n);
		}	
		else
			System.out.println("please Enter the Correct Number");
		
		
		
		
}
}