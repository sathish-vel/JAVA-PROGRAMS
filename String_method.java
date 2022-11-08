package demo;

public class String_method {

	public static void main(String[] args) {
		String str = new String("sathish ");
		System.out.println(str);

		// Returns the character at the specified index (position)
		System.out.println(str.charAt(0));

		// Compares two strings
		String str1 = "Hello";
		String str2 = "hello";

		System.out.println(str1.compareTo(str2));

		// Compares two strings ignoring case differences
		System.out.println(str1.compareToIgnoreCase(str2));

		// Appends a string to the end of another string
		System.out.println(str1.concat(str));

		// Checks whether a string contains a sequence of characters
		System.out.println(str.contains("sa"));

		// Returns a String that represents the characters of the character array
		char[] ch = { 'a', 'e', 'i', 'o', 'u' };
		String str3 = " ";
		str3 = str3.copyValueOf(ch, 0, 3);
		System.out.println(str3);

		// Compare strings to find out if they are equal:
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));

		// The java string format() method returns the formatted string by given locale,
		// format and argument
		String name = "satz";
		int age = 21;
		String result = String.format("my name is %s and my age is %d", name, age);
		System.out.println(result);

		// Checks whether a string starts with specified characters
		String str4 = "good afternoon";
		System.out.println(str4.startsWith("goo"));
		System.out.println(str4.startsWith("o"));
		System.out.println(str4.startsWith("aft"));

		// Checks whether a string ends with specified characters
		System.out.println(str4.endsWith("goo"));
		System.out.println(str4.endsWith("o"));
		System.out.println(str4.endsWith("noon"));

		// Returns a new string which is the substring of a specified string
		System.out.println(str4.substring(1));
		System.out.println(str4.substring(1, 8));
		System.out.println(str4.substring(0));

		// Returns the string representation of the specified value
		int a = 100;
		String result1 = String.valueOf(a);
		System.out.println(result1 + 1);

	}

}
