package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForEachMethodDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 10; i++)
			list.add(i);
		// iterating by foEach method with lambada
		list.forEach(n -> System.out.println(n));// lambda expresion in ForEach method
		// iterating by foEach method with lambada and conditions
		list.forEach(n -> {
			String res = (n == 0 || n == 2 || n == 4 || n == 6 || n == 8 || n == 10) ? "yes this is Even number"
					: "yes this is Odd number";
			System.out.println(res);
		});
		Collections.reverse(list);
		list.forEach(System.out::println);// method reference
	}
}