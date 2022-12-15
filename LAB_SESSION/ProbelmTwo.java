package labSession;

import java.util.*;

public class ProbelmTwo {
	String country = "America";
	String str = new String(country);

	public void storeCountryNames(Set<String> set) {

		for (String s : set) {
			if (s.equals(str)) {
				System.out.println(s + " is there");
				break;
			} else
				System.out.println("NULL");
		}
	}

	public static void main(String[] args) {
		ProbelmTwo obj = new ProbelmTwo();

		Set<String> set = new HashSet<>();
		set.add("india");
		set.add("USA");
		set.add("China");
		System.out.println("The Total Country are : " + set);

		obj.storeCountryNames(set);
	}
}
