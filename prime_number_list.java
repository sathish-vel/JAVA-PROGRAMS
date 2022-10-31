import java.util.Arrays;

class prime_number_list{


public static void main(String args[]){
    int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	System.out.println("Original Arrays : "+Arrays.toString(arr));
    for (int i =0;i<arr.length;i++){
		int count =0 ; 
        for(int j =1 ;j<=arr[i];j++){
			if(arr[i] % j == 0){
				count++;
			}
		}
		if(count==2){
			System.out.println(arr[i] +" is a Prime Number");
		}
    }
}
}