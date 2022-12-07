package demo;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		String str[] = new String[10];
		// System.out.println(str[5].toLowerCase());//it will throws an errors.....
		//str[5] = "iam satz";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent())
			System.out.println(str[5].toUpperCase());
		else
			System.out.println("there is no value is array");
	}
}
