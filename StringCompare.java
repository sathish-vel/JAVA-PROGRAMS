package demo;
import java.util.Arrays;
public class StringCompare {
	public static void main(String[] args) {
		String name []= {"sathish","nandha","pravin"};
		System.out.println("Before swapping : "+Arrays.toString(name));
		for (int i = 0; i<name.length;i++) {
			for (int j = i+1; j<name.length;j++) {
				if(name[i].compareTo(name[j])>0) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		System.out.println("After swapping : "+Arrays.toString(name));
	}

}
