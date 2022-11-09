import java.util.Scanner;

class NaturalNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the limit number : ");
		int n = input.nextInt();
		
		System.out.println("The Natural Number are : ");
		for (int i=1; i<=n; i++){
			System.out.println(i);
		}
		
	}
}