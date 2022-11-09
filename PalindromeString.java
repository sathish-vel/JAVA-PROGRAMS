package demo;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "MALAYALAM";
		char arr[] =str.toCharArray(); 
		char newarr[]= new char[arr.length];
		int j = 0,count=0,count_1=0;
		for(int i=arr.length-1;i>=0;i--) {
			newarr[j++]=arr[i];
			count++;
		}
		for(int i=0;i<arr.length;i++){
			if(newarr[i]==arr[i])
				count_1++;
		}
		if (count==count_1)
			System.out.println(str +" is a Palindrome");
		else
			System.out.println(str +" is a Not Palindrome");		
	}
}
