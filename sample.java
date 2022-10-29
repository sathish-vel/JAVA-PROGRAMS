import java.util.*;
class Sample{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	//String str = input.nextLine();
	String str = "i got output in this program";
	String arr[] = str.split(" ");
	int newarr[] = new int [arr.length];
	int m=0;
	for (String i : arr){	
		newarr[m++] = i.length();
	}
	for(int i =0; i<arr.length ;i++ ){
			for (int j =i+1; j<arr.length ;j++ ){
				if(newarr[i]>newarr[j]){
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					
					int temp1 = newarr[i];
					newarr[i] = newarr[j];
					newarr[j] = temp1;
				}
			}
	}
	for (int i =0 ;i<arr.length;i++)
		System.out.println(arr[i]);
}
}